package com.example.appsanky53;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class RatingBar1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rating_bar1);
    }

    public void Feedback(View view) {
        Intent i=new Intent(this, RatingBar2.class);
        startActivityForResult(i,2);
    }

    @Override
    protected void onActivityResult(int code, int resultCode, @Nullable Intent i) {
        super.onActivityResult(code,resultCode,i);

        try{
            String message=i.getStringExtra("RATINGS");
            Toast.makeText(this, "You have given"+message+"Rating", Toast.LENGTH_SHORT).show();
        }catch(Exception e){
            Toast.makeText(this, ""+e, Toast.LENGTH_SHORT).show();
        }
    }
}