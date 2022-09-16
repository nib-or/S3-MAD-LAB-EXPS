package com.example.game;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ButtonBarLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView t1,t2,t3;
    int n1,n2,result;
    Button b;
    EditText e;
    Random rand;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=(TextView) findViewById(R.id.textView);
        t2=(TextView) findViewById(R.id.textView2);
        t3=(TextView) findViewById(R.id.textView3);
        e=(EditText) findViewById(R.id.editTextTextPersonName);
        b=(Button) findViewById(R.id.button);
        rand=new Random();
        t2.setText(""+rand.nextInt(10));
        t3.setText(""+rand.nextInt(10));
        b.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                n1=Integer.parseInt(t2.getText().toString());
                n2=Integer.parseInt(t3.getText().toString());
                result=Integer.parseInt(e.getText().toString());
                if(n1+n2==result){
                    t1.setText("You won");


                }
                else{
                    t1.setText("better luck next time");
                }
            }
        });
    }
}