package com.example.appsanky53;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class Positive2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_positive2);
        try {
            String valForm1=getIntent().getExtras().getString("positiveval");
            int no=Integer.parseInt(valForm1);
            int i;
            int fact=1;
            for (i=1;i<=no;i++){
                fact=fact*i;
            }
            Toast.makeText(this, "Factorial of Given Number is "+fact, Toast.LENGTH_SHORT).show();

        }catch (Exception e)
        {
            Toast.makeText(this, ""+e, Toast.LENGTH_SHORT).show();
        }
    }


}