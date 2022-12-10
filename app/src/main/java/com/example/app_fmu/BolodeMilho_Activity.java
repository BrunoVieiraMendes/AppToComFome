package com.example.app_fmu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class BolodeMilho_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bolode_milho);
    }
    public void abrirDoces(View view) {
        Intent intent = new Intent(this, Doce_Activity.class);
        startActivity(intent);
    }
}