package com.example.ubay.achmadirjikubay_1202154184_modul2;

import android.content.res.TypedArray;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.menu.MenuAdapter;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;


import java.util.ArrayList;

public class daftarmenu extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private ArrayList<menu> mMenu;
    private menuAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftarmenu);
//      mangambil id recycler view dari layout
        mRecyclerView = (RecyclerView) findViewById(R.id.RecyclerView);
//      set manjadi linear layout
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        // membuat array list objekl menuawal untuk menyimpan String dan image
        mMenu = new ArrayList<>();
//      membuat adapter untuk recycler view
        mAdapter = new menuAdapter(this, mMenu);

        initializeData();
    }

    private void initializeData() {
        //Get the resources from the XML file
//        mengambil array list string
        String[] menuList = getResources().getStringArray(R.array.nama);
        String[] menuHarga = getResources().getStringArray(R.array.harga);
        String[] menuKomposisi = getResources().getStringArray(R.array.komposisi);
        TypedArray menuImageResources = getResources().obtainTypedArray(R.array.gambar);
        //Clear the existing data (to avoid duplication)

        mMenu.clear();

        //memasukkan String dan Image id ke Array list Menu objek
        for(int i=0; i<menuList.length; i++){
            mMenu.add(new menu(menuList[i], menuHarga[i], menuKomposisi[i],
                    menuImageResources.getResourceId(i,0)));
        }
        //Recycle the typed array
        menuImageResources.recycle();

        //notifkasi perubahan ppada adapter dan menggunakan adaptr pada recycler view
        mAdapter.notifyDataSetChanged();
        mRecyclerView.setAdapter(mAdapter);
    }


}
