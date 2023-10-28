package com.example.equation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calc(View view) {
        EditText numberA = findViewById(R.id.editTextNumber);
        EditText numberB = findViewById(R.id.editTextNumber2);
        EditText numberC = findViewById(R.id.editTextNumber3);
        TextView answer = findViewById(R.id.textView5);

        double a = Double.parseDouble(numberA.getText().toString());
        double b = Double.parseDouble(numberB.getText().toString());
        double c = Double.parseDouble(numberC.getText().toString());

        answer.setText(Double.toString((c - b) / a));
    }
}