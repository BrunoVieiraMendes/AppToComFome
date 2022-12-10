package com.example.app_fmu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Salgado_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salgado);
    }

    public void abrirCaldodeAbobora(View view) {
        Intent intent = new Intent(this, CaldodeAbobora_Activity.class);
        startActivity(intent);
    }

    public void abrirSanduiche(View view) {
        Intent intent = new Intent(this, Sanduiche_Activity.class);
        startActivity(intent);
    }

    public void abrirSalada(View view) {
        Intent intent = new Intent(this, Salada_Activity.class);
        startActivity(intent);
    }

    public void abrirCoxinha(View view) {
        Intent intent = new Intent(this, Coxinha_Activity.class);
        startActivity(intent);
    }

    public void abrirBobodeCamarao(View view) {
        Intent intent = new Intent(this, BobodeCamarao_Activity.class);
        startActivity(intent);
    }

    public void abrirMenuDoceSalgado(View view) {
        Intent intent = new Intent(this, Menu_doce_salgado.class);
        startActivity(intent);
    }
}