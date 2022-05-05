package com.example.aplicacaoteste;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class alarme extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarme);
    }

    public void  irTelaPrincipal(View view){
        Intent voltar = new Intent(this,MainActivity.class);
        startActivity(voltar);
    }
    public void desafios(View view){
        Intent irdesafios = new Intent(this, Desafios.class);
        startActivity(irdesafios);
    }
}