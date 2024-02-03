package com.example.appsanky53;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.Toast;

public class GridView53 extends AppCompatActivity {
    GridView grid;
    String weekDays[]={ "Sunday","Monday","Tuesday","WednesDay","Thursday","Friday",};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view53);

        grid=findViewById(R.id.grid1);

        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<>(this,R.layout.activity_grid_view253,R.id.myGridText,weekDays);

         grid.setAdapter(arrayAdapter);
         grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
             @Override
             public void onItemClick(AdapterView<?> parent,View view, int position, long id) {
                  Toast.makeText(GridView53.this, "You Clicked"+arrayAdapter.getItem(position), Toast.LENGTH_SHORT).show();
             }
         });

    }


}