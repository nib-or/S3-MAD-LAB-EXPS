package com.example.layout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3,b4,b5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.button3);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent n=new Intent(MainActivity.this,L1.class);
                startActivity(n);
            }
        });
        b2=findViewById(R.id.button4);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent o=new Intent(MainActivity.this,l2.class);
                startActivity(o);
            }
        });
        b3=findViewById(R.id.button5);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent p=new Intent(MainActivity.this,l3.class);
                startActivity(p);
            }
        });
        b4=findViewById(R.id.button6);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent q=new Intent(MainActivity.this,l4.class);
                startActivity(q);
            }
        });
        b5=findViewById(R.id.button7);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent r=new Intent(MainActivity.this,l5.class);
                startActivity(r);
            }
        });
    }
}