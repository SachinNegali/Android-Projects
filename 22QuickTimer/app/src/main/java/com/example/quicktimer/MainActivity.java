package com.example.quicktimer;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    MediaPlayer m1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        m1 = MediaPlayer.create(this, R.raw.dushh);

        final TextView mtimer = findViewById(R.id.mtimer);
        final TextView timeout = findViewById(R.id.timeout);

        new CountDownTimer(10000, 1000){

            public void onTick(long millisecondsuntildone){
                mtimer.setText("Time:" + String.valueOf(millisecondsuntildone/1000));
            }
            public void onFinish(){

                m1.start();
                timeout.setText("Time Out!");
            }
        }.start();
    }
}
