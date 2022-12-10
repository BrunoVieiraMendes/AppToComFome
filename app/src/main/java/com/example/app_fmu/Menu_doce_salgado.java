package com.example.app_fmu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Menu_doce_salgado extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_doce_salgado);
    }

    public void abrirSalgados(View view) {
        Intent intent = new Intent(this, Salgado_Activity.class);
        startActivity(intent);
    }

    public void abrirDoces(View view) {
        Intent intent = new Intent(this, Doce_Activity.class);
        startActivity(intent);
    }
    public void abrirMain(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}