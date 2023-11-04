package com.example.layoutdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clicked(View view){
        Toast.makeText(this, "Hi Gor", Toast.LENGTH_SHORT).show();
        TextView t = findViewById(R.id.textView);
        t.setText("Hi Gor");
    }
}