package com.example.kalkulator;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CalculatorFragment extends Fragment {

    private EditText etTugas, etUTS, etUAS;
    private Button btnHitung;
    private TextView tvHasil;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_calculator, container, false);
        
        etTugas = view.findViewById(R.id.etTugas);
        etUTS = view.findViewById(R.id.etUTS);
        etUAS = view.findViewById(R.id.etUAS);
        btnHitung = view.findViewById(R.id.btnHitung);
        tvHasil = view.findViewById(R.id.tvHasil);
        
        btnHitung.setOnClickListener(v -> hitungNilaiAkhir());
        
        return view;
    }
    
    private void hitungNilaiAkhir() {
        try {
            double nilaiTugas = Double.parseDouble(etTugas.getText().toString());
            double nilaiUTS = Double.parseDouble(etUTS.getText().toString());
            double nilaiUAS = Double.parseDouble(etUAS.getText().toString());
            
            double nilaiAkhir = (nilaiTugas * 0.3) + (nilaiUTS * 0.3) + (nilaiUAS * 0.4);
            
            int hasil = (int) Math.round(nilaiAkhir);
            tvHasil.setText(String.valueOf(hasil));
            tvHasil.setVisibility(View.VISIBLE);
            
        } catch (NumberFormatException e) {
            tvHasil.setText("Input tidak valid");
            tvHasil.setVisibility(View.VISIBLE);
        }
    }
}
