package com.example.appshalatjenazah;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SyaratActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_syarat);

        getSupportActionBar().setTitle("Syarat");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}