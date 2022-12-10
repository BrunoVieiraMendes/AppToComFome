package com.example.app_fmu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Doce_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doce);
    }
    public void abrirSorbetdeFrutas(View view) {
        Intent intent = new Intent(this, SorbetdeFrutas_Activity.class);
        startActivity(intent);
    }

    public void abrirBolodeCenoura(View view) {
        Intent intent = new Intent(this, BolodeCenoura_Activity.class);
        startActivity(intent);
    }

    public void abrirBolodeMilho(View view) {
        Intent intent = new Intent(this, BolodeMilho_Activity.class);
        startActivity(intent);
    }

    public void abrirChocolateQuente(View view) {
        Intent intent = new Intent(this, ChocolateQuente_Activity.class);
        startActivity(intent);
    }

    public void abrirPudim(View view) {
        Intent intent = new Intent(this, Pudim_Activity.class);
        startActivity(intent);
    }

    public void abrirMenuDoceSalgado(View view) {
        Intent intent = new Intent(this, Menu_doce_salgado.class);
        startActivity(intent);
    }
}