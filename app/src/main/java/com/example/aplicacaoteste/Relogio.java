package com.example.aplicacaoteste;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Relogio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relogio);
    }
    public void IrAlarme(View view){

        Intent alarmes = new Intent(this, MainActivity.class);
        startActivity(alarmes);
    }
    public void IrTimer(View view){

        Intent timer = new Intent(this, Timer.class);
        startActivity(timer);
    }
    public void IrCronometro(View view){

        Intent cronometro = new Intent(this, Cronometro.class);
        startActivity(cronometro);
    }
}