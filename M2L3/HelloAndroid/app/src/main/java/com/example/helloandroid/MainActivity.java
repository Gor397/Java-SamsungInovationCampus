package com.example.helloandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void hello(View view) {
        EditText editText = findViewById(R.id.editTextText);
        TextView textView = findViewById(R.id.textViewHelloName);
        textView.setText("Hello " + editText.getText().toString());

//        Toast.makeText(this, editText.getText().toString(), Toast.LENGTH_SHORT).show();
    }
}