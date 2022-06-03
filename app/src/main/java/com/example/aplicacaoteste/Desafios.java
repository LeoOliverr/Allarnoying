package com.example.aplicacaoteste;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Desafios extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desafios);
    }
    public void Voltardesafio(View view){
        Intent voltardesafio = new Intent(this, alarme.class);
        startActivity(voltardesafio);
    }
}