package com.example.Philosophers.Philosophers;

import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.view.Display;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;

import androidx.appcompat.app.AppCompatActivity;

import com.example.Philosophers.R;

import java.util.ArrayList;



public class ImageHorizontalScrollActivity extends AppCompatActivity {

    LinearLayout parmenid, aristotel, mark_avreliy,
            anselm, spinoza, shopengauer, nicshe, ponti;
    LayoutParams params;
    LinearLayout next, prev;
    int viewWidth;
    GestureDetector gestureDetector = null;
    HorizontalScrollView horizontalScrollView;
    ArrayList<LinearLayout> layouts;
    int parentLeft, parentRight;
    int mWidth;
    int currPosition, prevPosition;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_horizontal_scroll_two);

        prev = (LinearLayout) findViewById(R.id.prev);
        next = (LinearLayout) findViewById(R.id.next);
        horizontalScrollView = (HorizontalScrollView) findViewById(R.id.hsv);
        gestureDetector = new GestureDetector(new MyGestureDetector());
        parmenid = (LinearLayout) findViewById(R.id.layout_parmenid);
        aristotel = (LinearLayout) findViewById(R.id.layout_aristotel);
        mark_avreliy = (LinearLayout) findViewById(R.id.layout_mark_avreliy);
        anselm = (LinearLayout) findViewById(R.id.layout_anselm);
        spinoza = (LinearLayout) findViewById(R.id.layout_spinoza);
        shopengauer = (LinearLayout) findViewById(R.id.layout_shopengauer);
        nicshe = (LinearLayout) findViewById(R.id.layout_nicshe);
        ponti = (LinearLayout) findViewById(R.id.layout_ponti);

        Display display = getWindowManager().getDefaultDisplay();
        mWidth = display.getWidth(); // deprecated
        viewWidth = mWidth / 3;
        layouts = new ArrayList<LinearLayout>();
        params = new LayoutParams(viewWidth, LayoutParams.WRAP_CONTENT);

        parmenid.setLayoutParams(params);
        aristotel.setLayoutParams(params);
        mark_avreliy.setLayoutParams(params);
        anselm.setLayoutParams(params);
        spinoza.setLayoutParams(params);
        shopengauer.setLayoutParams(params);
        nicshe.setLayoutParams(params);
        ponti.setLayoutParams(params);

        layouts.add(parmenid);
        layouts.add(aristotel);
        layouts.add(mark_avreliy);
        layouts.add(anselm);
        layouts.add(spinoza);
        layouts.add(shopengauer);
        layouts.add(nicshe);
        layouts.add(ponti);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new Handler().postDelayed(new Runnable() {
                    public void run() {
                        horizontalScrollView.smoothScrollTo(
                                (int) horizontalScrollView.getScrollX()
                                        + viewWidth,
                                (int) horizontalScrollView.getScrollY());
                    }
                }, 100L);
            }
        });

        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new Handler().postDelayed(new Runnable() {
                    public void run() {
                        horizontalScrollView.smoothScrollTo(
                                (int) horizontalScrollView.getScrollX()
                                        - viewWidth,
                                (int) horizontalScrollView.getScrollY());
                    }
                }, 100L);
            }
        });

        horizontalScrollView.setOnTouchListener(new OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (gestureDetector.onTouchEvent(event)) {
                    return true;
                }
                return false;
            }
        });
    }

    public int getVisibleViews(String direction) {
        Rect hitRect = new Rect();
        int position = 0;
        int rightCounter = 0;
        for (int i = 0; i < layouts.size(); i++) {
            if (layouts.get(i).getLocalVisibleRect(hitRect)) {
                if (direction.equals("left")) {
                    position = i;
                    break;
                } else if (direction.equals("right")) {
                    rightCounter++;
                    position = i;
                    if (rightCounter == 2)
                        break;
                }
            }
        }
        return position;
    }

    class MyGestureDetector extends SimpleOnGestureListener {
        @Override
        public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX,
                               float velocityY) {
            if (e1.getX() < e2.getX()) {
                currPosition = getVisibleViews("left");
            } else {
                currPosition = getVisibleViews("right");
            }

            horizontalScrollView.smoothScrollTo(layouts.get(currPosition)
                    .getLeft(), 0);
            return true;
        }
    }
}
