package com.example.firstproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ActivityKedua extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);TextView is = findViewById(R.id.is_text);
        TextView i = findViewById(R.id.is_tex1);

        Bundle ambil = getIntent().getExtras();
        if (ambil == null) {
            return;
        }

        String nama = ambil.getString("nama_key");
        String alamat = ambil.getString("alamat_key");

        if (nama != null) {
            is.setText(nama);

        }

        if (alamat != null) {
            i.setText(alamat);

        }
        setContentView(R.layout.activity_kedua);


    }
}