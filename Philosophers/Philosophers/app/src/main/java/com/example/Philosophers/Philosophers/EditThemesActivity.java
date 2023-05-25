package com.example.Philosophers.Philosophers;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Html;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import com.example.Philosophers.R;
import com.example.Philosophers.Begin.ShowAnimation;


public class EditThemesActivity extends AppCompatActivity {
    ImageButton button_one, button_two, button_three, button_four, button_five;
    Intent intent;
    LinearLayout linearLayouttextarray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_themes);


        setupActionBar();
        /////////////////////////////////////////Важно//////////////////////////////////////////////////////

        LinearLayout linearLayout;
        linearLayout = findViewById(R.id.layout_themes);
        //int color = Integer.parseInt(String.valueOf(R.color.colorPrimaryone), 16)+0xFF000000;

        int myColor_one = ContextCompat.getColor(this, R.color.colorPrimaryone);
        int myColor_two = ContextCompat.getColor(this, R.color.colorPrimarytwo);


        ShowAnimation.ShowAnimColor(linearLayout, myColor_one, myColor_two, "backgroundColor", 0, 2000);
//        linearLayout = view.findViewById(R.id.vieww);
//        linearLayout.setVisibility(View.INVISIBLE);
//        view.findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if(!opened){
//                    linearLayout.setVisibility(View.VISIBLE);
//                    TranslateAnimation animate = new TranslateAnimation(
//                            0,
//                            0,
//                            linearLayout.getHeight(),
//                            0);
//                    animate.setDuration(500);
//                    animate.setFillAfter(true);
//                    linearLayout.startAnimation(animate);
//                }
//                else {
//                    linearLayout.setVisibility(View.INVISIBLE);
//                    TranslateAnimation animate = new TranslateAnimation(
//                            0,
//                            0,
//                            0,
//                            linearLayout.getHeight());
//                    animate.setDuration(500);
//                    animate.setFillAfter(true);
//                    linearLayout.startAnimation(animate);
//                }
//                opened = !opened;
//            }
//        });


        TextView textshowRecords = findViewById(R.id.themetitle);
        ShowAnimation.doAnimScale(textshowRecords, this, R.anim.scale);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);


        setupActionBar();
        /////////////////////////////////////////Важно//////////////////////////////////////////////////
        /////////////////////////////////////////////////////////////////////////////////////////////////////
        /////////////////////////////////////////////////////////////////////////////////////////////////////

        final TextView textViewonetext;
        textViewonetext = findViewById(R.id.onetext);
        final TextView textViewtwotext;
        textViewtwotext = findViewById(R.id.twotext);
        final TextView textViewthreetext;
        textViewthreetext = findViewById(R.id.threetext);
        ShowAnimation.doAnimScale(textViewonetext, this, R.anim.scale_standart);
/////////////////////////////////////////////////////////////////////////////////////////////////////
        /////////////////////////////////////////////////////////////////////////////////////////////////////


        ShowAnimation.doAnimScale(textViewtwotext, this, R.anim.scale_standart);
/////////////////////////////////////////////////////////////////////////////////////////////////////
        /////////////////////////////////////////////////////////////////////////////////////////////////////


        ShowAnimation.doAnimScale(textViewthreetext, this, R.anim.scale_standart);
/////////////////////////////////////////////////////////////////////////////////////////////////////


        button_one = (ImageButton) findViewById(R.id.button_one);
        button_one.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {

                DataInfo.AlertDialogShow(EditThemesActivity.this, "<font color='#E74848'>.</font>",
                        "<font color='#FFFFFF'>Раздел в состоянии разработки</font>",
                        "ОК ");

            }


        });

        button_two = (ImageButton) findViewById(R.id.button_two);
        button_two.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {

                DataInfo.AlertDialogShow(EditThemesActivity.this, "<font color='#E74848'>. </font>",
                        "<font color='#FFFFFF'>Раздел в состоянии разработки</font>",
                        "ОК ");

            }


        });
        button_three = (ImageButton) findViewById(R.id.button_three);
        button_three.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {

                DataInfo.AlertDialogShow(EditThemesActivity.this, "<font color='#E74848'>. </font>",
                        "<font color='#FFFFFF'>Раздел в состоянии разработки</font>",
                        "ОК ");

            }


        });

        button_four = (ImageButton) findViewById(R.id.button_four);
        button_four.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {

                DataInfo.AlertDialogShow(EditThemesActivity.this, "<font color='#E74848'>. </font>",
                        "<font color='#FFFFFF'>Раздел в состоянии разработки</font>",
                        "ОК ");

            }


        });

        button_five = (ImageButton) findViewById(R.id.button_five);
        button_five.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {

                DataInfo.AlertDialogShow(EditThemesActivity.this, "<font color='#E74848'>. </font>",
                        "<font color='#FFFFFF'>Раздел в состоянии разработки.</font>",
                        "ОК ");

            }


        });
    }


    /////////////////////////////////////////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////////////////////////////////////////
    private void setupActionBar() {
        ActionBar actionBar = getSupportActionBar();
        //actionBar.setTitle("Философы и цитаты ");
        actionBar.setTitle(R.string.action_bar_main);

        actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#6D8FF0")));
        //actionBar.setLogo(R.drawable.gradientone);
        //actionBar.setDisplayUseLogoEnabled(true);

        if (actionBar != null) {
            // Show the Up button in the action bar.
            //actionBar.setDisplayHomeAsUpEnabled(true);

        }
    }

//    public void exitAppCLICK (View view) {
//
//        finishAffinity();
//        System.exit(0);
//
//    }
    /////////////////////////////////////////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////////////////////////////////////////
    //////////////////////////////////////////Create HIGH NAVIGATION BAR/////////////////////////////////////


    @Override
    public boolean onCreateOptionsMenu(android.view.Menu menu) {

        getMenuInflater().inflate(R.menu.navigation_hige, menu);

//        MenuItem item =  menu.findItem(R.id.settings);
//        SpannableString s = new SpannableString(item.getTitle());
//        s.setSpan(new ForegroundColorSpan(ContextCompat.getColor(getApplicationContext(), R.color.white)), 0, s.length(), 0);
//
//        item.setTitle(s);

        MenuItem item_theme = menu.findItem(R.id.edit_theme).setTitle(Html.fromHtml("<font color='#FFFFFF'>Темы</font>"));
        MenuItem item_exit = menu.findItem(R.id.exit).setTitle(Html.fromHtml("<font color='#FFFFFF'>Выход</font>"));

        //menu.add(1, 1, 0, "Menu1");
        //menu.add(1, 1, 0, "Menu2");

        return true;
    }


    /////////////////////////////////////////////////////////////////////////////////////////////////////////


    /////////////////////////////////////////////////////////////////////////////////////////////////////////

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle presses on the action bar items
        switch (item.getItemId()) {
            case R.id.edit_search:
                intent = new Intent(this, SearchActivity.class);
                startActivity(intent);
                return true;
            case R.id.edit_theme:
                intent = new Intent(this, EditThemesActivity.class);
                startActivity(intent);
                return true;
            case R.id.exit:
                intent = new Intent(this, ExitFromApp.class);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
    /////////////////////////////////////////Важно//////////////////////////////////////////////////////


}
