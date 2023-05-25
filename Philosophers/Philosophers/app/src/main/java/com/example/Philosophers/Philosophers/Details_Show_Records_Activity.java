package com.example.Philosophers.Philosophers;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Html;
import android.view.MenuItem;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import com.example.Philosophers.Begin.MainActivity;
import com.example.Philosophers.R;
import com.example.Philosophers.Begin.ShowAnimation;

import java.util.ArrayList;



public class Details_Show_Records_Activity extends AppCompatActivity {
    ArrayList<DisplayShow> productsshow = new ArrayList();
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_records);

        ////////////////////////////////////////////Кнопка назад////////////////////////////////////
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);

        setupActionBar();
        ///////////////////////////////////////Важно//////////////////////////////////////////////////////


        TextView tv1 = findViewById(R.id.textviewtitledetailsrecords);
        ShowAnimation.doAnimScale(tv1, this, R.anim.scale);


        LinearLayout linearLayout;
        linearLayout = findViewById(R.id.LinearLayoutdetailsRecords);
        int myColor_one = ContextCompat.getColor(this, R.color.colorPrimaryone);
        int myColor_two = ContextCompat.getColor(this, R.color.colorPrimarytwo);


        ShowAnimation.ShowAnimColor(linearLayout, myColor_one, myColor_two, "backgroundColor", 0, 2000);


        DbHandler db = new DbHandler(this);


        ListView lv;

        ArrayList<String> records = db.GetRecords();
        if (productsshow.size() == 0) {
            for (int count = 0; count < records.size(); count++) {
                productsshow.add(new DisplayShow(records.get(count)));
            }
        }

        if (productsshow.size() == 0) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle(Html.fromHtml("<font color='#E74848'>.</font>"))
                    .setMessage(Html.fromHtml("<font color='#FFFFFF'>Список пуст!</font>"))
                    .setIcon(R.drawable.ic_warning_black_24dp)
                    .setCancelable(false)
                    .setNegativeButton("ОК ",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int id) {

                                    intent = new Intent(getApplicationContext(), MainActivity.class);
                                    startActivity(intent);

                                }
                            });
            AlertDialog alert = builder.create();

            Window vieww = ((AlertDialog) alert).getWindow();
            //vieww.setBackgroundDrawableResource(R.drawable.bg_alert_dialogs);
            vieww.setBackgroundDrawableResource(R.drawable.bg_alert_toast_style);
            alert.show();
        }


        lv = (ListView) findViewById(R.id.list_view_details_records);
        DisplayShowRecordsAdapter recrds_adapter = new DisplayShowRecordsAdapter(this, R.layout.maket_show_details_records, productsshow);
        lv.setAdapter(recrds_adapter);

    }

    /////////////////////////////////////////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////////////////////////////////////////
    private void setupActionBar() {
        ActionBar actionBar = getSupportActionBar();
        //actionBar.setTitle("Философы и цитаты ");
        actionBar.setTitle(R.string.action_bar_main);

        actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#6D8FF0")));
//       actionBar.setLogo(R.mipmap.ic_launcher);
//        actionBar.setDisplayUseLogoEnabled(true);

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
    /////////////////////////////////////////////////////////////////////////////////////////////////////////
}
