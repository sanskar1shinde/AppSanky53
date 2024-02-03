package com.example.appsanky53;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class activityLifecycle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lifecycle);
        Intent i=new Intent(getApplicationContext(),checkbox1.class);
        startActivity(i);
        Toast.makeText(this, "onCreate Called", Toast.LENGTH_SHORT).show();
    }
    protected void onStart(){
        super.onStart();
        Toast.makeText(this, "OnStart Called", Toast.LENGTH_SHORT).show();
    }
    protected void onPause(){
        super.onPause();
        Toast.makeText(this, "onPause Called", Toast.LENGTH_SHORT).show();
    }
    protected void onStop(){
        super.onStop();
        Toast.makeText(this, "onStop Called", Toast.LENGTH_SHORT).show();
    }
    protected void onRestart(){
        super.onRestart();
        Toast.makeText(this, "onRestart Called", Toast.LENGTH_SHORT).show();
    }
    protected void onResume(){
        super.onResume();
        Toast.makeText(this, "onResume Called", Toast.LENGTH_SHORT).show();
    }
    protected void onDestroy(){
        super.onDestroy();
        Toast.makeText(this, "onDestroy Called", Toast.LENGTH_SHORT).show();
    }
}