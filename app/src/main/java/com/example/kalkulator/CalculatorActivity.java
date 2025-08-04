package com.example.kalkulator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class CalculatorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.);
        
        Button btnKeluar = findViewById(R.id.btnKeluar);
        btnKeluar.setOnClickListener(v -> {finish();
        });
    }
}
