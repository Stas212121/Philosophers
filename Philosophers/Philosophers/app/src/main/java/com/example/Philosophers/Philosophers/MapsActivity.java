package com.example.Philosophers.Philosophers;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.widget.SwitchCompat;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentActivity;

import com.example.Philosophers.R;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MapStyleOptions;
import com.google.android.gms.maps.model.MarkerOptions;



public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {
    DataInfo dataInfo = new DataInfo();
    GoogleMap PlaseMap;
    SwitchCompat switchCompat;
    TextView textViewTitleMapone, textViewTitleMaptwo;
    LatLng Coordinate;
    Intent intent;
    private int positionOfClickOnListPhilosof = 12;
    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);

        Intent intentcat = getIntent();
        positionOfClickOnListPhilosof = intentcat.getExtras().getInt("Pos");

        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle(getResources().getString(R.string.app_name));
        toolbar.inflateMenu(R.menu.navigation_hige);

        toolbar.setNavigationIcon(R.drawable.ic_arrow_back_black_24dp);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });


        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {

            @Override
            public boolean onMenuItemClick(MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.edit_search:
                        intent = new Intent(MapsActivity.this, SearchActivity.class);
                        startActivity(intent);
                        return true;
                    case R.id.edit_theme:
                        intent = new Intent(MapsActivity.this, EditThemesActivity.class);
                        startActivity(intent);
                        return true;
                    case R.id.exit:
                        intent = new Intent(MapsActivity.this, ExitFromApp.class);
                        startActivity(intent);
                        return true;
                }
                return false;
            }

        });

        switchCompat = findViewById(R.id.switchCompat);
        textViewTitleMapone = findViewById(R.id.textViewTitleMapone);
        textViewTitleMaptwo = findViewById(R.id.textViewTitleMaptwo);

        textViewTitleMapone.setText("     Место рождения философа на карте: ");
        textViewTitleMaptwo.setText("    " + dataInfo.nameOfPhilosofs[positionOfClickOnListPhilosof] + ".");
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);


    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(final GoogleMap googleMap) {
        mMap = googleMap;
        switchCompat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((SwitchCompat) v).isChecked()) {

                    boolean success = googleMap.setMapStyle(
                            MapStyleOptions.loadRawResourceStyle(
                                    MapsActivity.this, R.raw.style_json));
                } else {

                    boolean success = googleMap.setMapStyle(
                            MapStyleOptions.loadRawResourceStyle(
                                    MapsActivity.this, R.raw.simple_style_json));

                }
            }


        });

//        // Add a marker in Sydney and move the camera
        //
        //LatLng sydney = new LatLng(-34, 151);
        LatLng sydney = new LatLng(dataInfo.lat[positionOfClickOnListPhilosof], dataInfo.lng[positionOfClickOnListPhilosof]);
        //LatLng sydney = new LatLng(dataInfo.lat[0],dataInfo.lng[0]);
        mMap.addMarker(new MarkerOptions().position(sydney).title("Место рождения " + dataInfo.nameOfPhilosofs[positionOfClickOnListPhilosof]));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
//        PlaseMap.addMarker(new MarkerOptions().position(sydney).title("Alabama").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_email_black_24dp)));
//        PlaseMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));


    }
}
