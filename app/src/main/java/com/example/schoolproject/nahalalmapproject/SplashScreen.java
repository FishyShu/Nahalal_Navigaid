package com.example.schoolproject.nahalalmapproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashScreen extends AppCompatActivity {


    // Key and FireBase:
    // Has internet connection -->
    // set up Firebase && check current key --> if current key doesn't matches
    // --> get update and set current key as new key; else --> do nothing

    //Automatically login into account if user already logged --> else --> do nothing


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        Handler handler = new Handler();
        //start the timer
        handler.postDelayed((new Runnable() {
            @Override
            public void run() {

                Intent intent = new Intent(SplashScreen.this, MainActivity.class);

                startActivity(intent);
                //startActivity(intent)
                finish();
            }
        }),2000);
    }
}