package com.example.appsanky53;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class StudentDetailsQ7 extends AppCompatActivity {
    EditText et1, et2, et3, et4, et5;
    RadioGroup r;
    Button b1,b2;
    String gender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_details_q7);
        try {
            et1 = findViewById(R.id.sname);
            et2 = findViewById(R.id.ssirname);
            et3 = findViewById(R.id.sclass);
            et4 = findViewById(R.id.shobbies);
            et5 = findViewById(R.id.smarks);
            r = findViewById(R.id.rgroup1);
            b1 = findViewById(R.id.studentbutton);
            b2=findViewById(R.id.studentreset);

            r.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int i) {
                    if (R.id.male1 == i) {
                        gender = "Male";
                    } else if (R.id.female1 == i) {
                        gender = "Female";
                    }
                }
            });

            b1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    String name1 = et1.getText().toString();
                    String surname = et2.getText().toString();
                    String class1 = et3.getText().toString();
                    String hobbies = et4.getText().toString();
                    String marks = et5.getText().toString();

                    Intent i=new Intent(getApplicationContext(), StudentDetailsQ7_2nd.class);
                    i.putExtra("sname",""+name1);
                    i.putExtra("surname",""+surname);
                    i.putExtra("class",""+class1);
                    i.putExtra("hobbies",""+hobbies);
                    i.putExtra("marks",""+marks);
                    i.putExtra("gender",gender);
                    startActivity(i);
                    finish();

                }
            });
            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    et1.setText("");
                    et2.setText("");
                    et3.setText("");
                    et4.setText("");
                    et5.setText("");
                    et1.requestFocus();
                }
            });

        } catch (Exception e) {
            Toast.makeText(this, "" + e, Toast.LENGTH_SHORT).show();
        }
    }
}