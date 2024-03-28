package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.myapplication.R;

public class MainActivity extends AppCompatActivity {

    EditText name, age;
    Button insert, view;
    DBHelper dbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.name);
        age = findViewById(R.id.age);
        insert = findViewById(R.id.insert);
        view = findViewById(R.id.view);
        dbHelper = new DBHelper(this);

        insert.setOnClickListener(v -> {
            nameTxt = name.getText().toString();
            String ageTxt = age.getText().toString();

            if (dbHelper.insertUserInfo(nameText, ageText)) {
                Toast.makeText(this, "New Entry Inserted successfully!", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "New Entry !Inserted successfully!", Toast.LENGTH_SHORT).show();
            }
        });

        view.setOnClickListener(v -> {

        });
    }
}