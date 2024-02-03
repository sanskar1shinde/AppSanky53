package com.example.appsanky53;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class StudentDetailsQ7_2nd extends AppCompatActivity {
    TextView t1,t2,t3,t4,t5,t6,t7;
    String name,surname,class1,gender,hobbies,marks;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_details_q72nd);
        try {
            t1 = findViewById(R.id.st1);
            t2 = findViewById(R.id.st2);
            t3 = findViewById(R.id.st3);
            t4 = findViewById(R.id.st4);
            t5 = findViewById(R.id.st5);
            t6 = findViewById(R.id.st6);

            Intent i=new Intent();
            name=getIntent().getExtras().getString("sname");
            surname=getIntent().getExtras().getString("surname");
            class1=getIntent().getExtras().getString("class");
            gender=getIntent().getExtras().getString("gender");
            hobbies=getIntent().getExtras().getString("hobbies");
            marks=getIntent().getExtras().getString("marks");

            t1.setText(""+name);
            t2.setText(""+surname);
            t3.setText(""+class1);
            t4.setText(""+gender);
            t5.setText(""+hobbies);
            t6.setText(""+marks);
            t1.setTextSize(34);
            t2.setTextSize(34);
            t3.setTextSize(34);
            t4.setTextSize(34);
            t5.setTextSize(34);
            t6.setTextSize(34);

        }catch(Exception e)
        {
            Toast.makeText(this, "data accepted"+e, Toast.LENGTH_SHORT).show();
        }

    }
}