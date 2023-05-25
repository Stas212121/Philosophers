package com.example.Philosophers.Philosophers;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Html;
import android.view.Window;

import androidx.appcompat.app.AppCompatActivity;

import com.example.Philosophers.R;


public class ExitFromApp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exit_from_app);


        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(Html.fromHtml("<font color='#E74848'>.</font>"))
                .setMessage(Html.fromHtml("<font color='#FFFFFF'>Выход из приложения!</font>"))
                .setIcon(R.drawable.ic_warning_black_24dp)
                .setCancelable(false)
                .setNegativeButton("ОК ",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                // alertdialog for exit the app
                                finishAffinity();
                                System.exit(0);
                            }
                        });
        AlertDialog alert = builder.create();
        Window vieww = ((AlertDialog) alert).getWindow();
        vieww.setBackgroundDrawableResource(R.drawable.bg_alert_toast_style);
        alert.show();

    }
}
