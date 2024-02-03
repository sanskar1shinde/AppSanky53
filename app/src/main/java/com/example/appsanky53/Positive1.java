package com.example.appsanky53;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Positive1 extends AppCompatActivity {
    EditText edit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_positive1);

        edit=findViewById(R.id.positiveno);
    }

    public void onClick(View view) {
        try {
            int no=Integer.parseInt(edit.getText().toString());
            if(no>0)
            {
                Intent i=new Intent(this, Positive2.class);
                i.putExtra("positiveval",""+no);
                startActivity(i);
                finish();
            }
            else {
                Toast.makeText(this,"Given Number is Negative Please enter Positive number",Toast.LENGTH_SHORT).show();
            }

        }
        catch (Exception e)
        {
            Toast.makeText(this,""+e,Toast.LENGTH_SHORT).show();
        }
    }
}