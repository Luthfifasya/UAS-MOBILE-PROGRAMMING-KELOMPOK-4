package com.example.appshalatjenazah;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class BacaanActivity extends AppCompatActivity {
    LinearLayout jenazahl, jenazahp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bacaan);

        jenazahl    = (LinearLayout) findViewById(R.id.jenazahl);
        jenazahp    = (LinearLayout) findViewById(R.id.jenazahp);

        jenazahl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hukum = new Intent(BacaanActivity.this,JenazahLActivity.class);
                startActivity(hukum);
            }
        });

        jenazahp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent syarat = new Intent(BacaanActivity.this,JenazahPActivity.class);
                startActivity(syarat);
            }
        });

        getSupportActionBar().setTitle("Bacaan");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}