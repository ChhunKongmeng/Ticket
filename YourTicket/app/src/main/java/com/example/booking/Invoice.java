package com.example.booking;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.booking.databinding.ActivityInvoiceBinding;

public class Invoice extends AppCompatActivity {

    private ActivityInvoiceBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityInvoiceBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.backInvoice.setOnClickListener(view -> finish());

    }
}
