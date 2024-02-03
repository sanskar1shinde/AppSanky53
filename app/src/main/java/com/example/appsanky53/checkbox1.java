package com.example.appsanky53;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

public class checkbox1 extends AppCompatActivity {
    CheckBox c1,c2,c3;
     @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkbox1);

        c1=findViewById(R.id.ch1);
        c2=findViewById(R.id.ch2);
        c3=findViewById(R.id.ch3);

     }

    public void onChecked(View view) {

        if (c1.isChecked()==true) {
            getWindow().getDecorView().setBackgroundColor(Color.RED);
        }
        else if (c2.isChecked()==true){
            getWindow().getDecorView().setBackgroundColor(Color.BLUE);
        }else if(c3.isChecked()==true){
            getWindow().getDecorView().setBackgroundColor(Color.GREEN);
        }else {
            getWindow().getDecorView().setBackgroundColor(Color.WHITE);
        }
    }

}