package com.example.explicitintentdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try {
            TextView tv = findViewById(R.id.name);
            if (tv==null) {
                throw new NullPointerException("aaa");
            }
            tv.setText("Hi Aram");
        } catch (NullPointerException e) {
            System.out.println("Error reported: " + e.getMessage());
        }

        FileReaderDemo fileReaderDemo = new FileReaderDemo();
        fileReaderDemo.fileContent(getApplicationContext(), "Anahit.txt");
    }
}