package com.example.ubay.achmadirjikubay_1202154184_modul2;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.GradientDrawable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class detail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Intent i = getIntent();
        int gambar = i.getIntExtra("gambar",0);
        String nama = i.getStringExtra("nama");
        String harga = i.getStringExtra("harga");
        String komposisis = i.getStringExtra("komposisi");
        ImageView gambarDetail = (ImageView) findViewById(R.id.detailGambar);
        TextView namaMenu = (TextView) findViewById(R.id.namaMenu);
        TextView hargaMenu = (TextView) findViewById(R.id.hargaMenu);
        TextView komposisi = (TextView) findViewById(R.id.komposisi);

        GradientDrawable drawable = new GradientDrawable();
        drawable.setSize(100,100);


        //Glide.with(this).load(getIntent().getIntExtra("image",0))
          //      .placeholder(drawable).into(gambarDetail);
        //namaMenu.setText(nama);
        //hargaMenu.setText(harga);
        //komposisi.setText(komposisis);-->
    }

    public void konfirmasi(View view) {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder.setMessage("Pemesanan Berhasil, Harap tunggu sebentar");
        alertDialogBuilder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Intent intent = new Intent(getApplicationContext(), menuawal.class);
                startActivity(intent);
            }
        });
        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }
}

