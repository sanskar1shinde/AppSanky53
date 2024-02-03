package com.example.appsanky53;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class StudentDB extends AppCompatActivity {
    EditText name,phoneno;
    Button insert,display,delete;
    StudentDatabase studb;
    int sid=2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_db);

         name=findViewById(R.id.stuname);
        phoneno=findViewById(R.id.stuphoneno);

        insert=findViewById(R.id.stinsert);
        display=findViewById(R.id.stdisplay);
        delete=findViewById(R.id.stdelete);

        studb=new StudentDatabase(StudentDB.this);

        insert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sid++;
                String sname = name.getText().toString();
                String sphoneno = phoneno.getText().toString();
                boolean res = studb.insertData(sid,sname,sphoneno);
                if(res== true)
                    Toast.makeText(StudentDB.this, "Insertion is Done....", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(StudentDB.this, "Insertion is Fail.....", Toast.LENGTH_SHORT).show();
                name.setText("");
                phoneno.setText("");
                name.requestFocus();
            }
        });
        display.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Cursor res= studb.getAllData();

                StringBuffer str = new StringBuffer();

                while (res.moveToNext()){
                    str.append("\nId : "+ res.getInt(0));
                    str.append("\nName :  "+ res.getString(1));
                    str.append("\nPhoneno : "+res.getString(2));
                    str.append("\n");
                }
                Toast.makeText(StudentDB.this, ""+str, Toast.LENGTH_SHORT).show();
            }
        });
       delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sid=0;
                String name1 = name.getText().toString();
                String phoneno1 = phoneno.getText().toString();
                boolean res = studb.deleteData(sid,name1,phoneno1);
                if(res== true)
                    Toast.makeText(StudentDB.this, "Deletion is Done....", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(StudentDB.this, "Deletion is Fail.....", Toast.LENGTH_SHORT).show();
            }
        });
    }
}