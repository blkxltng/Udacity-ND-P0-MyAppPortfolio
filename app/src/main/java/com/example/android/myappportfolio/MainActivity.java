package com.example.android.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonPopMovies = (Button) findViewById(R.id.buttonPopMovies);
        Button buttonStockHawk = (Button) findViewById(R.id.buttonStockHawk);
        Button buttonBuildBigger = (Button) findViewById(R.id.buttonBuildBigger);
        Button buttonMakeMaterial = (Button) findViewById(R.id.buttonMakeMaterial);
        Button buttonGoUbi = (Button) findViewById(R.id.buttonGoUbi);
        Button buttonCapstone = (Button) findViewById(R.id.buttonCapstone);

        buttonPopMovies.setOnClickListener(this);
        buttonStockHawk.setOnClickListener(this);
        buttonBuildBigger.setOnClickListener(this);
        buttonMakeMaterial.setOnClickListener(this);
        buttonGoUbi.setOnClickListener(this);
        buttonCapstone.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.buttonPopMovies:
                Toast.makeText(MainActivity.this, "This button will launch my Popular Movies app!",
                        Toast.LENGTH_SHORT).show();
                break;

            case R.id.buttonStockHawk:
                Toast.makeText(MainActivity.this, "This button will launch my Stock Hawk app!",
                        Toast.LENGTH_SHORT).show();
                break;

            case R.id.buttonBuildBigger:
                Toast.makeText(MainActivity.this, "This button will launch my Build it Bigger app!",
                        Toast.LENGTH_SHORT).show();
                break;

            case R.id.buttonMakeMaterial:
                Toast.makeText(MainActivity.this, "This button will launch my Make it Material app!",
                        Toast.LENGTH_SHORT).show();
                break;

            case R.id.buttonGoUbi:
                Toast.makeText(MainActivity.this, "This button will launch my Go Ubiquitous app!",
                        Toast.LENGTH_SHORT).show();
                break;

            case R.id.buttonCapstone:
                Toast.makeText(MainActivity.this, "This button will launch my Capstone app!",
                        Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
