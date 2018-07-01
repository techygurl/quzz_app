package com.example.android.forestryquizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class welcome extends AppCompatActivity {
    Intent newactivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        newactivity = new Intent(this, MainActivity.class);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        int delay = 3000;
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                startActivity(newactivity);
            }
        }, delay);
    }


}


