package com.example.appsanky53;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class positiveFactorial1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_positive_factorial1);

        int no=Integer.parseInt(getIntent().getExtras().getString("positive"));
        int fact=1;
        for (int i=1;i<=no;i++){
            fact=fact*i;
        }
        Toast.makeText(this, "Factorial of Given number is: "+fact, Toast.LENGTH_SHORT).show();
    }
}