package com.example.Philosophers.Philosophers;

import static androidx.core.app.ActivityCompat.finishAffinity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

import com.example.Philosophers.R;
import com.example.Philosophers.Begin.ShowAnimation;


public class Fragmet_Exit extends Fragment {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_exit, container, false);


        LinearLayout linearLayout;
        linearLayout = view.findViewById(R.id.LinearLayoutexit);
        //int color = Integer.parseInt(String.valueOf(R.color.colorPrimaryone), 16)+0xFF000000;

        int myColor_one = ContextCompat.getColor(getContext(), R.color.colorPrimaryone);
        int myColor_two = ContextCompat.getColor(getContext(), R.color.colorPrimarytwo);


        ShowAnimation.ShowAnimColor(linearLayout, myColor_one, myColor_two, "backgroundColor", 0, 2000);


        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        builder.setTitle(Html.fromHtml("<font color='#E74848'>. </font>"))
                .setMessage(Html.fromHtml("<font color='#FFFFFF'>Выход из приложения!</font>"))
                .setIcon(R.drawable.ic_warning_black_24dp)
                .setCancelable(false)
                .setNegativeButton("ОК ",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                // alertdialog for exit the app
                                finishAffinity(getActivity());
                                System.exit(0);
                            }
                        });
        AlertDialog alert = builder.create();
        Window vieww = ((AlertDialog) alert).getWindow();
        vieww.setBackgroundDrawableResource(R.drawable.bg_alert_toast_style);
        alert.show();

        return view;
    }
}


