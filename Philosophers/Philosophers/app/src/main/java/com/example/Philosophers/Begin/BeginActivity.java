package com.example.Philosophers.Begin;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.example.Philosophers.R;


@SuppressWarnings("ALL")
public class BeginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_begin);
        /////////////////////////////////////////////////////////////////////////////////////////////////////

        setupActionBar();


        /////////////////////////////////////////////////////////////////////////////////////////////////////
        ImageView bottonnext = (ImageView) findViewById(R.id.bottonnext);
        Animation animationimimtwobottonnext =
        AnimationUtils.loadAnimation(getApplicationContext(), R.anim.bottonnext);
        // Use bounce interpolator with amplitude 0.2 and frequency 20
        MyAnimationInterpolator interpolator = new MyAnimationInterpolator(0.2, 2);
        animationimimtwobottonnext.setInterpolator(interpolator);
//////////////////////////////////Animation////////////////////////////////////////////////
        bottonnext.startAnimation(animationimimtwobottonnext);
        bottonnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(BeginActivity.this, BeginTwoActivity.class);
                BeginActivity.this.startActivity(intent);
            }

        });

//////////////////////////////////Animation////////////////////////////////////////////////

        ImageViewAnim (R.id.imageView_imone, R.anim.imone);
        ImageViewAnim (R.id.imageView_imtwo, R.anim.imtwo);
        ImageViewAnim (R.id.imageView_imthree, R.anim.imone);
        ImageViewAnim (R.id.imageView_imfour, R.anim.imtwo);
        ImageViewAnim (R.id.imageView_imfive, R.anim.imone);
        ImageViewAnim (R.id.imageView_imsix, R.anim.imtwo);
        ImageViewAnim (R.id.imageView_imseven, R.anim.imone);
        ImageViewAnim (R.id.imageView_imeath, R.anim.imtwo);
//////////////////////////////////Animation////////////////////////////////////////////////
        TextViewAnim (R.id.textviewversion, R.anim.scale_seven);
        TextViewAnim (R.id.textviewDeveloper, R.anim.fade_out5);
        TextViewAnim (R.id.textviewDeveloper, R.anim.scale_seven);
        TextViewAnim (R.id.textviewversionData, R.anim.fade_out5);
        TextViewAnim (R.id.textviewDevelopermail, R.anim.scale_seven);
        TextViewAnim (R.id.linebeginbottom_one, R.anim.scale_five);
        TextViewAnim (R.id.linebeginbottom, R.anim.scale_five);
        TextViewAnim (R.id.textviewversionData, R.anim.scale_seven);
//////////////////////////////////Animation////////////////////////////////////////////////
    }

    void ImageViewAnim( int res, int anim)
    {
        ImageView imageView = (ImageView) findViewById(res);
        Animation animationimimeath =
                AnimationUtils.loadAnimation(getApplicationContext(), anim);
        imageView.startAnimation(animationimimeath);
    }
    void TextViewAnim( int res, int anim)
    {
        TextView textView;
        textView = findViewById(res);
        ShowAnimation.doAnimScale(textView, getApplicationContext(), anim);
    }
//////////////////////////////////Animation////////////////////////////////////////////////
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
}
