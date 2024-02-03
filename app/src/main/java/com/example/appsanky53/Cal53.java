package com.example.appsanky53;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Cal53 extends AppCompatActivity {
    EditText et;
    int no1,no2,ans;
    String str="",str2="";
    char ch,op;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cal53);
        et=findViewById(R.id.calciText);
    }

    public void calculate(View view) {
        try {
            str = view.getResources().getResourceEntryName(view.getId());
            str = str.substring(1, str.length());
            if (str.equals("1") || str.equals("2") || str.equals("3") || str.equals("4") ||
                    str.equals("5") || str.equals("6") || str.equals("7") || str.equals("8") ||
                    str.equals("9") || str.equals("0") || str.equals(".")) {
                str2 = str2 + str;
                et.setText(str2);
            }

            switch (str) {
                case "add":
                    ch = '+';
                    no1 = Integer.parseInt(str2);
                    str2 = "";
                    et.setText("");
                    break;
                case "sub":
                    ch = '-';
                    no1 = Integer.parseInt(str2);
                    str2 = "";
                    et.setText("");
                    break;
                case "mul":
                    ch = '*';
                    no1 = Integer.parseInt(str2);
                    str2 = "";
                    et.setText("");
                    break;
                case "div":
                    ch = '/';
                    no1 = Integer.parseInt(str2);
                    str2 = "";
                    et.setText("");
                    break;

            }
            if (str.equals("equal")) {
                no2 = Integer.parseInt(str2);
                if (ch == '+') {
                    ans = no1 + no2;
                    et.setText(ans + "");

                }
                else if (ch == '-') {
                    ans = no1 - no2;
                    et.setText(ans + "");

                }
                else if (ch == '*') {
                    ans = no1 * no2;
                    et.setText(ans + "");
                }
                else if (ch == '/') {
                    ans = no1 / no2;
                    et.setText(ans + "");

                }
              }
            if(str.equals("res"))
            {
                no1=0;
                no2=0;
                et.setText("");
                str="";
                str2="";
            }
        }
        catch(Exception e)
        {
            Toast.makeText(this, ""+e, Toast.LENGTH_SHORT).show();
        }
    }

}