package com.example.Philosophers.Philosophers;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.Html;
import android.text.TextWatcher;
import android.view.MenuItem;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import com.example.Philosophers.R;
import com.example.Philosophers.Begin.ShowAnimation;

import java.util.ArrayList;



public class SearchActivity extends AppCompatActivity {
    //ListView Адаптер:
    ArrayAdapter<String> adapter;
    //Поиск EditText
    EditText inputSearch;
    Intent intent;
    //Строковый массив
    ArrayList<String> words;
    private ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        setupActionBar();
        /////////////////////////////////////////Важно//////////////////////////////////////////////////////

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        //Данные для ListView:
/////////////////////////////////////////////////////////////////////////////////////////////////////
        final TextView textViewonetext;
        textViewonetext = findViewById(R.id.onetext);
/////////////////////////////////////////////////////////////////////////////////////////////////////
        final TextView textViewtwotext;
        textViewtwotext = findViewById(R.id.twotext);
/////////////////////////////////////////////////////////////////////////////////////////////////////

        /////////////////////////////////////////////////////////////////////////////////////////////////////
        /////////////////////////////////////////////////////////////////////////////////////////////////////
        ShowAnimation.doAnimScale(textViewonetext, this, R.anim.scale_standart);
/////////////////////////////////////////////////////////////////////////////////////////////////////
        /////////////////////////////////////////////////////////////////////////////////////////////////////


        ShowAnimation.doAnimScale(textViewtwotext, this, R.anim.scale_standart);
/////////////////////////////////////////////////////////////////////////////////////////////////////

// ///////////////////////////////////////////////////////////////////////////////////////////////////


        LinearLayout linearLayout;
        linearLayout = findViewById(R.id.LinearLayoutSEARCHcitat);
        //int color = Integer.parseInt(String.valueOf(R.color.colorPrimaryone), 16)+0xFF000000;

        int myColor_one = ContextCompat.getColor(this, R.color.colorPrimaryone);
        int myColor_two = ContextCompat.getColor(this, R.color.colorPrimarytwo);

        ShowAnimation.ShowAnimColor(linearLayout, myColor_one, myColor_two, "backgroundColor", 0, 2000);
        TextView textshowRecords = findViewById(R.id.textSearchRecords);
        ShowAnimation.doAnimScale(textshowRecords, this, R.anim.scale);


        DbHandler db = new DbHandler(this);
        ArrayList<String> records = db.GetRecords();


        String[] strings = records.toArray(new String[0]);
        //String[] stringsa =  DataInfo.Parmenid;


        //String[] both = (String[]) ArrayUtils.appendToArray(strings, stringsa);


        lv = (ListView) findViewById(R.id.list_view_search);
        inputSearch = (EditText) findViewById(R.id.inputSearch);
        //Связываем данные массива с элементом ListView:

        Animation animm;
        animm = AnimationUtils.loadAnimation(this, R.anim.scale_basic);
        lv.startAnimation(animm);


        //adapter = new ArrayAdapter<String>(this, R.layout.maket_search_activity, R.id.textViewSearchRecords, strings);
        //lv.setAdapter(adapter);


        adapter = new ArrayAdapter<String>(this, R.layout.maket_search_activity, R.id.textViewSearchRecords, AllInfo.AllInfo);
        lv.setAdapter(adapter);
        //adapter = new ArrayAdapter<String>(this, R.layout.maket_search_activity, R.id.textViewSearchRecords, DataInfo.Aristotelone);
        //lv.setAdapter(adapter);


        inputSearch.addTextChangedListener(new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence cs, int arg1, int arg2, int arg3) {
                //Когда пользователь вводит какой-нибудь текст:
                SearchActivity.this.adapter.getFilter().filter(cs);
            }

            @Override
            public void beforeTextChanged(CharSequence arg0, int arg1, int arg2,
                                          int arg3) {
            }

            @Override
            public void afterTextChanged(Editable arg0) {
            }
        });
    }

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
