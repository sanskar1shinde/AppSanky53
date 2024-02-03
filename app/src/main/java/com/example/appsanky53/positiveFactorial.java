package com.example.appsanky53;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class positiveFactorial extends AppCompatActivity {
    EditText et;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_positive_factorial);
        et=findViewById(R.id.no1);
    }

    public void onClick(View view) {
        int no=Integer.parseInt(et.getText().toString());
        if (no>0){
            Intent intent=new Intent(this, positiveFactorial1.class);
            intent.putExtra("positive",""+no);
            startActivity(intent);
        }
    }
}