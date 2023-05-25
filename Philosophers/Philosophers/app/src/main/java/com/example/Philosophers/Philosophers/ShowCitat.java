package com.example.Philosophers.Philosophers;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Html;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.example.Philosophers.R;
import com.example.Philosophers.Begin.ShowAnimation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class ShowCitat extends AppCompatActivity {


    LinearLayout linearLayout1, linearLayout2;
    ListView listView;
    TextView textView;
    Animation animFadeOut1, animFadeOut2, animFadeOut3;
    ArrayList<DisplayShow> productsshow = new ArrayList();
    ListView productListShow;
    Intent intent;
    ImageButton newButtonZoom, imageButtonMap;
    ImageView imageViewimagezoom;
    private int positionOfClickOnListPhilosof = 0;
    private Object List;
    private DataInfo dataInfo = new DataInfo();
    private Menu menu;
    private View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_citaty);


        Intent intentcat = getIntent();
        positionOfClickOnListPhilosof = intentcat.getExtras().getInt("Pos");

        //Toast.makeText(getApplicationContext(),Integer.toString(position) , Toast.LENGTH_SHORT).show();


        newButtonZoom = findViewById(R.id.newButtonZoom);
        imageButtonMap = findViewById(R.id.imageButtonMap);

//////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////
        newButtonZoom.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceType")
            @Override
            public void onClick(View v) {

                Dialog dialog = new Dialog(ShowCitat.this);

                dialog.setContentView(R.layout.activity_image_show);
                //////////////////////////////////
                imageViewimagezoom = (ImageView) dialog.findViewById(R.id.imageViewimagezoom);
                imageViewimagezoom.setImageResource(Integer.parseInt(String.valueOf(dataInfo.iconsIDs[positionOfClickOnListPhilosof])));

                dialog.show();
            }
        });
//////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////
        imageButtonMap.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceType")
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ShowCitat.this, MapsActivity.class);
                intent.putExtra("Pos", positionOfClickOnListPhilosof);
                ShowCitat.this.startActivity(intent);
            }
        });
//////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////

        animFadeOut1 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade_out1);
        linearLayout1 = findViewById(R.id.LinearLayout1);
        linearLayout1.setVisibility(View.VISIBLE);
        linearLayout1.startAnimation(animFadeOut1);


//////////////////////////////////Animation////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////Animation////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////Animation////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////
        setupActionBar();
//////////////////////////////////Animation////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////Animation////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////Animation////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////

        animFadeOut2 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade_out1);
        linearLayout2 = findViewById(R.id.LinearLayout2show);
        linearLayout2.setVisibility(View.VISIBLE);
        linearLayout2.startAnimation(animFadeOut2);

//////////////////////////////////Animation////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////Animation////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////Animation////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////
        animFadeOut3 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade_out1);
        textView = findViewById(R.id.textViewshow);
        textView.setVisibility(View.VISIBLE);
        textView.startAnimation(animFadeOut3);

//////////////////////////////////Animation////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////


        /////////////////////////////////////////////////////////////////////////////////////


        /////////////////////////////////////////////////////////////////////////////////////


//////////////////////////////////listView////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////
        //listView = findViewById( R.id.listViewshow );
////////////////////////////////////////////////////////////////////////////////////////////////
//for multiple choice
//        listView.setChoiceMode(listView.CHOICE_MODE_MULTIPLE);
        //listView.setChoiceMode( listView.CHOICE_MODE_SINGLE );
        //ArrayAdapter<?> adapter;
        final List<String> Parmenid;
        Parmenid = new ArrayList<String>(Arrays.asList(dataInfo.Parmenid));

        final List<String> Aristotelone;
        Aristotelone = new ArrayList<String>(Arrays.asList(dataInfo.Aristotelone));

        final List<String> Mark_Avrelij;
        Mark_Avrelij = new ArrayList<String>(Arrays.asList(dataInfo.Mark_Avrelij));

        final List<String> Anselm_Kenterberijskij;
        Anselm_Kenterberijskij = new ArrayList<String>(Arrays.asList(dataInfo.Anselm_Kenterberijskij));

        final List<String> Benedikt_Spinoza;
        Benedikt_Spinoza = new ArrayList<String>(Arrays.asList(dataInfo.Benedikt_Spinoza));

        final List<String> Artur_Shopengauer;
        Artur_Shopengauer = new ArrayList<String>(Arrays.asList(dataInfo.Artur_Shopengauer));

        final List<String> Fridrih_Nitsshe;
        Fridrih_Nitsshe = new ArrayList<String>(Arrays.asList(dataInfo.Fridrih_Nitsshe));

        final List<String> Zhan_Pol_Sartr;
        Zhan_Pol_Sartr = new ArrayList<String>(Arrays.asList(dataInfo.Zhan_Pol_Sartr));

        final List<String> Moris_Merlo_Ponti;
        Moris_Merlo_Ponti = new ArrayList<String>(Arrays.asList(dataInfo.Moris_Merlo_Ponti));

        final List<String> Aristoteltwo;
        Aristoteltwo = new ArrayList<String>(Arrays.asList(dataInfo.Aristoteltwo));

        final List<String> Immanuil_Kant;
        Immanuil_Kant = new ArrayList<String>(Arrays.asList(dataInfo.Immanuil_Kant));

        final List<String> Platon;
        Platon = new ArrayList<String>(Arrays.asList(dataInfo.Platon));

        final List<String> Konfutsij;
        Konfutsij = new ArrayList<String>(Arrays.asList(dataInfo.Konfutsij));

        final List<String> Devid_Jum;
        Devid_Jum = new ArrayList<String>(Arrays.asList(dataInfo.Devid_Jum));

        final List<String> Rene_Dekart;
        Rene_Dekart = new ArrayList<String>(Arrays.asList(dataInfo.Rene_Dekart));

        final List<String> Sokrat;
        Sokrat = new ArrayList<String>(Arrays.asList(dataInfo.Sokrat));

        final List<String> Nikkolo_Makiavelli;
        Nikkolo_Makiavelli = new ArrayList<String>(Arrays.asList(dataInfo.Nikkolo_Makiavelli));

        final List<String> Dzhon_Lokk;
        Dzhon_Lokk = new ArrayList<String>(Arrays.asList(dataInfo.Dzhon_Lokk));

        final List<String> Diogen;
        Diogen = new ArrayList<String>(Arrays.asList(dataInfo.Diogen));

        final List<String> Foma_Akvinskij;
        Foma_Akvinskij = new ArrayList<String>(Arrays.asList(dataInfo.Foma_Akvinskij));

        final List<String> Lao_Tszy;
        Lao_Tszy = new ArrayList<String>(Arrays.asList(dataInfo.Lao_Tszy));

        final List<String> Gotfrid_Vilgelm_Lejbnits;
        Gotfrid_Vilgelm_Lejbnits = new ArrayList<String>(Arrays.asList(dataInfo.Gotfrid_Vilgelm_Lejbnits));

        final List<String> Baruh_Spinoza;
        Baruh_Spinoza = new ArrayList<String>(Arrays.asList(dataInfo.Baruh_Spinoza));

        final List<String> Volter;
        Volter = new ArrayList<String>(Arrays.asList(dataInfo.Volter));

        final List<String> Tomas_Gobbs;
        Tomas_Gobbs = new ArrayList<String>(Arrays.asList(dataInfo.Tomas_Gobbs));

        final List<String> Avrelij_Avgustin;
        Avrelij_Avgustin = new ArrayList<String>(Arrays.asList(dataInfo.Avrelij_Avgustin));

        final List<String> Abu_Hamid_al_Gazali;
        Abu_Hamid_al_Gazali = new ArrayList<String>(Arrays.asList(dataInfo.Abu_Hamid_al_Gazali));

        final List<String> Siddhartha_Gautama_Budda;
        Siddhartha_Gautama_Budda = new ArrayList<String>(Arrays.asList(dataInfo.Siddhartha_Gautama_Budda));

        final List<String> Baron_de_Monteskjo;
        Baron_de_Monteskjo = new ArrayList<String>(Arrays.asList(dataInfo.Baron_de_Monteskjo));

        final List<String> Zhan_Zhak_Russo;
        Zhan_Zhak_Russo = new ArrayList<String>(Arrays.asList(dataInfo.Zhan_Zhak_Russo));

        final List<String> Dzhordzh_Berkli;
        Dzhordzh_Berkli = new ArrayList<String>(Arrays.asList(dataInfo.Dzhordzh_Berkli));

        final List<String> Ajn_Rend;
        Ajn_Rend = new ArrayList<String>(Arrays.asList(dataInfo.Ajn_Rend));

        final List<String> Simona_de_Buvuar;
        Simona_de_Buvuar = new ArrayList<String>(Arrays.asList(dataInfo.Simona_de_Buvuar));

        String titleOverListCitaty;


        if (positionOfClickOnListPhilosof == 0) {
            titleOverListCitaty = dataInfo.nameOfPhilosofs[0];
            Selestion((ArrayList<String>) Parmenid, titleOverListCitaty, positionOfClickOnListPhilosof);

        }
        if (positionOfClickOnListPhilosof == 1) {
            titleOverListCitaty = dataInfo.nameOfPhilosofs[1];
            Selestion((ArrayList<String>) Aristotelone, titleOverListCitaty, positionOfClickOnListPhilosof);

        }
        if (positionOfClickOnListPhilosof == 2) {
            titleOverListCitaty = dataInfo.nameOfPhilosofs[2];
            Selestion((ArrayList<String>) Mark_Avrelij, titleOverListCitaty, positionOfClickOnListPhilosof);

        }
        if (positionOfClickOnListPhilosof == 3) {
            titleOverListCitaty = dataInfo.nameOfPhilosofs[3];
            Selestion((ArrayList<String>) Anselm_Kenterberijskij, titleOverListCitaty, positionOfClickOnListPhilosof);

        }
        if (positionOfClickOnListPhilosof == 4) {
            titleOverListCitaty = dataInfo.nameOfPhilosofs[4];
            Selestion((ArrayList<String>) Baruh_Spinoza, titleOverListCitaty, positionOfClickOnListPhilosof);

        }
        if (positionOfClickOnListPhilosof == 5) {
            titleOverListCitaty = dataInfo.nameOfPhilosofs[5];
            Selestion((ArrayList<String>) Artur_Shopengauer, titleOverListCitaty, positionOfClickOnListPhilosof);

        }
        if (positionOfClickOnListPhilosof == 6) {
            titleOverListCitaty = dataInfo.nameOfPhilosofs[6];
            Selestion((ArrayList<String>) Fridrih_Nitsshe, titleOverListCitaty, positionOfClickOnListPhilosof);

        }
        if (positionOfClickOnListPhilosof == 7) {
            titleOverListCitaty = dataInfo.nameOfPhilosofs[7];
            Selestion((ArrayList<String>) Zhan_Pol_Sartr, titleOverListCitaty, positionOfClickOnListPhilosof);

        }
        if (positionOfClickOnListPhilosof == 8) {
            titleOverListCitaty = dataInfo.nameOfPhilosofs[8];
            Selestion((ArrayList<String>) Moris_Merlo_Ponti, titleOverListCitaty, positionOfClickOnListPhilosof);

        }
        if (positionOfClickOnListPhilosof == 9) {
            titleOverListCitaty = dataInfo.nameOfPhilosofs[9];
            Selestion((ArrayList<String>) Aristoteltwo, titleOverListCitaty, positionOfClickOnListPhilosof);

        }
        if (positionOfClickOnListPhilosof == 10) {
            titleOverListCitaty = dataInfo.nameOfPhilosofs[10];
            Selestion((ArrayList<String>) Immanuil_Kant, titleOverListCitaty, positionOfClickOnListPhilosof);

        }
        if (positionOfClickOnListPhilosof == 11) {
            titleOverListCitaty = dataInfo.nameOfPhilosofs[11];
            Selestion((ArrayList<String>) Platon, titleOverListCitaty, positionOfClickOnListPhilosof);

        }
        if (positionOfClickOnListPhilosof == 12) {
            titleOverListCitaty = dataInfo.nameOfPhilosofs[12];
            Selestion((ArrayList<String>) Konfutsij, titleOverListCitaty, positionOfClickOnListPhilosof);

        }
        if (positionOfClickOnListPhilosof == 13) {
            titleOverListCitaty = dataInfo.nameOfPhilosofs[3];
            Selestion((ArrayList<String>) Devid_Jum, titleOverListCitaty, positionOfClickOnListPhilosof);

        }
        if (positionOfClickOnListPhilosof == 14) {
            titleOverListCitaty = dataInfo.nameOfPhilosofs[14];
            Selestion((ArrayList<String>) Rene_Dekart, titleOverListCitaty, positionOfClickOnListPhilosof);

        }
        if (positionOfClickOnListPhilosof == 15) {
            titleOverListCitaty = dataInfo.nameOfPhilosofs[15];
            Selestion((ArrayList<String>) Sokrat, titleOverListCitaty, positionOfClickOnListPhilosof);

        }
        if (positionOfClickOnListPhilosof == 16) {
            titleOverListCitaty = dataInfo.nameOfPhilosofs[16];
            Selestion((ArrayList<String>) Nikkolo_Makiavelli, titleOverListCitaty, positionOfClickOnListPhilosof);

        }
        if (positionOfClickOnListPhilosof == 17) {
            titleOverListCitaty = dataInfo.nameOfPhilosofs[17];
            Selestion((ArrayList<String>) Dzhon_Lokk, titleOverListCitaty, positionOfClickOnListPhilosof);

        }
        if (positionOfClickOnListPhilosof == 18) {
            titleOverListCitaty = dataInfo.nameOfPhilosofs[18];
            Selestion((ArrayList<String>) Diogen, titleOverListCitaty, positionOfClickOnListPhilosof);

        }
        if (positionOfClickOnListPhilosof == 19) {
            titleOverListCitaty = dataInfo.nameOfPhilosofs[19];
            Selestion((ArrayList<String>) Foma_Akvinskij, titleOverListCitaty, positionOfClickOnListPhilosof);

        }
        if (positionOfClickOnListPhilosof == 20) {
            titleOverListCitaty = dataInfo.nameOfPhilosofs[20];
            Selestion((ArrayList<String>) Lao_Tszy, titleOverListCitaty, positionOfClickOnListPhilosof);

        }
        if (positionOfClickOnListPhilosof == 21) {
            titleOverListCitaty = dataInfo.nameOfPhilosofs[21];
            Selestion((ArrayList<String>) Gotfrid_Vilgelm_Lejbnits, titleOverListCitaty, positionOfClickOnListPhilosof);

        }
        if (positionOfClickOnListPhilosof == 22) {
            titleOverListCitaty = dataInfo.nameOfPhilosofs[22];
            Selestion((ArrayList<String>) Baruh_Spinoza, titleOverListCitaty, positionOfClickOnListPhilosof);

        }
        if (positionOfClickOnListPhilosof == 23) {
            titleOverListCitaty = dataInfo.nameOfPhilosofs[23];
            Selestion((ArrayList<String>) Volter, titleOverListCitaty, positionOfClickOnListPhilosof);

        }
        if (positionOfClickOnListPhilosof == 24) {
            titleOverListCitaty = dataInfo.nameOfPhilosofs[24];
            Selestion((ArrayList<String>) Tomas_Gobbs, titleOverListCitaty, positionOfClickOnListPhilosof);

        }
        if (positionOfClickOnListPhilosof == 25) {
            titleOverListCitaty = dataInfo.nameOfPhilosofs[25];
            Selestion((ArrayList<String>) Avrelij_Avgustin, titleOverListCitaty, positionOfClickOnListPhilosof);

        }
        if (positionOfClickOnListPhilosof == 26) {
            titleOverListCitaty = dataInfo.nameOfPhilosofs[26];
            Selestion((ArrayList<String>) Abu_Hamid_al_Gazali, titleOverListCitaty, positionOfClickOnListPhilosof);

        }
        if (positionOfClickOnListPhilosof == 27) {
            titleOverListCitaty = dataInfo.nameOfPhilosofs[27];
            Selestion((ArrayList<String>) Siddhartha_Gautama_Budda, titleOverListCitaty, positionOfClickOnListPhilosof);

        }
        if (positionOfClickOnListPhilosof == 28) {
            titleOverListCitaty = dataInfo.nameOfPhilosofs[28];
            Selestion((ArrayList<String>) Baron_de_Monteskjo, titleOverListCitaty, positionOfClickOnListPhilosof);

        }
        if (positionOfClickOnListPhilosof == 29) {
            titleOverListCitaty = dataInfo.nameOfPhilosofs[29];
            Selestion((ArrayList<String>) Zhan_Zhak_Russo, titleOverListCitaty, positionOfClickOnListPhilosof);

        }
        if (positionOfClickOnListPhilosof == 30) {
            titleOverListCitaty = dataInfo.nameOfPhilosofs[30];
            Selestion((ArrayList<String>) Dzhordzh_Berkli, titleOverListCitaty, positionOfClickOnListPhilosof);

        }
        if (positionOfClickOnListPhilosof == 31) {
            titleOverListCitaty = dataInfo.nameOfPhilosofs[31];
            Selestion((ArrayList<String>) Ajn_Rend, titleOverListCitaty, positionOfClickOnListPhilosof);

        }
        if (positionOfClickOnListPhilosof == 32) {
            titleOverListCitaty = dataInfo.nameOfPhilosofs[32];
            Selestion((ArrayList<String>) Simona_de_Buvuar, titleOverListCitaty, positionOfClickOnListPhilosof);

        }


    }

    void Selestion(final ArrayList<String> arrayPhilosofCitaty, final String titleOverListCitaty, final int positionOfClickOnListPhilosof) {

        //final ListView lv = (ListView) findViewById(R.id.listViewshow);

        Animation anim;
///////////////////////////////////////////////////////////////Load image philosof////////////////////////////////////////////////////
        ImageView imageViewShowcitat = findViewById(R.id.imageviewShowcitat);
        anim = AnimationUtils.loadAnimation(this, R.anim.scale);
        imageViewShowcitat.startAnimation(anim);

        imageViewShowcitat.setImageResource(Integer.parseInt(String.valueOf(dataInfo.iconsIDs[positionOfClickOnListPhilosof])));

        ///////////////////////////////////////////////////////////////Load years////////////////////////////////////////////////////

        TextView yearViewShowcitat = findViewById(R.id.yearViewShowcitat);
        ShowAnimation.doAnimScale(yearViewShowcitat, this, R.anim.scale);

        yearViewShowcitat.setText(dataInfo.years[positionOfClickOnListPhilosof]);
        ///////////////////////////////////////////////////////////////Load citat////////////////////////////////////////////////////
        TextView tv1 = findViewById(R.id.textViewshow);
        ShowAnimation.doAnimScale(tv1, this, R.anim.scale);

        tv1.setText(titleOverListCitaty);


        if (productsshow.size() == 0) {
            for (int count = 0; count < arrayPhilosofCitaty.size(); count++) {
                productsshow.add(new DisplayShow(arrayPhilosofCitaty.get(count)));
            }
        }


        productListShow = (ListView) findViewById(R.id.listViewShowCitat);
        Animation animm;
        animm = AnimationUtils.loadAnimation(this, R.anim.scale_basic);
        productListShow.startAnimation(animm);


        DisplayShowAdapter adapter = new DisplayShowAdapter(this, R.layout.maket_show_citat, productsshow, positionOfClickOnListPhilosof);
        productListShow.setAdapter(adapter);

        // Create a List from String Array elements


//         Create an ArrayAdapter from List
//        final ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>
//                //  (this, android.R.layout.simple_list_item_single_choice, arrayinfo){
//                (this, android.R.layout.simple_list_item_1, arrayinfo){
//
//            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
//            @Override
//            public View getView(int position, View convertView, ViewGroup parent){
//
//
//                View view = super.getView(position,convertView,parent);
/////////////////////////////////////////////////////BACKGROUND COLOR///////////////////////////////////////////////////
//                // Get the current item from ListView
//
//
//                if(position %2 == 1)
//                {
//                    // Set a background color for ListView regular row/item
//                    view.setBackgroundColor( Color.parseColor("#3a3c34"));
//                }
//                else
//                {
//                    // Set the background color for alternate row/item
//                    view.setBackgroundColor(Color.parseColor("#484b41"));
//                }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//         Get the Layout Parameters for ListView Current Item View
//        ViewGroup.LayoutParams params = view.getLayoutParams();
//
//         Set the height of the Item View
//        params.height = 410;
//
//
//        view.setLayoutParams(params);
///////////////////////////////////////SHADOW TEXT//////////////////////////////////////////////////////////////////////////////////
//
//        TextView tv = (TextView) view.findViewById(android.R.id.text1);
//        tv.setShadowLayer(1.5f,-2,2,Color.GRAY);
//
//
//         Set the text size 25 dip for ListView each item
//
//        tv.setTextSize( TypedValue.COMPLEX_UNIT_DIP,14);
//        tv.setTextColor( Color.WHITE);
//
//        return view;
//            }
//        };
//
//         DataBind ListView with items from ArrayAdapter
//         lv.setAdapter(arrayAdapter);
//
//
//        /////////////////////////////////////SHADOW TEXT//////////////////////////////////////////////////////////////////////////////////
//        /////////////////////////////////////SHADOW TEXT//////////////////////////////////////////////////////////////////////////////////
//        /////////////////////////////////////SHADOW TEXT//////////////////////////////////////////////////////////////////////////////////
//        /////////////////////////////////////SHADOW TEXT//////////////////////////////////////////////////////////////////////////////////
//        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//
///////////////////////////////////////////////Выводит диалоговое окно/////////////////////////////////////////
//        final AlertDialog.Builder builder = new AlertDialog.Builder(Show.this);
//
//        // Set a title for alert dialog
//        builder.setTitle("Choose a color...");
//
//
//
//
//
//
//        // Initializing an array of colors
//        final String[] colors = new String[]{
//                "#5d5f57",
//                "#4a4b46",
//                "#3a3b37",
//                "#232420"
//        };
//        final LinearLayout linearLayout= ( LinearLayout) findViewById(R.id.LinearLayout2show);
//
//
//
//        builder.setItems(colors, new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialog, int which) {
//                String selectedColor = Arrays.asList(colors).get(which);
//                // Set the layout background color as user selection
//                linearLayout.setBackgroundColor(Color.parseColor(selectedColor));
//            }
//        });
//
//
//
//        AlertDialog dialog = builder.create();
//        // Display the alert dialog on interface
//        dialog.show();
///////////////////////////////////////////////Выводит диалоговое окно/////////////////////////////////////////
//
//
//        registerForContextMenu(listView);
//        /////////////////////////////////////SHADOW TEXT//////////////////////////////////////////////////////////////////////////////////
//        /////////////////////////////////////SHADOW TEXT//////////////////////////////////////////////////////////////////////////////////
//        /////////////////////////////////////SHADOW TEXT//////////////////////////////////////////////////////////////////////////////////
//        /////////////////////////////////////SHADOW TEXT//////////////////////////////////////////////////////////////////////////////////
//        /////////////////////////////////////SHADOW TEXT//////////////////////////////////////////////////////////////////////////////////
//        /////////////////////////////////////SHADOW TEXT//////////////////////////////////////////////////////////////////////////////////
//        /////////////////////////////////////SHADOW TEXT//////////////////////////////////////////////////////////////////////////////////
//        /////////////////////////////////////SHADOW TEXT//////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////listView нажатие на пункте списка и передача индекса позиции
//////////////////////////////////на другое окно в виде числа int
//////////////////////////////////listView////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////
//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int pos, long id)
//            {
///////////////////////////////////////////////////////////////ADD ITEMS////////////////////////////////////////////////////////////
//                arrayinfo.add("Loquat");
//                arrayinfo.add("Pear");
//
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//                lv.getChildAt(0).setEnabled(false);
///////////////////////////////////////////////////////////////////////ANIMATION///////////////////////////////////////////////////
//                Animation animation1 = new AlphaAnimation(0.3f, 1.0f);
//                animation1.setDuration(4000);
//                view.startAnimation(animation1);
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//                lv.setDivider(new ColorDrawable(Color.parseColor("#FF4A4D93")));
//
//                // set ListView divider height
//                lv.setDividerHeight(2);
/////////////////////////////////////////////////////////////////////////CHANGE COLOR//////////////////////////////////////////////////
//                ColorDrawable[] color = {
//                        new ColorDrawable(Color.parseColor("#b6c75c")),
//                        new ColorDrawable(Color.parseColor("#FF0000"))
//                };
//                TransitionDrawable trans = new TransitionDrawable(color);
//                view.setBackground(trans);
//                trans.startTransition(2000); // duration 2 seconds
//
//                // Go back to the default background color of Item
//                ColorDrawable[] color2 = {
//                        new ColorDrawable(Color.parseColor("#FF0000")),
//                        new ColorDrawable(Color.parseColor("#b6c75c"))
//                };
//                TransitionDrawable trans2 = new TransitionDrawable(color2);
//                view.setBackground(trans2);
//
//                trans2.startTransition(2000); // duration 2 seconds
//
/////////////////////////////////////////////////////////////////CHANGE TEXT//////////////////////////////////////////////////////////
//
//                String selectedItem = (String)adapterView.getItemAtPosition(pos);
//                final TextView tv = (TextView) view.findViewById(android.R.id.text1);
//                tv.setText("Your favorite : " + selectedItem);
///////////////////////////////////////////////////////////////////MONOSPACE////////////////////////////////////////////////////////
//
//                tv.setTypeface( Typeface.MONOSPACE);
//
//                tv.setText("Monospace font");
//
////////////////////////////////////////////////////////////////Message///////////////////////////////////////////////////////////
//                // Build an AlertDialog
//                AlertDialog.Builder builder = new AlertDialog.Builder(Show.this);
//
//                // Set a title for alert dialog
//                builder.setTitle("Select your answer.");
//
//                // Ask the final question
//                builder.setMessage("Want to apply big font size?");
//
//                // Set click listener for alert dialog buttons
//                DialogInterface.OnClickListener dialogClickListener = new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialog, int which) {
//                        switch(which){
//                            case DialogInterface.BUTTON_POSITIVE:
//                                // User clicked the Yes button
//                                tv.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 35);
//                                break;
//
//                            case DialogInterface.BUTTON_NEGATIVE:
//                                // User clicked the No button
//                                break;
//                        }
//                    }
//                };
//
//                // Set the alert dialog yes button click listener
//                builder.setPositiveButton("Yes", dialogClickListener);
//
//                // Set the alert dialog no button click listener
//                builder.setNegativeButton("No",dialogClickListener);
//
//                AlertDialog dialog = builder.create();
//                // Display the alert dialog on interface
//                dialog.show();
//
///////////////////////////////////////////////TRANSPARENT text////////////////////////////////////////////////////////////////////////////
//                tv.setBackgroundColor(Color.TRANSPARENT);
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
////                Intent intent = new Intent(getApplicationContext(),CategoryNYTActivity.class);
////                intent.putExtra("Category",pos);
////                Toast.makeText(getApplicationContext(), Integer.toString(pos), Toast.LENGTH_SHORT).show();
////                startActivity(intent);
//
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//            }
//
//        });


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


}
