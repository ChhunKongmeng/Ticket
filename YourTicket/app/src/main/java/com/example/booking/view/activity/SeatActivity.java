package com.example.booking.view.activity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.booking.databinding.ActivitySeatBinding;

public class SeatActivity extends AppCompatActivity {

    private ActivitySeatBinding binding;


    @SuppressLint("UseCompatTextViewDrawableApis")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivitySeatBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.book.setOnClickListener(view -> confirmBooking());

        binding.seat.setOnClickListener(view -> binding.seat.setCompoundDrawableTintList(ColorStateList.valueOf(Color.parseColor("#00FF0A"))));
        binding.seat1.setOnClickListener(view -> binding.seat1.setCompoundDrawableTintList(ColorStateList.valueOf(Color.parseColor("#00FF0A"))));
        binding.seat2.setOnClickListener(view -> binding.seat2.setCompoundDrawableTintList(ColorStateList.valueOf(Color.parseColor("#00FF0A"))));
        binding.seat3.setOnClickListener(view -> binding.seat3.setCompoundDrawableTintList(ColorStateList.valueOf(Color.parseColor("#00FF0A"))));
    }

    private void confirmBooking(){
        Intent intent = new Intent(this, ConfirmBooking.class);
        startActivity(intent);
    }
}
