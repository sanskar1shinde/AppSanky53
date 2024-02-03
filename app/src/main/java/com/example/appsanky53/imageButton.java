package com.example.appsanky53;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class imageButton extends AppCompatActivity {
    ImageButton b;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_button);
        
        b=findViewById(R.id.imageButton);
        
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(imageButton.this, "This is ImageButton ", Toast.LENGTH_SHORT).show();
            }
        });
    }
}