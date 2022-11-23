package com.example.HW4;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.HW4.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements OnClickListener {
private ActivityMainBinding binding;
    private final ArrayList<Text> continentsList = new ArrayList<>();
    private Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
loadData();
        adapter = new Adapter(continentsList, this);
        binding.recycle.setAdapter(adapter);
    }
    private void loadData() {
        continentsList.clear();
        continentsList.add(new Text( "DoDo pizza"));
        continentsList.add(new Text( "Imperial pizza"));
        continentsList.add(new Text("Domino pizza"));
        continentsList.add(new Text( "FNAF pizza"));
        continentsList.add(new Text( "Gold pizza"));
    }

    @Override
    public void onClick(Text text) {
        Intent intent = new Intent(MainActivity.this,SecondActivity.class);
        intent.putExtra("text", text.getText());
        startActivity(intent);
    }
}