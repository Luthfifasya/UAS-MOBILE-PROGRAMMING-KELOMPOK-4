package com.example.appshalatjenazah;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {

    LinearLayout hukum, syarat, rukun, bacaan, tentang;


    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hukum       = (LinearLayout) findViewById(R.id.hukum);
        syarat      = (LinearLayout) findViewById(R.id.syarat);
        rukun       = (LinearLayout) findViewById(R.id.rukun);
        bacaan      = (LinearLayout) findViewById(R.id.bacaan);
        tentang     = (LinearLayout) findViewById(R.id.tentang);


        hukum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hukum = new Intent(MainActivity.this,HukumActivity.class);
                startActivity(hukum);
            }
        });

        syarat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent syarat = new Intent(MainActivity.this,SyaratActivity.class);
                startActivity(syarat);
            }
        });

        rukun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rukun = new Intent(MainActivity.this,RukunActivity.class);
                startActivity(rukun);
            }
        });

        bacaan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bacaan = new Intent(MainActivity.this,BacaanActivity.class);
                startActivity(bacaan);
            }
        });

        tentang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tentang = new Intent(MainActivity.this,TentangActivity.class);
                startActivity(tentang);
            }
        });
    }
}