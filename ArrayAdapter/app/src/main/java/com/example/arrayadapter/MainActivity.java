package com.example.arrayadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    private ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        String Countrycodes[] = {"India-91","Canada-1","Baharain-973","Australia-61","Brazil-55"};
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list = (ListView) findViewById(R.id.lstView);
        ArrayAdapter adapter = new ArrayAdapter<String>(this,R.layout.activity_list,Countrycodes);
        list.setAdapter(adapter);
    }
}