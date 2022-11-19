package com.example.qstn2;

import static android.content.ClipData.newIntent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String TAG="MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(getApplicationContext(),"onCreate called",Toast.LENGTH_LONG).show();
        Log.e(TAG,"onCreate called");
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,MainActivity2.class);
                startActivity(i);

            }
        });
    }
    protected void onStart(){
        super.onStart();
        Toast.makeText(getApplicationContext(),"onStart called",Toast.LENGTH_LONG).show();
        Log.e(TAG,"onStart called");
    }
    @Override
    protected void onRestart(){
        super.onRestart();
        Toast.makeText(getApplicationContext(),"onRestart called",Toast.LENGTH_LONG).show();
        Log.e(TAG,"onCreate called");
    }
    @Override
    protected void onPause(){
        super.onPause();
        Toast.makeText(getApplicationContext(),"onPause called",Toast.LENGTH_LONG).show();
        Log.e(TAG,"onPause called");
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Toast.makeText(getApplicationContext(),"onDestroy called",Toast.LENGTH_LONG).show();
        Log.e(TAG,"onDestroy called");
    }
}