package com.example.aplicacaoteste;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent salvar = getIntent();
        String nome = salvar.getStringExtra(alarme.EXTRA_MESSAGE);

    }
    public void criaralarme(View view){

        Intent alarme = new Intent(this, alarme.class);

        startActivity(alarme);

    }
    public void VoltarRelogio(View view){

        Intent principal = new Intent(this, Relogio.class);
        startActivity(principal);
    }
    public void Editalarme(View view){

        Intent edição = new Intent(this, alarme.class);
        startActivity(edição);
    }
}