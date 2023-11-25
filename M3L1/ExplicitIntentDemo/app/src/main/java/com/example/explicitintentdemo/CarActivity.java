package com.example.explicitintentdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class CarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            String carIndex = bundle.getString("CarIndex");
            setImage(carIndex);
        }
    }

    private void setImage(String carIndex) {
        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        switch (carIndex) {
            case "1":
                imageView.setImageResource(R.drawable.car1);
                break;
            case "2":
                imageView.setImageResource(R.drawable.car2);
                break;
            case "3":
                imageView.setImageResource(R.drawable.car3);
                break;
            case "4":
                imageView.setImageResource(R.drawable.car4);
                break;
            case "5":
                imageView.setImageResource(R.drawable.car5);
                break;
        }
    }
}