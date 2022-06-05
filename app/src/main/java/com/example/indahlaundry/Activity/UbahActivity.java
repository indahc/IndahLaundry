package com.example.indahlaundry.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.indahlaundry.R;

public class UbahActivity extends AppCompatActivity {
    private int xId;
    private String xNama, xAlamat, xTelepon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ubah);

        Intent terima = getIntent();
        xId = terima.getIntExtra("xId", -1);
        xNama = terima.getStringExtra("xNama");
        xAlamat = terima.getStringExtra("xAlamat");
        xTelepon = terima.getStringExtra("xTelepon");


    }
}