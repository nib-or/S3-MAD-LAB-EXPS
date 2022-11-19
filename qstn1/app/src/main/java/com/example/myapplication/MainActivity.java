package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView t1, t2;
    EditText editTextNumber;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        t1 = findViewById(R.id.textView);
        t2 = findViewById(R.id.textView2);
        editTextNumber = findViewById(R.id.editTextNumber);
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextUtils.isEmpty(editTextNumber.getText().toString())) {
                    Toast.makeText(getApplicationContext(), "Empty box", Toast.LENGTH_LONG).show();
                    editTextNumber.setError("Enter result");

                } else {
                    if ((Integer.parseInt(t1.getText().toString()) + Integer.parseInt(t2.getText().toString())) == Integer.parseInt(editTextNumber.getText().toString())) {
                        Toast.makeText(getApplicationContext(), "YOU WIN", Toast.LENGTH_LONG).show();
                    } else {
                        Toast.makeText(getApplicationContext(), "YOU LOSE", Toast.LENGTH_LONG).show();
                    }
                }
            }
        });
    }
}
