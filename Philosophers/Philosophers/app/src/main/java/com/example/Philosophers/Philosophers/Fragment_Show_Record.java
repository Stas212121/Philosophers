package com.example.Philosophers.Philosophers;


import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

import com.example.Philosophers.Begin.MainActivity;
import com.example.Philosophers.R;
import com.example.Philosophers.Begin.ShowAnimation;

import java.util.ArrayList;



public class Fragment_Show_Record extends Fragment {
    boolean opened;
    LinearLayout linearLayout;
    Intent intent;
    ArrayList<DisplayShow> productsshow = new ArrayList();
    ListView productListShow;
    //ListView Адаптер:
    ArrayAdapter<String> adapter;
    //Поиск EditText
    EditText inputSearch;
    //Объявляем ListView:
    private ListView lv;
    private DisplayShowRecordsAdapter recrds_adapter;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        final View view = inflater.inflate(R.layout.fragment_show_records, container, false);


        LinearLayout linearLayout;
        linearLayout = view.findViewById(R.id.LinearLayoutSHOWcitat);
        //int color = Integer.parseInt(String.valueOf(R.color.colorPrimaryone), 16)+0xFF000000;

        int myColor_one = ContextCompat.getColor(getContext(), R.color.colorPrimaryone);
        int myColor_two = ContextCompat.getColor(getContext(), R.color.colorPrimarytwo);


        ShowAnimation.ShowAnimColor(linearLayout, myColor_one, myColor_two, "backgroundColor", 0, 2000);


/////////////////////////////////////////////////////////////////////////////////////////////////////
        /////////////////////////////////////////////////////////////////////////////////////////////////////
        /////////////////////////////////////////////////////////////////////////////////////////////////////
        final TextView textViewonetext;
        textViewonetext = view.findViewById(R.id.onetext);
/////////////////////////////////////////////////////////////////////////////////////////////////////
        final TextView textViewtwotext;
        textViewtwotext = view.findViewById(R.id.twotext);
/////////////////////////////////////////////////////////////////////////////////////////////////////


        ShowAnimation.doAnimScale(textViewonetext, getContext(), R.anim.scale_standart);
/////////////////////////////////////////////////////////////////////////////////////////////////////
        /////////////////////////////////////////////////////////////////////////////////////////////////////


        ShowAnimation.doAnimScale(textViewtwotext, getContext(), R.anim.scale_standart);
/////////////////////////////////////////////////////////////////////////////////////////////////////
        /////////////////////////////////////////////////////////////////////////////////////////////////////


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


        TextView textshowRecords = view.findViewById(R.id.textshowRecords);
        ShowAnimation.doAnimScale(textshowRecords, getContext(), R.anim.scale);


        DbHandler db = new DbHandler(getContext());


//        ArrayList<HashMap<String, String>> userList = db.GetUsers();
//        ListView lv = (ListView) view.findViewById(R.id.user_list);
//
//        ListAdapter adapter = new SimpleAdapter(getContext(), userList, R.layout.list_row,new String[]{"name"}, new int[]{R.id.name});
//
//        lv.setAdapter(adapter);


        ArrayList<String> records = db.GetRecords();
        if (productsshow.size() == 0) {
            for (int count = 0; count < records.size(); count++) {
                productsshow.add(new DisplayShow(records.get(count)));

            }
        }
        if (productsshow.size() == 0) {


            AlertDialog.Builder builder = new AlertDialog.Builder(getContext());


            builder.setTitle(Html.fromHtml("<font color='#E74848'>.</font>"))
                    .setMessage(Html.fromHtml("<font color='#FFFFFF'>Список пуст. Переход на главную страницу.</font>"));
            builder.setIcon(R.drawable.ic_warning_black_24dp);
            builder.setCancelable(false);
            builder.setNegativeButton("ОК ",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {


                            intent = new Intent(getContext(), MainActivity.class);
                            startActivity(intent);

///////////////////////////////////////////Переход между фрагментами с затуханием////////////////////////////
//                                              FragmentTransaction ftrans = getFragmentManager().beginTransaction();
//                                              ftrans.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE).replace(R.id.fragment_container, new Fragmet_Add_Records(), "MyFragmentTag").commit();
///////////////////////////////////////////Переход между фрагментами с затуханием////////////////////////////
                            //dialog.cancel();


                        }
                    });
            AlertDialog alert = builder.create();


            Window vieww = ((AlertDialog) alert).getWindow();
            vieww.setBackgroundDrawableResource(R.drawable.bg_alert_toast_style);


            alert.show();
        }

        //inputSearch = (EditText) view.findViewById(R.id.inputSearch);
        productListShow = (ListView) view.findViewById(R.id.user_list);
        recrds_adapter = new DisplayShowRecordsAdapter(getContext(),R.layout.maket_show_details_records, productsshow);
        productListShow.setAdapter(recrds_adapter);


//        inputSearch.addTextChangedListener(new TextWatcher() {
//
//            @Override
//            public void onTextChanged(CharSequence cs, int arg1, int arg2, int arg3) {
//                //Когда пользователь вводит какой-нибудь текст:
//
//                Fragment_Show_Record.this.recrds_adapter.getFilter().filter(cs);
//            }
//
//            @Override
//            public void beforeTextChanged(CharSequence arg0, int arg1, int arg2,
//                                          int arg3) {
//            }
//
//            @Override
//            public void afterTextChanged(Editable arg0) {
//            }
//        });

        return view;
    }

}
