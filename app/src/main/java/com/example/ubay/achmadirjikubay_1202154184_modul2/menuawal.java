package com.example.ubay.achmadirjikubay_1202154184_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class menuawal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void pesanmakan(View view) {

        RadioButton dine =(RadioButton) findViewById(R.id.dinein);
        RadioButton take =(RadioButton) findViewById(R.id.takeaway);

        if(dine.isChecked()){
            Intent a = new Intent(this,dinein.class);
            Toast.makeText(menuawal.this,"Dine In",Toast.LENGTH_LONG).show();
            startActivity(a);
        }else if(take.isChecked()){
            Intent b = new Intent(this,takeaway.class);
            Toast.makeText(menuawal.this,"Take Away",Toast.LENGTH_LONG).show();
            startActivity(b);
        }else{
            Toast noone = Toast.makeText(this,"Pilih Salah Satu", Toast.LENGTH_LONG);
            noone.show();
        }
    }
}
