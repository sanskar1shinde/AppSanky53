package com.example.appsanky53;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Q11PowerANDAvg extends AppCompatActivity {
    EditText E1,E2;
    Button B;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q11_power_andavg);

        E1=findViewById(R.id.e1);
        E2=findViewById(R.id.e2);
        B=findViewById(R.id.b1);

    }
    public void calculate(View view) {
        int a=Integer.parseInt(E1.getText().toString());
        int b=Integer.parseInt(E2.getText().toString());

        int pow = 1;
        while (b != 0) {
            pow =pow * a;
            --b;
        }

        int a1=Integer.parseInt(E1.getText().toString());
        int b1=Integer.parseInt(E2.getText().toString());
        int ans= (a1 + b1)/2;

        Intent i=new Intent(this, Q11PowerANDAvg2page.class);
        i.putExtra("power",""+pow);
        i.putExtra("average",""+ans);
        startActivity(i);
    }
}