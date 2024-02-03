package com.example.appsanky53;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class  Phonecall53 extends AppCompatActivity {
    EditText E;
    ImageButton IB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phonecall53);

        try{
            E=findViewById(R.id.edt1);
            IB=findViewById(R.id.imagb1);
            IB.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i=new Intent(Intent.ACTION_CALL);
                    String str=E.getText().toString();
                    i.setData(Uri.parse("tel:" + str));

                    if(ActivityCompat.checkSelfPermission(Phonecall53.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED)
                    {
                        ActivityCompat.requestPermissions(Phonecall53.this,new String[]{Manifest.permission.CALL_PHONE},1);
                    }
                    startActivity(i);
                }
            });
        }catch(Exception e){
            Toast.makeText(this, ""+e, Toast.LENGTH_SHORT).show();
        }
    }
}