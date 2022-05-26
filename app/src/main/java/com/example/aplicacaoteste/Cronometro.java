package com.example.aplicacaoteste;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Cronometro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cronometro);
    }
    public void VoltarRelogio(View view){

        Intent voltar2 = new Intent(this, Relogio.class);
        startActivity(voltar2);
    }
}