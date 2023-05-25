package com.example.Philosophers.Philosophers;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.graphics.Color;
import android.graphics.Typeface;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.example.Philosophers.R;

import java.util.ArrayList;



public class DisplayShowAdapter extends ArrayAdapter<DisplayShow> {
    int positionOfClickOnListPhilosof;
    Intent intent;
    String citata;
    private LayoutInflater inflater;
    private int layout;
    private ArrayList<DisplayShow> ListCitaty;
    private DataInfo dataInfo = new DataInfo();


    DisplayShowAdapter(Context context, int resource, ArrayList<DisplayShow> products, int positionOfClickOnListPhilosof) {
        super(context, resource, products);
        this.ListCitaty = products;
        this.layout = resource;
        this.inflater = LayoutInflater.from(context);
        this.positionOfClickOnListPhilosof = positionOfClickOnListPhilosof;
    }


    public View getView(final int position, View convertView, final ViewGroup parent) {

        final DisplayShowAdapter.ViewHolder viewHolder;
        if (convertView == null) {
            convertView = inflater.inflate(this.layout, parent, false);
            viewHolder = new DisplayShowAdapter.ViewHolder(convertView);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (DisplayShowAdapter.ViewHolder) convertView.getTag();
        }


/////////////////////////////////////////////////////BACKGROUND COLOR///////////////////////////////////////////////////
        // Get the current item from ListView
//
//
//
//
//
//                if(position %2 == 1)
//                {
//                    // Set a background color for ListView regular row/item
//                    convertView.setBackgroundColor( Color.parseColor("#3a3c34"));
//                }
//                else
//                {
//                    // Set the background color for alternate row/item
//                    convertView.setBackgroundColor(Color.parseColor("#484b41"));
//                }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


        final DisplayShow product = ListCitaty.get(position);
        viewHolder.textViewFromListCitat.setText(product.getDescription());
        viewHolder.textViewFromListCitat.setTextColor(Color.WHITE);

        /////////////////////////////////////////////////////////////////////////////////////
        /////////////////////////////////////////////////////////////////////////////////////
        /////////////////////////////////////////////////////////////////////////////////////

        /////////////////////////////////////////////////////////////////////////////////////
        /////////////////////////////////////////////////////////////////////////////////////
        /////////////////////////////////////////////////////////////////////////////////////
        //final View finalConvertView = convertView;
//Выбирает кнопку в пункте списка
        /////////////////////////////////////////////////////////////////////////////////////
        viewHolder.ButtonAddCitatyToRecords.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                DbHandler dbHandler = new DbHandler(getContext());

                dbHandler.insertUserDetails(Analize(positionOfClickOnListPhilosof, position));


                intent = new Intent(getContext(), Details_Show_Records_Activity.class);
                /////////////////////////////////////////////////////////////////////////////////////
                /////////////////////////////////////////////////////////////////////////////////////
                /////////////////////////////////////////////////////////////////////////////////////
                /////////////////////////////////////////////////////////////////////////////////////


                //Toast.makeText(getContext(), String.format("Добавлена цитата : %s", Analize(positionOfClickOnListPhilosof,position)), Toast.LENGTH_SHORT).show();


                Toast toast = Toast.makeText(getContext(), String.format("Добавлена цитата : %s", Analize(positionOfClickOnListPhilosof, position)), Toast.LENGTH_SHORT);

                TextView toastMessage = (TextView) toast.getView().findViewById(android.R.id.message);

                toastMessage.setTextColor(Color.WHITE);

                View view = toast.getView();
//////////////////////////////////Подключение шрифтов из папки Project/app/src/main/Assets //////

                toastMessage.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 18.f);


//////////////////////////////////Подключение шрифтов из папки Project/app/src/main/Assets //////
                int padding = (int) TypedValue.applyDimension(
                        TypedValue.COMPLEX_UNIT_DIP, 5, getContext().getResources().getDisplayMetrics());

                toastMessage.setPadding(padding, padding, padding, padding);
                toastMessage.setTextSize(TypedValue.COMPLEX_UNIT_SP, 17);

                int tabTypefaceStyle = Typeface.BOLD;


                AssetManager am = getContext().getAssets();

//////////////////////////////////Подключение шрифтов из папки Project/app/src/main/Assets //////
                String toast_font = getContext().getResources().getString(R.string.toast_font);

                toastMessage.setTypeface(Typeface.createFromAsset(
                        am, toast_font), tabTypefaceStyle);
//////////////////////////////////Подключение шрифтов///////////////////////////////////////////////////
//////////////////////////////////Подключение шрифтов из папки Project/app/src/main/Assets //////
                view.setBackgroundResource(R.drawable.bg_alert_toast_style);

                toast.show();

                /////////////////////////////////////////////////////////////////////////////////////
                /////////////////////////////////////////////////////////////////////////////////////
                /////////////////////////////////////////////////////////////////////////////////////
                /////////////////////////////////////////////////////////////////////////////////////


                getContext().startActivity(intent);


//                Intent intent = new Intent(getContext(),ShowCitat.class);
//                intent.putExtra("Pos",position);
//                getContext().startActivity(intent);


//                int count = product.getCount()+1;
//                product.setCount(count);
//                viewHolder.countView.setText(formatValue(count, product.getUnit()));
            }


        });

        /////////////////////////////////////////////////////////////////////////////////////
        /////////////////////////////////////////////////////////////////////////////////////
        /////////////////////////////////////////////////////////////////////////////////////
        /////////////////////////////////////////////////////////////////////////////////////
        return convertView;
    }

    private String Analize(int positionOfClickOnListPhilosof, int position) {
        if (positionOfClickOnListPhilosof == 0) {
            citata = dataInfo.Parmenid[position];
        }
        if (positionOfClickOnListPhilosof == 1) {
            citata = dataInfo.Aristotelone[position];
        }
        if (positionOfClickOnListPhilosof == 2) {
            citata = dataInfo.Mark_Avrelij[position];
        }
        if (positionOfClickOnListPhilosof == 3) {
            citata = dataInfo.Anselm_Kenterberijskij[position];
        }
        if (positionOfClickOnListPhilosof == 4) {
            citata = dataInfo.Baruh_Spinoza[position];
        }
        if (positionOfClickOnListPhilosof == 5) {
            citata = dataInfo.Artur_Shopengauer[position];
        }
        if (positionOfClickOnListPhilosof == 6) {
            citata = dataInfo.Fridrih_Nitsshe[position];
        }
        if (positionOfClickOnListPhilosof == 7) {
            citata = dataInfo.Zhan_Pol_Sartr[position];
        }
        if (positionOfClickOnListPhilosof == 8) {
            citata = dataInfo.Moris_Merlo_Ponti[position];
        }
        if (positionOfClickOnListPhilosof == 9) {
            citata = dataInfo.Aristoteltwo[position];
        }
        if (positionOfClickOnListPhilosof == 10) {
            citata = dataInfo.Immanuil_Kant[position];
        }
        if (positionOfClickOnListPhilosof == 11) {
            citata = dataInfo.Platon[position];
        }
        if (positionOfClickOnListPhilosof == 12) {
            citata = dataInfo.Konfutsij[position];
        }
        if (positionOfClickOnListPhilosof == 13) {
            citata = dataInfo.Devid_Jum[position];
        }
        if (positionOfClickOnListPhilosof == 14) {
            citata = dataInfo.Rene_Dekart[position];
        }
        if (positionOfClickOnListPhilosof == 15) {
            citata = dataInfo.Sokrat[position];
        }
        if (positionOfClickOnListPhilosof == 16) {
            citata = dataInfo.Nikkolo_Makiavelli[position];
        }
        if (positionOfClickOnListPhilosof == 17) {
            citata = dataInfo.Dzhon_Lokk[position];
        }
        if (positionOfClickOnListPhilosof == 18) {
            citata = dataInfo.Diogen[position];
        }
        if (positionOfClickOnListPhilosof == 19) {
            citata = dataInfo.Foma_Akvinskij[position];
        }
        if (positionOfClickOnListPhilosof == 20) {
            citata = dataInfo.Lao_Tszy[position];
        }
        if (positionOfClickOnListPhilosof == 21) {
            citata = dataInfo.Gotfrid_Vilgelm_Lejbnits[position];
        }
        if (positionOfClickOnListPhilosof == 22) {
            citata = dataInfo.Baruh_Spinoza[position];
        }
        if (positionOfClickOnListPhilosof == 23) {
            citata = dataInfo.Volter[position];
        }
        if (positionOfClickOnListPhilosof == 24) {
            citata = dataInfo.Tomas_Gobbs[position];
        }
        if (positionOfClickOnListPhilosof == 25) {
            citata = dataInfo.Avrelij_Avgustin[position];
        }
        if (positionOfClickOnListPhilosof == 26) {
            citata = dataInfo.Abu_Hamid_al_Gazali[position];
        }
        if (positionOfClickOnListPhilosof == 27) {
            citata = dataInfo.Siddhartha_Gautama_Budda[position];
        }
        if (positionOfClickOnListPhilosof == 28) {
            citata = dataInfo.Baron_de_Monteskjo[position];
        }
        if (positionOfClickOnListPhilosof == 29) {
            citata = dataInfo.Zhan_Zhak_Russo[position];
        }
        if (positionOfClickOnListPhilosof == 30) {
            citata = dataInfo.Dzhordzh_Berkli[position];
        }
        if (positionOfClickOnListPhilosof == 31) {
            citata = dataInfo.Ajn_Rend[position];
        }
        if (positionOfClickOnListPhilosof == 32) {
            citata = dataInfo.Simona_de_Buvuar[position];
        }


        return citata;
    }


    private class ViewHolder {

        final TextView textViewFromListCitat;
        final ImageButton ButtonAddCitatyToRecords;

        ViewHolder(View view) {
            textViewFromListCitat = (TextView) view.findViewById(R.id.textViewFromListCitat);
            ButtonAddCitatyToRecords = (ImageButton) view.findViewById(R.id.buttonAddCitatuInRecords);

        }
    }
}
