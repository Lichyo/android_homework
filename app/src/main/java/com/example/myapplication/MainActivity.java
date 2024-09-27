package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    public void bigger(View view) {
        TextView textView = findViewById(R.id.textView);
        float size = textView.getTextSize();
        textView.setTextSize(0, size + 5);
    }

    public void resetText(View view) {
        TextView textView = findViewById(R.id.textView);
        textView.setTextSize(0, 40);
    }

    public void getTextFieldLength(View view) {
        EditText editText = findViewById(R.id.textField);
        String string = editText.getText().toString();
        TextView textView = findViewById(R.id.textView);
        textView.setText("字串長度: " + string.length());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        findViewById(R.id.getTextButton).setOnClickListener(this::getTextFieldLength);
        findViewById(R.id.textView).setOnClickListener(this::resetText);
        findViewById(R.id.biggerButton).setOnClickListener(this::bigger);
    }
}