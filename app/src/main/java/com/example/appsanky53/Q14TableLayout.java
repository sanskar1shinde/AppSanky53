package com.example.appsanky53;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Q14TableLayout extends AppCompatActivity {
    EditText e1,e2,e3,e4,e5;
    RadioGroup r;
    String gender="";

     @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q14_table_layout);
        try {
            e1=findViewById(R.id.fname);
            e2=findViewById(R.id.lname);
            e3=findViewById(R.id.address);
            e4=findViewById(R.id.pno);
            e5=findViewById(R.id.email);
            r=findViewById(R.id.rgroup1);

            r.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int i) {
                    try {
                        if (i == R.id.male) {
                            gender = "Male";
                        } else if (i == R.id.female) {
                            gender = "Female";
                        }
                    }catch(Exception e)
                    {
                        Toast.makeText(getApplicationContext(),""+e,Toast.LENGTH_SHORT).show();
                    }
                }
            });

        }catch (Exception e)
        {
            Toast.makeText(this, ""+e, Toast.LENGTH_SHORT).show();
        }
    }

    public void submit(View view) {

        Toast.makeText(getApplicationContext(),"First Name :"+(e1.getText().toString())+"\n"+"Last Name: "+(e2.getText().toString())+"\n"+"Address:"+(e3.getText().toString())+"\n"+"Phone No: "+(e4.getText().toString())+"\n"+"Email: "+(e5.getText().toString()+"\n"+"Gender: "+gender),Toast.LENGTH_SHORT).show();
    }

    public void clear(View view) {
        e1.setText("");
        e2.setText("");
        e3.setText("");
        e4.setText("");
        e5.setText("");
        e1.requestFocus();
    }
}