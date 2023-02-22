package com.aboba.ars;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calc(View view) {
        EditText weightText = findViewById(R.id.weight);
        double weight = Double.parseDouble(weightText.getText().toString());
        Button button = findViewById(R.id.button);
        String text = String.format("%.2f кг топлива", weight*(3.721/9.80665)*100);
        button.setText(text);
    }
}