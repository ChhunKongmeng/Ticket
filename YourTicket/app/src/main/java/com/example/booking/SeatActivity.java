package com.example.booking;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.booking.databinding.ActivitySeatBinding;

public class SeatActivity extends AppCompatActivity {

    private ActivitySeatBinding binding;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivitySeatBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.book.setOnClickListener(view -> confirmBooking());
    }

    private void confirmBooking(){
        Intent intent = new Intent(this, ConfirmBooking.class);
        startActivity(intent);
    }
}
