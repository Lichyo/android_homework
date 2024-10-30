package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView tvCounter;
    private int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvCounter = findViewById(R.id.tv_counter);
        Button btnIncrement = findViewById(R.id.btn_increment);
        Button btnDecrement = findViewById(R.id.btn_decrement);
        Button btnExit = findViewById(R.id.btn_exit);

        btnIncrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter++;
                tvCounter.setText(String.valueOf(counter));
            }
        });

        btnIncrement.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                counter += 2;
                tvCounter.setText(String.valueOf(counter));
                return true;
            }
        });

        btnDecrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter--;
                tvCounter.setText(String.valueOf(counter));
            }
        });

        btnDecrement.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                counter -= 2;
                tvCounter.setText(String.valueOf(counter));
                return true;
            }
        });

        tvCounter.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                counter = 0;
                tvCounter.setText(String.valueOf(counter));
                return true;
            }
        });

        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}