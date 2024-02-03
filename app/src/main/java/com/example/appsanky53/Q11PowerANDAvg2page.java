package com.example.appsanky53;


import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Q11PowerANDAvg2page extends AppCompatActivity {

    Button b;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q11_power_andavg2page);

        b=findViewById(R.id.back);

        try {
            String abc=getIntent().getExtras().getString("power");
            String a=getIntent().getExtras().getString("average");

            Toast.makeText(this, "Power of Number is: "+abc, Toast.LENGTH_SHORT).show();
            Toast.makeText(this, "Average of Number is:"+a, Toast.LENGTH_SHORT).show();

        }catch(Exception e){
            Toast.makeText(this, ""+e, Toast.LENGTH_SHORT).show();
        }
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(), Q11PowerANDAvg.class);
                startActivity(i);
            }
        });

    }

}