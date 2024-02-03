package com.example.appsanky53;

 import android.os.Bundle;
 import android.view.View;
 import android.widget.AdapterView;
 import android.widget.ArrayAdapter;
 import android.widget.ListView;
 import android.widget.Toast;

 import androidx.appcompat.app.AppCompatActivity;


public class ListView53 extends AppCompatActivity {

    ListView l;
    String weekDays[]={ "Sunday","Monday","Tuesday","WednesDay","Thursday","Friday","Saturday"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view53);

        l=findViewById(R.id.list);

        try {
            ArrayAdapter<String> arrayAdapter=new ArrayAdapter<>(this,R.layout.activity_grid_view253,R.id.myGridText,weekDays);

            l.setAdapter(arrayAdapter);
            l.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Toast.makeText(ListView53.this, "You Clicked"+arrayAdapter.getItem(position), Toast.LENGTH_SHORT).show();
                }
            });
        }
        catch(Exception e)
        {
            Toast.makeText(getApplicationContext(),""+e,Toast.LENGTH_LONG).show();
        }
    }
}