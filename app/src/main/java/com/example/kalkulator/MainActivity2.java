package com.example.kalkulator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        
        Button btnKalkulator = findViewById(R.id.btnKalkulator);
        Button btnKeluar = findViewById(R.id.btnKeluar);
        
        btnKalkulator.setOnClickListener(v -> {
            CalculatorFragment fragment = new CalculatorFragment();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.fragmentContainer, fragment);
            transaction.addToBackStack(null);
            transaction.commit();
        });
        
        btnKeluar.setOnClickListener(v -> {
            finish();
        });
    }
}
