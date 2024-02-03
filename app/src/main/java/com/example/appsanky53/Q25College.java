package com.example.appsanky53;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.fonts.FontFamily;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Q25College extends AppCompatActivity {
    TextView t;
    Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q25_college);
        t=findViewById(R.id.college);
        b1=findViewById(R.id.push);
        b2=findViewById(R.id.push1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t.setTextColor(Color.BLUE);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t.setTextSize(56);
                t.setTypeface(t.getTypeface(),Typeface.BOLD_ITALIC);            }
        });
    }
}