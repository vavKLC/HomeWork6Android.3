package com.example.homework6android3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.homework6android3.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        initClickers();
    }

    private void initClickers() {
        Math math = new Math();
        binding.btnVis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num1 = binding.etNum1.getText().toString();
                String num2 = binding.etNum2.getText().toString();
                String result = math.plus(num1,num2);
                binding.tvResult.setText(result);
            }
        });
    }
}