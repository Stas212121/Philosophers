package com.example.Philosophers.Begin;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Html;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.example.Philosophers.Philosophers.EditThemesActivity;
import com.example.Philosophers.Philosophers.ExitFromApp;
import com.example.Philosophers.Philosophers.Fragment_Show_Record;
import com.example.Philosophers.Philosophers.Fragmet_Add_Records;
import com.example.Philosophers.Philosophers.Fragmet_Contact;
import com.example.Philosophers.Philosophers.Fragmet_Exit;
import com.example.Philosophers.Philosophers.Fragmet_Home;
import com.example.Philosophers.Philosophers.SearchActivity;
import com.example.Philosophers.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;




public class MainActivity extends AppCompatActivity {

    Intent intent;
    private Menu menu;
    private View view;
    /////////////////////////////////////////Важно//////////////////////////////////////////////////////

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /////////////////////////////////////////////////////////////////////////////////////////////////////////

        setupActionBar();

        /////////////////////////////////////////////////////////////////////////////////////////////////////////

        BottomNavigationView bottomNav_bottom;
        bottomNav_bottom = findViewById(R.id.navigation_bottom);
        bottomNav_bottom.setOnNavigationItemSelectedListener(navListener);
        //bottomNav_bottom.setItemBackground(ContextCompat.getDrawable(this, R.drawable.gradientone))
        bottomNav_bottom.getMenu().findItem(R.id.navigation_bottom_item_one).setChecked(true);
        bottomNav_bottom.findViewById(R.id.navigation_bottom_item_one).setVisibility(View.GONE);

        /////////////////////////////////////////////////////////////////////////////////////////////////////////
      if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                    new Fragmet_Home()).commit();
        }
     }

 /////////////////////////////////////////////////////////////////////////////////////////////////////////
    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    Fragment selectedFragment = null;

                    switch (item.getItemId()) {
                        case R.id.navigation_bottom_item_one:
                            selectedFragment = new Fragmet_Home();
                            break;

                        case R.id.navigation_bottom_item_two:
                            selectedFragment = new Fragmet_Add_Records();
                            break;

                        case R.id.navigation_bottom_item_show_records:
                            selectedFragment = new Fragment_Show_Record();
                            break;

                        case R.id.navigation_bottom_item_mail:
                            selectedFragment = new Fragmet_Contact();
                            break;
                        case R.id.navigation_bottom_item_exit:
                            selectedFragment = new Fragmet_Exit();
                            break;

                    }
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                            selectedFragment).commit();

                    return true;
                }
            };
    ///////////////////////////////////////////////////////////////////////////////////////////////////////
    public void setupActionBar() {
        ActionBar actionBar = getSupportActionBar();
        //actionBar.setTitle("Философы и цитаты ");
        actionBar.setTitle(R.string.action_bar_main);

        actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#6D8FF0")));
//       actionBar.setLogo(R.mipmap.ic_launcher);
//        actionBar.setDisplayUseLogoEnabled(true);

        if (actionBar != null) {
        }
    }
    ///////////////////////////////////////////////////////////////////////////////////////////////////////
    @Override
    public boolean onCreateOptionsMenu(android.view.Menu menu) {
        getMenuInflater().inflate(R.menu.navigation_hige, menu);

        MenuItem item_theme = menu.findItem(R.id.edit_theme).setTitle(Html.fromHtml("<font color='#FFFFFF'>Темы</font>"));
        MenuItem item_exit = menu.findItem(R.id.exit).setTitle(Html.fromHtml("<font color='#FFFFFF'>Выход</font>"));


        return true;
    }
    ///////////////////////////////////////////////////////////////////////////////////////////////////////
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
   /////////////////////////////////////////////////////////////////////////////////////////////////////////
}