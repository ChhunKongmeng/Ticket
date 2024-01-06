package com.example.booking.view.activity;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.booking.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot()); // Replace with the name of your XML layout file

        binding.imageButton.setOnClickListener(view -> startMovieActivity());
        binding.image2Button.setOnClickListener(view -> startMovieActivity());
        binding.image3Button.setOnClickListener(view -> startMovieActivity());
        binding.image4Button.setOnClickListener(view -> startMovieActivity());
        binding.image5Button.setOnClickListener(view -> startMovieActivity());
        binding.image6Button.setOnClickListener(view -> startMovieActivity());
        binding.image7Button.setOnClickListener(view -> startMovieActivity());
        binding.image8Button.setOnClickListener(view -> startMovieActivity());
        binding.image9Button.setOnClickListener(view -> startMovieActivity());

    }

    private void startMovieActivity(){
        Intent intent = new Intent(this, SeatActivity.class);
        startActivity(intent);
    }
}
