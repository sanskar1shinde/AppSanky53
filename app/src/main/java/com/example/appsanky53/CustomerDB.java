package com.example.appsanky53;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CustomerDB extends AppCompatActivity {
    EditText id,name,address;
    Button insert,display;
    CustomerDatabase custdb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_db);

        id=findViewById(R.id.custid);
        name=findViewById(R.id.custname);
        address=findViewById(R.id.custadd);

        insert=findViewById(R.id.insert);
        display=findViewById(R.id.display);

        custdb=new CustomerDatabase(CustomerDB.this);

        custdb = new CustomerDatabase(CustomerDB.this);

        insert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int cid = Integer.parseInt(id.getText().toString());
                String cname = name.getText().toString();
                String caddress = address.getText().toString();
                boolean res = custdb.insertData(cid,cname,caddress);
                if(res== true)
                    Toast.makeText(CustomerDB.this, "Insertion is Done....", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(CustomerDB.this, "Insertion is Fail.....", Toast.LENGTH_SHORT).show();
            }
        });
        display.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Cursor res= custdb.getAllData();

                StringBuffer str = new StringBuffer();

                while (res.moveToNext()){
                    str.append("\n Id : "+ res.getInt(0));
                    str.append("\nName :  "+ res.getString(1));
                    str.append("\nAddress : "+res.getString(2));
                    str.append("\n");
                }
                Toast.makeText(CustomerDB.this, ""+str, Toast.LENGTH_SHORT).show();
            }
        });
    }
}