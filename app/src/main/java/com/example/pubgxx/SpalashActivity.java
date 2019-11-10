package com.example.pubgxx;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.view.WindowManager;

public class SpalashActivity extends AppCompatActivity {


    int pros;
    public static final String PREFER_NAME = "MyPrefsFile";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spalash);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                dowork();
                Intent intent=new Intent(SpalashActivity.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        thread.start();
    }
    public void dowork()
    {
        for (pros=10;pros<=100;pros=pros+10){

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}


