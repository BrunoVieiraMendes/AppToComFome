package com.example.app_fmu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class BobodeCamarao_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bobode_camarao);
    }
    public void abrirSalgados(View view) {
        Intent intent = new Intent(this, Salgado_Activity.class);
        startActivity(intent);
    }
}