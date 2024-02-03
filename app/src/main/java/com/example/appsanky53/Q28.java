package com.example.appsanky53;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Q28 extends AppCompatActivity {

    EditText e1,e2;
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q28);

        e1=findViewById(R.id.numb1);
        e2=findViewById(R.id.numb2);
        b=findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    int fno=Integer.parseInt(e1.getText().toString());
                    int sno=Integer.parseInt(e2.getText().toString());
                    if (fno > 10 && sno > 10) {
                        Toast.makeText(getApplicationContext(), "Both numbers are greater than 10. Please enter new numbers.", Toast.LENGTH_SHORT).show();
                        e1.setText("");
                        e2.setText("");
                        e1.requestFocus();
                    } else {
                        Toast.makeText(getApplicationContext(), "First Number: " + fno + "\nSecond Number: " + sno, Toast.LENGTH_SHORT).show();
                    }
                } catch (Exception e) {
                    Toast.makeText(getApplicationContext(), ""+e, Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
}