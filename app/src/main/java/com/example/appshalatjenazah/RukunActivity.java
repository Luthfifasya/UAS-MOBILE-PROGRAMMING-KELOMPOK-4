package com.example.appshalatjenazah;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class RukunActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rukun);

        getSupportActionBar().setTitle("Rukun");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}