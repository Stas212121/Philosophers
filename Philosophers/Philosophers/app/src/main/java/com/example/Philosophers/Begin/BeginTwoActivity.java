package com.example.Philosophers.Begin;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.Philosophers.R;


public class BeginTwoActivity extends AppCompatActivity {
    private EditText inputSearch;

    private TextView textviewprivate;
    private TextView linebeginprivate;
    private EditText plain_text_private;
    private ImageView bottonnextprivate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_begin_two);



        /////////////////////////////////////////////////////////////////////////////////////////////////////


        ImageView bottonnext = (ImageView) findViewById(R.id.bottonnext);




        bottonnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BeginTwoActivity.this, MainActivity.class);
                BeginTwoActivity.this.startActivity(intent);
            }
        });

        TextView textviewwelcome;
        textviewwelcome = findViewById(R.id.textviewwelcome);
        ShowAnimation.doAnimScale(textviewwelcome, getApplicationContext(), R.anim.scale_vosem);
    }
}

