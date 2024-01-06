package com.example.booking.view.activity;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.booking.databinding.ActivityConfirmBookingBinding;

public class ConfirmBooking extends AppCompatActivity {

    private ActivityConfirmBookingBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityConfirmBookingBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.checkout.setOnClickListener(view -> showInvoice());
        binding.back.setOnClickListener(view -> finish());
    }

    private void showInvoice(){
        Intent intent = new Intent(this, Invoice.class);
        startActivity(intent);
    }
}
