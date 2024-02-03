package com.example.appsanky53;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login53 extends AppCompatActivity {

    EditText e1,e2;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login53);

        try {

            e1 = findViewById(R.id.et1);
            e2 = findViewById(R.id.et2);
            b1 = findViewById(R.id.lbutton);

            b1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(e1.getText().toString().equals("TYBCA") && e2.getText().toString().equals("12345")){
                        Intent i;
                        i = new Intent(Login53.this,Login2.class);
                        startActivity(i);

                    }
                    else
                    {
                        Toast.makeText(Login53.this, "Login Failed", Toast.LENGTH_SHORT).show();
                        e1.setText("");
                        e2.setText("");
                        e1.requestFocus();
                    }
                }
            });
        }
        catch(Exception e)
        {
            Toast.makeText(this, ""+e, Toast.LENGTH_SHORT).show();
        }

    }
}