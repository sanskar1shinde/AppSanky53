package com.example.appsanky53;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;

public class RatingBar2 extends AppCompatActivity {
    Button submit;
    RatingBar rating;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rating_bar2);

        submit=findViewById(R.id.btn1);
        rating=findViewById(R.id.rtbar1);
    }

    public void returnFeedback(View view) {
        int total=0;
        float rateVal=rating.getRating();
        Intent i=new Intent();
        i.putExtra("RATINGS",""+rateVal);
        setResult(2,i);
        finish();
    }
}
