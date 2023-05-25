package com.example.Philosophers.Begin;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ShowAnimation extends AppCompatActivity {

    public static void ShowAnimColor(Object oblect, int myColor_one, int myColor_two, String prorertyname, int repeatcount, int durating) {

        @SuppressLint("ResourceType") ObjectAnimator objectAnimator = ObjectAnimator.ofObject(oblect, prorertyname,
                new ArgbEvaluator(),
                myColor_one,
                myColor_two);

        objectAnimator.setRepeatCount(repeatcount);
        objectAnimator.setRepeatMode(ValueAnimator.RESTART);
        objectAnimator.setDuration(durating);
        objectAnimator.start();
    }


    public static void doAnimScale(Object object, Context context, final int id) {
        //Context context = context;
        TextView textView = (TextView) object;
        Animation anim;
        anim = AnimationUtils.loadAnimation(context, id);

        // запускаем анимацию компонента
        textView.startAnimation(anim);
    }
}
