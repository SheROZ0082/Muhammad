package com.example.HW4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.HW4.databinding.ActivityMainBinding;
import com.example.HW4.databinding.ActivitySecondBinding;

public class SecondActivity extends AppCompatActivity {
    private ActivitySecondBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySecondBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Intent intent = getIntent();
        String img = intent.getStringExtra("IMG") ;
        String result = intent.getStringExtra("text");
        binding.resultText.setText(result);
        ;

        binding.btnStartSp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Эрмек лох",Toast.LENGTH_SHORT).show();
            }
        });
    }
}