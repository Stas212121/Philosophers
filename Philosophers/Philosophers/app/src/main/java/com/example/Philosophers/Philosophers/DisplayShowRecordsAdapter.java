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



public class DisplayShowRecordsAdapter extends ArrayAdapter<DisplayShow> {

    Intent intent;
    String citata;
    private LayoutInflater inflater;
    private int layout;
    private ArrayList<DisplayShow> ListCitaty;
    private DataInfo dataInfo = new DataInfo();


    DisplayShowRecordsAdapter(Context context, int resource, ArrayList<DisplayShow> products) {
        super(context, resource, products);
        this.ListCitaty = products;
        this.layout = resource;
        this.inflater = LayoutInflater.from(context);

    }


    public View getView(final int position, View convertView, final ViewGroup parent) {

        final DisplayShowRecordsAdapter.ViewHolder viewHolder;
        if (convertView == null) {
            convertView = inflater.inflate(this.layout, parent, false);
            viewHolder = new DisplayShowRecordsAdapter.ViewHolder(convertView);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (DisplayShowRecordsAdapter.ViewHolder) convertView.getTag();
        }

        final DisplayShow product = ListCitaty.get(position);
        viewHolder.textViewFromListCitat.setText(product.getDescription());
        viewHolder.textViewFromListCitat.setTextColor(Color.WHITE);

        //final View finalConvertView = convertView;
//Выбирает кнопку в пункте списка
        /////////////////////////////////////////////////////////////////////////////////////
        /////////////////////////////////////////////////////////////////////////////////////
        /////////////////////////////////////////////////////////////////////////////////////
        /////////////////////////////////////////////////////////////////////////////////////
        viewHolder.ButtonDeleteCitatyToRecords.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                DbHandler db = new DbHandler(getContext());
                db.DeleteRecords(product.getDescription());
                /////////////////////////////////////////////////////////////////////////////////////
                /////////////////////////////////////////////////////////////////////////////////////
                /////////////////////////////////////////////////////////////////////////////////////
                /////////////////////////////////////////////////////////////////////////////////////
                //Toast.makeText(getContext(), String.format("%s%s", "Удалена цитата : ", product.getDescription()), Toast.LENGTH_SHORT).show();


                Toast toast = Toast.makeText(getContext(), String.format("%s%s", "Удалена цитата : ", product.getDescription()), Toast.LENGTH_SHORT);

                TextView toastMessage = (TextView) toast.getView().findViewById(android.R.id.message);
                toastMessage.setTextColor(Color.WHITE);
//////////////////////////////////Подключение шрифтов из папки Project/app/src/main/Assets //////
                // toastMessage.setTextColor(Color.BLACK);
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
                View view = toast.getView();

                view.setBackgroundResource(R.drawable.bg_alert_toast_style);
                toast.show();

                /////////////////////////////////////////////////////////////////////////////////////
                /////////////////////////////////////////////////////////////////////////////////////
                /////////////////////////////////////////////////////////////////////////////////////
                /////////////////////////////////////////////////////////////////////////////////////

                intent = new Intent(getContext(), Details_Show_Records_Activity.class);
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


    private class ViewHolder {

        final TextView textViewFromListCitat;
        final ImageButton ButtonDeleteCitatyToRecords;


        ViewHolder(View view) {
            textViewFromListCitat = (TextView) view.findViewById(R.id.name);
            ButtonDeleteCitatyToRecords = (ImageButton) view.findViewById(R.id.buttonxxz);

        }
    }
}