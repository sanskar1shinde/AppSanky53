package com.example.appsanky53;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioGroup;

import java.util.Locale;

public class UpperLower extends AppCompatActivity {

    EditText et1,et2;
    RadioGroup r;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upper_lower);

        et1=findViewById(R.id.input);
        et2=findViewById(R.id.output);
        r=findViewById(R.id.rgroup1);

        r.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {


                if(i==R.id.lower){
                    String str=et1.getText().toString();
                    et2.setText(str.toUpperCase(Locale.ROOT));

                } else if (i==R.id.upper) {
                    String str=et1.getText().toString();
                    et2.setText(str.toLowerCase(Locale.ROOT));
                }
                else if(i== R.id.right5){
                    String str=et1.getText().toString();
                    et2.setText(str.substring(et1.length() - 5,et1.length()));
                } else if (i==R.id.left5) {
                    String str=et1.getText().toString();
                    et2.setText(str.substring(0,5));
                }
            }
        });
    }
}