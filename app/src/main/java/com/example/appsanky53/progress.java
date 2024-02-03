package com.example.appsanky53;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

public class progress extends AppCompatActivity {
    ProgressBar pg;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress);
        pg=findViewById(R.id.progressBar);
        pg.setProgress(20);
    }

    public void onProgressChange(View view) {
        Thread t=new Thread(){
            public void run(){
                for(int i=20;i<=100;i=i+5){
                    try {
                        sleep(1000);
                    }catch(Exception e){
                        e.printStackTrace();
                    }
                    pg.setProgress(i);
                }
            }
        };
        t.start();
    }
}