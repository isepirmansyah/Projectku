package com.example.firstproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public int jumlah = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) { //sebagai langkah dalam pembuatan aktifity
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //menentukan layout mana yang kita pakai

        TextView txtHW = findViewById(R.id.is_0);
        final TextView txtNama = findViewById(R.id.is_nama);
        final TextView txtAlamat = findViewById(R.id.is_alamat);
        TextView txtHobi = findViewById(R.id.is_hobi);
        Button btnMove = findViewById(R.id.btn_pindah);

        txtHW.setText("Selamat Datang");
        txtNama.setText("Isep Irmansyah");
        txtAlamat.setText("Tegalgede, Garut");
        txtHobi.setText("Player Keyboadist");


        txtNama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Anda menekan tulisan "+txtNama.getText(),
                        Toast.LENGTH_SHORT).show();

            }
        });

        txtAlamat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Anda menekan tulisan alamat "+txtAlamat.getText(),
                        Toast.LENGTH_SHORT).show();

            }
        });

        txtHW.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jumlah++;
                Toast.makeText(getApplicationContext(),"anda menekan judul sebanyak !! " + jumlah + " kali",
                        Toast.LENGTH_SHORT).show();

            }
        });

        btnMove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ActivityKedua.class);
                intent.putExtra("nama_key", txtNama.getText()); //akan membawa data dari main aktifity
                intent.putExtra("alamat_key", txtAlamat.getText());
                startActivity(intent);
//                finish();
//                onDestroy(); APLIKASI LANGSUNG TERUS BERHENTI

            }
        });
    }
}