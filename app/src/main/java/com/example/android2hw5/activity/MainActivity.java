package com.example.android2hw5.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.android2hw5.R;
import com.example.android2hw5.databinding.ActivityMainBinding;

public class MainActivity  extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}