package com.example.jwllls.apphelper.ui.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.animation.AccelerateDecelerateInterpolator;

import com.eftimoff.androipathview.PathView;
import com.example.jwllls.apphelper.R;

import butterknife.ButterKnife;

/**
 * Created by jwllls on 2017/12/2.
 */

public class WelcomeActivity extends Activity {


    //    @BindView(R.id.pathView)
    PathView pathView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        ButterKnife.bind(this);

        pathView = (PathView) findViewById(R.id.pathView);


        pathView.getPathAnimator()
                .delay(10)
                .duration(3000)
                .interpolator(new AccelerateDecelerateInterpolator())
                .listenerEnd(new PathView.AnimatorBuilder.ListenerEnd() {
                    @Override
                    public void onAnimationEnd() {
                        jump();
                    }
                }).start();

    }

    public void jump() {
        startActivity(new Intent(this, MainActivity.class));
        finish();
    }
}
