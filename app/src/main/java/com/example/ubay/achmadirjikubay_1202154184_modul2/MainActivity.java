package com.example.ubay.achmadirjikubay_1202154184_modul2;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private final int SPLASH_DISPLAY_LENGTH =1000;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent intent = new Intent(MainActivity.this, menuawal.class);
                startActivity(intent);
                finish();
                //membuat pesan Toast
                Toast.makeText(MainActivity.this,"ACHMAD IRJIK UBAY 1202154184",Toast.LENGTH_LONG).show();
                finish();
            }
        },SPLASH_DISPLAY_LENGTH);

    }
}
