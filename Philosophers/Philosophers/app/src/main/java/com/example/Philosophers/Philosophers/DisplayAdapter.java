package com.example.Philosophers.Philosophers;


import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.graphics.Color;
import android.graphics.Typeface;
import android.text.Html;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.Philosophers.R;

import java.util.ArrayList;




class DisplayAdapter extends ArrayAdapter<Displayy> {
    boolean opened;
    ImageView imageViewimagezoom;
    Intent intent;
    private LayoutInflater inflater;
    private int layout;
    private ArrayList<Displayy> productList;
    private DataInfo dataInfo = new DataInfo();
    private TextView textViewshow;


    DisplayAdapter(Context context, int resource, ArrayList<Displayy> products) {
        super(context, resource, products);
        this.productList = products;
        this.layout = resource;
        this.inflater = LayoutInflater.from(context);
    }


    public View getView(final int position, View convertView, final ViewGroup parent) {

        final ViewHolder viewHolder;
        if (convertView == null) {
            convertView = inflater.inflate(this.layout, parent, false);
            viewHolder = new ViewHolder(convertView);
            ///////////////////разтягивает на 10 проц
            ViewPropertyAnimator animate = convertView.animate();
            animate.scaleX(1.1F);
            ///////////////////разтягивает на 10 проц
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        final Displayy product = productList.get(position);

        viewHolder.imageView_philosof.setImageResource(product.getImageview());

        viewHolder.titleView.setText(product.getTitle());

        viewHolder.descriptionView.setText(product.getDescription());
        viewHolder.descriptionView.setTextColor(Color.WHITE);

        viewHolder.yearView.setText(product.getYear());

        //final View finalConvertView = convertView;
//Выбирает кнопку в пункте списка
        /////////////////////////////////////////////////////////////////////////////////////

        /////////////////////////////////////////////////////////////////////////////////////
        /////////////////////////////////////////////////////////////////////////////////////
        /////////////////////////////////////////////////////////////////////////////////////
        viewHolder.NewButtonCitaty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), ShowCitat.class);
                intent.putExtra("Pos", position);
                getContext().startActivity(intent);
//                int count = product.getCount()+1;
//                product.setCount(count);
//                viewHolder.countView.setText(formatValue(count, product.getUnit()));
            }


        });

        /////////////////////////////////////////////////////////////////////////////////////
        /////////////////////////////////////////////////////////////////////////////////////
        /////////////////////////////////////////////////////////////////////////////////////
        /////////////////////////////////////////////////////////////////////////////////////

        viewHolder.imageButtonZoom.setOnClickListener(new View.OnClickListener() {


            @SuppressLint("ResourceType")
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(getContext(),Show.class);
//                intent.putExtra("Pos",position);
//                getContext().startActivity(intent);


                // Остальной код
                Dialog dialog = new Dialog(getContext());

                dialog.setContentView(R.layout.activity_image_show);
                //////////////////////////////////
                imageViewimagezoom = (ImageView) dialog.findViewById(R.id.imageViewimagezoom);
                imageViewimagezoom.setImageResource(Integer.parseInt(String.valueOf(dataInfo.iconsIDs[position])));

                // Display the alert dialog on interface
                dialog.show();


//                int count = product.getCount()+1;
//                product.setCount(count);
//                viewHolder.countView.setText(formatValue(count, product.getUnit()));

//                int count = product.getCount()+1;
//                product.setCount(count);
//                viewHolder.countView.setText(formatValue(count, product.getUnit()));
            }


        });

        /////////////////////////////////////////////////////////////////////////////////////
        /////////////////////////////////////////////////////////////////////////////////////
        viewHolder.imageButtonMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), MapsActivity.class);
                intent.putExtra("Pos", position);
                getContext().startActivity(intent);
            }

        });

        /////////////////////////////////////////////////////////////////////////////////////
        /////////////////////////////////////////////////////////////////////////////////////
        /////////////////////////////////////////////////////////////////////////////////////
        /////////////////////////////////////////////////////////////////////////////////////
        /////////////////////////////////////////////////////////////////////////////////////
        /////////////////////////////////////////////////////////////////////////////////////


        /////////////////////////////////////////////////////////////////////////////////////
        /////////////////////////////////////////////////////////////////////////////////////
        /////////////////////////////////////////////////////////////////////////////////////
        /////////////////////////////////////////////////////////////////////////////////////
//        viewHolder.descriptionView.setOnClickListener(new View.OnClickListener() {
//
//
//            @SuppressLint("ResourceType")
//            @Override
//            public void onClick(View v) {
////                Intent intent = new Intent(getContext(),Show.class);
////                intent.putExtra("Pos",position);
////                getContext().startActivity(intent);
//
//
//
//                // Остальной код
//                Dialog dialog = new Dialog(getContext());
//
//                dialog.setContentView(R.layout.activity_text_show);
//                //////////////////////////////////
//                textViewshow = (TextView) dialog.findViewById(R.id.textViewshow);
//                textViewshow.setText(dataInfo.Description[position]);
//                textViewshow.setTextSize( TypedValue.COMPLEX_UNIT_DIP,14);
//                textViewshow.setShadowLayer(1.5f,-2,2,Color.GRAY);
//                textViewshow.setTextColor( Color.WHITE);
//
//                // Display the alert dialog on interface
//                dialog.show();
//
////                int count = product.getCount()+1;
////                product.setCount(count);
////                viewHolder.countView.setText(formatValue(count, product.getUnit()));
//            }
//
//
//        });


        viewHolder.newButtonPodrobnosti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dialog dialog = new Dialog(getContext());

                dialog.setContentView(R.layout.activity_text_show);
                //////////////////////////////////
                textViewshow = (TextView) dialog.findViewById(R.id.textViewshow);

                //textViewshow.setText(dataInfo.DetailsLife[position]);

                //////////////////////////////////
                textViewshow.setText(Html.fromHtml(dataInfo.DetailsLife[position]));
                //////////////////////////////////
                textViewshow.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 18);
                textViewshow.setShadowLayer(1.5f, -2, 2, Color.GRAY);
                textViewshow.setTextColor(Color.WHITE);

                // Display the alert dialog on interface
                dialog.show();
            }

        });


        viewHolder.buttonRightOneMainActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//////////////////////////////////////////////////////////////////////////////////////////
                ///////////////////////////////////////change color textview//////////////
//
//                ColorDrawable[] color = {
//                        new ColorDrawable(Color.parseColor("#5B1548D8")),
//                        new ColorDrawable(Color.parseColor("#E60404DF"))
//                };
//                TransitionDrawable trans = new TransitionDrawable(color);
//                //parent.setBackground(trans);
//                trans.startTransition(3000); // duration 2 seconds

                // Go back to the default background color of Item
//                ColorDrawable[] color2 = {
//                        new ColorDrawable(Color.parseColor("#262c9d")),
//                        new ColorDrawable(Color.parseColor("#333366"))
//                };
//                TransitionDrawable trans2 = new TransitionDrawable(color2);
//                //parent.setBackground(trans2);
//                trans2.startTransition(2000); // duration 2 seconds
                ///////////////////////////////////////////change color textview//////////////////////////
                //////////////////////////////////////////////////////////////////////////////////////////
                if (!opened) {

                    TextView TextViewRightOneMainActivity;
                    TextViewRightOneMainActivity = (TextView) parent.findViewById(R.id.descriptionView);


                    //TextViewRightOneMainActivity.setBackground(trans);
                    //buttonRightOneMainActivity.setBackground(trans2);


                    TextViewRightOneMainActivity.setTextSize(20);


                    AssetManager am = getContext().getAssets();
                    int tabTypefaceStyle = Typeface.BOLD;
                    TextViewRightOneMainActivity.setTypeface(Typeface.createFromAsset(
                            am, "18341.ttf"), tabTypefaceStyle);

                    //TextViewRightOneMainActivity.setVisibility(View.INVISIBLE);
                    ImageButton buttonRightTwoMainActivity;
                    buttonRightTwoMainActivity = (ImageButton) parent.findViewById(R.id.buttonZoomOneMainActivity);
                    buttonRightTwoMainActivity.setImageResource(R.drawable.ic_zoom_out_black_24dp);

//////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////
                    //////////////////////////////////////////////////////////////////////////////////////////////////////
//                LinearLayout linearLayout2 = new LinearLayout(getContext());
//                linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(FrameLayout.LayoutParams.MATCH_PARENT, FrameLayout.LayoutParams.WRAP_CONTENT));
//                linearLayout2.setOrientation(LinearLayout.VERTICAL);


//                TextView tv1 = new TextView(getContext());
//                TextView tv2 = new TextView(getContext());
//// add 2 textview to horizontal linearlayout
//                linearLayout2.addView(tv2);
//                linearLayout2.addView(tv2);


//////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////
                    //////////////////////////////////////////////////////////////////////////////////////////////////////
                } else {

                    TextView TextViewRightOneMainActivity;
                    TextViewRightOneMainActivity = (TextView) parent.findViewById(R.id.descriptionView);


                    //TextViewRightOneMainActivity.setBackground(trans);
                    //buttonRightOneMainActivity.setBackground(trans2);


                    TextViewRightOneMainActivity.setTextSize(18);


                    AssetManager am = getContext().getAssets();
                    int tabTypefaceStyle = Typeface.BOLD;
                    TextViewRightOneMainActivity.setTypeface(Typeface.createFromAsset(
                            am, "18341.ttf"), tabTypefaceStyle);

                    ImageButton buttonRightTwoMainActivity;
                    buttonRightTwoMainActivity = (ImageButton) v.findViewById(R.id.buttonZoomOneMainActivity);
                    buttonRightTwoMainActivity.setImageResource(R.drawable.ic_zoom_in_black_24dp);
                }
                opened = !opened;
            }
        });


        viewHolder.buttonRightThreeMainActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Get the Layout Parameters for ListView Current Item View
                DataInfo.AlertDialogShow(getContext(), "<font color='#E74848'>.</font>",
                        "<font color='#FFFFFF'>Раздел в состоянии разработки.</font>",
                        "ОК ");
//                intent = new Intent(getContext(), ImageHorizontalScrollActivity.class);
//                getContext().startActivity(intent);

            }

        });


        viewHolder.buttonRightFourMainActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get the Layout Parameters for ListView Current Item View
                DataInfo.AlertDialogShow(getContext(), "<font color='#E74848'>.</font>",
                        "<font color='#FFFFFF'>Раздел в состоянии разработки.</font>",
                        "ОК ");
            }

        });


        return convertView;

    }

    private class ViewHolder {

        final ImageView imageView_philosof;

        final ImageView imageViewimagezoom;

        final TextView titleView,
                descriptionView,
                yearView;

        final Button NewButtonCitaty, newButtonPodrobnosti;
        public ImageButton imageButtonZoom;


        public ImageButton buttonRightOneMainActivity;
        public ImageButton buttonRightThreeMainActivity;
        public ImageButton buttonRightFourMainActivity;
        public ImageButton imageButtonMap;


        ViewHolder(View view) {
            imageViewimagezoom = (ImageView) view.findViewById(R.id.imageViewimagezoom);
            imageView_philosof = (ImageView) view.findViewById(R.id.imageview);
            titleView = (TextView) view.findViewById(R.id.title);
            descriptionView = (TextView) view.findViewById(R.id.descriptionView);

            yearView = (TextView) view.findViewById(R.id.yearView);
            NewButtonCitaty = (Button) view.findViewById(R.id.newButtonCitaty);

            newButtonPodrobnosti = (Button) view.findViewById(R.id.newButtonPodrobnosti);
            imageButtonZoom = (ImageButton) view.findViewById(R.id.newButtonZoom);
            imageButtonMap = (ImageButton) view.findViewById(R.id.imageButtonMap);

            buttonRightOneMainActivity = (ImageButton) view.findViewById(R.id.buttonZoomOneMainActivity);
            buttonRightThreeMainActivity = (ImageButton) view.findViewById(R.id.buttonRightThreeMainActivity);
            buttonRightFourMainActivity = (ImageButton) view.findViewById(R.id.buttonRightFourMainActivity);


        }
    }
}