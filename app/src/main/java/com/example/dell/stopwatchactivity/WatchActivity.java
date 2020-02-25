package com.example.dell.stopwatchactivity;

import android.os.Bundle;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.ImageView;

public class WatchActivity extends AppCompatActivity {

    Button btnstart,btnstop;
    ImageView icanchor;
    Animation roundingalone,stopiconchor;
    Chronometer timerHere;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_watch);

        btnstart=findViewById(R.id.start);
icanchor=findViewById(R.id.icanchor);
btnstop=findViewById(R.id.btnstop);
timerHere=findViewById(R.id.timerHere);

//create optional animation

//load animations
        roundingalone= AnimationUtils.loadAnimation(this,R.anim.roundingalone);
stopiconchor= AnimationUtils.loadAnimation(this,R.anim.stopiconchor);

        //import font
/*
        Typeface MMedium=Typeface.createFromAsset(getAssets(),"fonts/MMedium.ttf");
*/

        //customize font
       /* btnstart.setTypeface(MMedium);
        btnstop.setTypeface(MMedium);*/

        btnstart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //passing animation
                icanchor.setAnimation(roundingalone);
                //start time
                timerHere.setBase(SystemClock.elapsedRealtime());
                timerHere.start();
            }
        });

        btnstop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
icanchor.setAnimation(stopiconchor);
                timerHere.stop();

            }
        });
    }
}
