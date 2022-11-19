package com.example.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    private Spinner sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sp=(Spinner)findViewById(R.id.spinner);
        String courses[]={"C","JAVA","PYTHON","JAVASCRIPT"};
        ArrayAdapter adapter=new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item);
        sp.setAdapter(adapter);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            @Override
            public void OnIemSeo
        }

    }
}