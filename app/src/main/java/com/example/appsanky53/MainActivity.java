package com.example.appsanky53;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.MultiAutoCompleteTextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    AutoCompleteTextView a1;
    MultiAutoCompleteTextView m1;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        try {
            a1 = findViewById(R.id.auto1);
            m1 = findViewById(R.id.miulti1);

            String Friends[]={"Sanskar","Mukta","Darshana","Raj","Shivam","Tanmay","Shashi","Sakshi"};

            ArrayAdapter<String> adapter=new ArrayAdapter<>(this, android.R.layout.select_dialog_multichoice,Friends);
            a1.setAdapter(adapter);
            m1.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());
            m1.setAdapter(adapter);
        }
        catch(Exception e)
        {
            Toast.makeText(this, ""+e, Toast.LENGTH_SHORT).show();
        }
    }
}