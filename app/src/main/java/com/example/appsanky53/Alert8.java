package com.example.appsanky53;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Alert8 extends AppCompatActivity {
    Button b1;
    EditText et1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert8);
        b1 = findViewById(R.id.btn1);
        et1 = findViewById(R.id.aledit1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int no=Integer.parseInt(et1.getText().toString());
                int fact=1;
                for(int i=1;i<=no;i++){
                    fact=fact*i;
                }
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(Alert8.this);

                alertDialogBuilder.setTitle("Factorial of"+no+"\t"+"is:"+fact);
                alertDialogBuilder.setCancelable(false);

                alertDialogBuilder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                     }
                });
                alertDialogBuilder.setNeutralButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        et1.setText("");
                        et1.requestFocus();
                     }
                });
                alertDialogBuilder.setPositiveButton("Exit", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();
                    }
                });
                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();
            }
        });
    }
}