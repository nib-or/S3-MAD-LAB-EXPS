package com.example.splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    private ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        String tasks[]={"1","2","3","4","5"};

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list=(ListView)findViewById(R.id.lvt);
        ArrayAdapter adaptor=new ArrayAdapter<String>(this,R.layout.todolist,tasks);
        list.setAdapter(adaptor);
    }
}