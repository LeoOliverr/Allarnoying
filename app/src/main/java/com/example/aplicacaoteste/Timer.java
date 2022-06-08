package com.example.aplicacaoteste;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;

public class Timer extends AppCompatActivity {

    Button btnstart, btnrestart, btnstop;
    Chronometer timer;
    long parar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timer);
        btnstart = findViewById(R.id.button3);
        btnstop = findViewById(R.id.button8);
        btnrestart = findViewById(R.id.button9);
        timer = findViewById(R.id.cronometroview);

        btnstart.setOnClickListener(new View.OnClickListener(){
           public void onClick(View v){
               timer.start();
           }
        });
        btnstop.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                timer.stop();
            }
        });
        btnrestart.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                resettimer();
            }
        });
    }

    private void resettimer() {
        timer.setBase(SystemClock.elapsedRealtime());
        parar = 0;
    }

    public void VoltarRelogio(View view){

        Intent voltar = new Intent(this, Relogio.class);
        startActivity(voltar);
    }
}