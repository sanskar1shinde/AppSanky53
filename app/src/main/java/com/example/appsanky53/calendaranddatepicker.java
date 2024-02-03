package com.example.appsanky53;

import androidx.appcompat.app.AppCompatActivity;

import android.icu.util.Calendar;
import android.os.Bundle;
import android.widget.DatePicker;
import android.widget.TimePicker;
import android.widget.Toast;

public class calendaranddatepicker extends AppCompatActivity {
    DatePicker d;
    TimePicker t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendaranddatepicker);

        d=findViewById(R.id.dtpick);
        t=findViewById(R.id.tpick);

        Calendar c=Calendar.getInstance();

        d.init(c.get(Calendar.DAY_OF_MONTH),c.get(Calendar.MONTH),c.get(Calendar.YEAR), new DatePicker.OnDateChangedListener() {
            @Override
            public void onDateChanged(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                Toast.makeText(calendaranddatepicker.this, ""+d.getDayOfMonth()+"_"+(d.getMonth()+1)+"_"+d.getYear(), Toast.LENGTH_SHORT).show();
            }
        });
        t.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
            @Override
            public void onTimeChanged(TimePicker view, int i, int minute) {
                int hour=i;
                if (hour>=12)
                    hour=0;
                else
                    hour=i;
                Toast.makeText(calendaranddatepicker.this, ""+hour+":"+minute, Toast.LENGTH_SHORT).show();

            }
        });
    }
}