package com.example.appsanky53;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SMS53 extends AppCompatActivity {
    EditText ENO,ESMS;
    Button B1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sms53);

        ESMS=findViewById(R.id.smset1);
        ENO=findViewById(R.id.smset2);
        B1=findViewById(R.id.smsbtn);

        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ContextCompat.checkSelfPermission(SMS53.this, Manifest.permission.SEND_SMS) != PackageManager.PERMISSION_GRANTED)
                {
                    ActivityCompat.requestPermissions(SMS53.this,new String[]{Manifest.permission.SEND_SMS},1);

                    sendSMS();
                }
                else{
                    sendSMS();
                }
            }
        });
    }
    protected void sendSMS() {
        try{
            if(ContextCompat.checkSelfPermission(SMS53.this,Manifest.permission.SEND_SMS) == PackageManager.PERMISSION_GRANTED)
            {
                SmsManager sms=SmsManager.getDefault();
                String no=ENO.getText().toString(),
                        msg=ESMS.getText().toString();
                sms.sendTextMessage(no,null,msg,null,null);

                Toast.makeText(this, "Message Send Successfully", Toast.LENGTH_SHORT).show();
            }
            else{
                Toast.makeText(this, "Please Grant Permission First", Toast.LENGTH_SHORT).show();
            }
        }catch (Exception e){
            Toast.makeText(this, ""+e, Toast.LENGTH_SHORT).show();
        }
    }
}