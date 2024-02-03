package com.example.appsanky53;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.ToggleButton;

public class tButton extends AppCompatActivity {
    ToggleButton t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tbutton);
        t=findViewById(R.id.toggleButton);
        
        t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (t.isChecked()==true){
                    Toast.makeText(tButton.this, "Toggle Button is ON", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(tButton.this, "Toggle Button is OFF", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}