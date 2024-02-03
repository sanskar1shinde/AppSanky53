package com.example.appsanky53;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CalSimple53 extends AppCompatActivity {
    EditText e1,e2,e3;
    Button b1,b2,b3,b4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cal_simple53);

        e1=findViewById(R.id.et1);
        e2=findViewById(R.id.et2);
        e3=findViewById(R.id.et3);
        b1=findViewById(R.id.badd);
        b2=findViewById(R.id.bsub);
        b3=findViewById(R.id.bmul);
        b4=findViewById(R.id.bdiv);

    }

    public void addition(View view) {
        int a=Integer.parseInt(e1.getText().toString());
        int b=Integer.parseInt(e2.getText().toString());
        int ans = a + b;
        e3.setText(ans+"");
        e1.setText("");
        e2.setText("");
        e1.requestFocus();
    }

    public void subtraction(View view) {
        int a=Integer.parseInt(e1.getText().toString());
        int b=Integer.parseInt(e2.getText().toString());
        int ans = a - b;
        e3.setText(ans+"");
        e1.setText("");
        e2.setText("");
        e1.requestFocus();
    }

    public void multiplication(View view) {
        int a=Integer.parseInt(e1.getText().toString());
        int b=Integer.parseInt(e2.getText().toString());
        int ans = a * b;
        e3.setText(ans+"");
        e1.setText("");
        e2.setText("");
        e1.requestFocus();
    }

    public void division(View view) {
        int a=Integer.parseInt(e1.getText().toString());
        int b=Integer.parseInt(e2.getText().toString());
        int ans = a / b;
        e3.setText(ans+"");
        e1.setText("");
        e2.setText("");
        e1.requestFocus();
    }
}