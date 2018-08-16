package com.example.joaquinchou.bikesguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import me.wangyuwei.particleview.ParticleView;

public class MainActivity extends AppCompatActivity {

    private ParticleView mPv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mPv1 = (ParticleView) findViewById(R.id.pv_1);
        mPv1.setOnParticleAnimListener(new ParticleView.ParticleAnimListener() {
            @Override
            public void onAnimationEnd() {
                Intent intent = new Intent() ;
                intent.setClass(MainActivity.this,ShowMapActivity.class);
                startActivity(intent);
            }
        });
        mPv1.postDelayed(new Runnable() {
            @Override
            public void run() {
                mPv1.startAnim();
            }
        }, 200);
    }
}
