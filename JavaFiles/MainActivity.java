package com.vertexplus.conciergex.activity;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;


import com.vertexplus.conciergex.R;
import com.vertexplus.conciergex.utils.RatingBar;
import com.vertexplus.conciergex.utils.ResizeAnimation;

public class MainActivity extends AppCompatActivity {

    private View viewBg;
    private RatingBar myRatingBar;
    private DisplayMetrics metrics;
    private int pixls;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewBg = (View) findViewById(R.id.nutrition_bar_filled);
        myRatingBar = findViewById(R.id.ratingBar);
        metrics = new DisplayMetrics();
        this.getWindowManager().getDefaultDisplay().getMetrics(metrics);
        //int pageMargin = (int) ((metrics.widthPixels / 4) * 2);

        pixls = dpToPx(this, 68);


        myRatingBar.setOnRatingChangeListener(new RatingBar.OnRatingChangeListener() {
            @Override
            public void onChange(RatingBar view, int preCount, int curCount) {
                Log.i("TAG", String.format("previous count:%d, current count:%d", preCount, curCount));
                viewBg.setVisibility(View.VISIBLE);
                ViewGroup.LayoutParams layoutParams = viewBg.getLayoutParams();
                //   int pageWidth = view.getWidth();

             /*   if (metrics.widthPixels > 320 && metrics.widthPixels <= 480) {
                    setRatings(preCount, curCount, (float) 0.92, layoutParams);
                } else if (metrics.widthPixels > 480 && metrics.widthPixels <= 640) {
                    setRatings(preCount, curCount, (float) 1.0, layoutParams);
                } else if (metrics.widthPixels > 640 && metrics.widthPixels <= 720) {
                    setRatings(preCount, curCount, (float) 1.16, layoutParams);
                } else if (metrics.widthPixels > 720 && metrics.widthPixels <= 840) {
                    setRatings(preCount, curCount, (float) 1.32, layoutParams);
                } else if (metrics.widthPixels > 840 && metrics.widthPixels <= 1080) {
                    setRatings(preCount, curCount, (float) 1.98, layoutParams);
                } else if (metrics.widthPixels > 1080 && metrics.widthPixels <= 1240) {
                    setRatings(preCount, curCount, (float) 3.00, layoutParams);
                } else if (metrics.widthPixels > 1240 && metrics.widthPixels <= 1440) {
                    setRatings(preCount, curCount, (float) 3.56, layoutParams);
                }*/

                setRatings(preCount, curCount, pixls, layoutParams);
            }
        });
    }


    private void startAnimation(View view, int targetWidth) {
        ResizeAnimation resizeAnimation2 = new ResizeAnimation(view, targetWidth);
        resizeAnimation2.setDuration(800);
        view.startAnimation(resizeAnimation2);
    }


   /* public void setRatings(int preCount, int curCount, float ratio, ViewGroup.LayoutParams layoutParams) {
        if (curCount > preCount) {
            switch (curCount) {
                case 1:
                    layoutParams.width = (int) (ratio * (curCount * 100)) + 8;
                    startAnimation(viewBg, layoutParams.width);
                    break;
                case 2:
                    layoutParams.width = (int) (ratio * (curCount * 100)) + 2;
                    startAnimation(viewBg, layoutParams.width);
                    break;
                case 3:
                    layoutParams.width = (int) (ratio * (curCount * 100)) - 3;
                    startAnimation(viewBg, layoutParams.width);
                    break;
                case 4:
                    layoutParams.width = (int) (ratio * (curCount * 100)) - 6;
                    startAnimation(viewBg, layoutParams.width);
                    break;
                case 5:
                    layoutParams.width = (int) (ratio * (curCount * 100)) - 3;
                    startAnimation(viewBg, layoutParams.width);
                    break;
            }
        } else if (preCount > curCount) {
            switch (curCount) {
                case 1:
                    layoutParams.width = (int) (ratio * ((preCount * 100) - (Math.abs(curCount - preCount) * 100))) + 8;
                    startAnimation(viewBg, layoutParams.width);
                    break;
                case 2:
                    layoutParams.width = (int) (ratio * ((preCount * 100) - (Math.abs(curCount - preCount) * 100))) + 2;
                    startAnimation(viewBg, layoutParams.width);
                    break;
                case 3:
                    layoutParams.width = (int) (ratio * ((preCount * 100) - (Math.abs(curCount - preCount) * 100))) - 3;
                    startAnimation(viewBg, layoutParams.width);
                    break;
                case 4:
                    layoutParams.width = (int) (ratio * ((preCount * 100) - (Math.abs(curCount - preCount) * 100))) - 6;
                    startAnimation(viewBg, layoutParams.width);
                    break;
                case 5:
                    layoutParams.width = (int) (ratio * ((preCount * 100) - (Math.abs(curCount - preCount) * 100))) - 3;
                    startAnimation(viewBg, layoutParams.width);
                    break;
            }
        }

    }*/


    public void setRatings(int preCount, int curCount, int pixls, ViewGroup.LayoutParams layoutParams) {
        if (curCount > preCount) {
            switch (curCount) {
                case 1:
                    layoutParams.width = curCount * pixls;
                    startAnimation(viewBg, layoutParams.width);
                    break;
                case 2:
                    layoutParams.width = curCount * pixls;
                    startAnimation(viewBg, layoutParams.width);
                    break;
                case 3:
                    layoutParams.width = curCount * pixls;
                    startAnimation(viewBg, layoutParams.width);
                    break;
                case 4:
                    layoutParams.width = curCount * pixls;
                    startAnimation(viewBg, layoutParams.width);
                    break;
                case 5:
                    layoutParams.width = curCount * pixls;
                    startAnimation(viewBg, layoutParams.width);
                    break;
            }
        } else if (preCount > curCount) {
            switch (curCount) {
                case 1:
                    layoutParams.width = (preCount * pixls) - (Math.abs(curCount - preCount) * pixls);
                    startAnimation(viewBg, layoutParams.width);
                    break;
                case 2:
                    layoutParams.width = (preCount * pixls) - (Math.abs(curCount - preCount) * pixls);
                    startAnimation(viewBg, layoutParams.width);
                    break;
                case 3:
                    layoutParams.width = (preCount * pixls) - (Math.abs(curCount - preCount) * pixls);
                    startAnimation(viewBg, layoutParams.width);
                    break;
                case 4:
                    layoutParams.width = (preCount * pixls) - (Math.abs(curCount - preCount) * pixls);
                    startAnimation(viewBg, layoutParams.width);
                    break;
                case 5:
                    layoutParams.width = (preCount * pixls) - (Math.abs(curCount - preCount) * pixls);
                    startAnimation(viewBg, layoutParams.width);
                    break;
            }
        }

    }


    public static int dpToPx(Context context, int dp) {
        float density = context.getResources().getDisplayMetrics().density;
        return Math.round((float) dp * density);
    }

}
