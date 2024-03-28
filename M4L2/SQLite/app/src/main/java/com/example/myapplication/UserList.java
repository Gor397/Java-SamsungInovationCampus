package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.database.Cursor;
import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

public class UserList extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList<String> name, age;
    DBHelper dbHelper;
    MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_list);
        dbHelper = new DBHelper(this);
        name = new ArrayList<>();
        age = new ArrayList<>();
        recyclerView = findViewById(R.id.recyclerView);
        myAdapter = new MyAdapter(this, name, age);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        displayData();
    }

    private void displayData() {
        Cursor cursor = dbHelper.getData();
        if (cursor.getCount() == 0) {
            Toast.makeText(this, "No Data To Show", Toast.LENGTH_SHORT).show();
            ;
        } else {
            while (cursor.moveToNext()) {
                name.add(cursor.getString(0));
                age.add(cursor.getString(1));
            }
        }
    }
}