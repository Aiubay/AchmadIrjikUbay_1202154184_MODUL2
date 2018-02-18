package com.example.ubay.achmadirjikubay_1202154184_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class takeaway extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_takeaway);
    }

    public void mesan(View view) {
        Intent a = new Intent(this,dinein.class);
        startActivity(a);
    }
}
