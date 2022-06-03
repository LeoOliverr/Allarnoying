package com.example.aplicacaoteste;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textonome;
    TextView textohora;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent salvar = getIntent();
        String nome = salvar.getStringExtra(alarme.EXTRA_MESSAGE);
        String hora = salvar.getStringExtra(alarme.EXTRA_MESSAGE);
        textonome = (TextView)findViewById(R.id.textView4);
        textonome.setText(nome);
        textohora = (TextView)findViewById(R.id.textView8);
        textohora.setText(hora);
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