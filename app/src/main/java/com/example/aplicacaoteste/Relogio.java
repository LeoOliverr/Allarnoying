package com.example.aplicacaoteste;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Calendar;

public class Relogio extends AppCompatActivity {

    TextView horario;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relogio);
        horario = (TextView)findViewById(R.id.editTextTime);

        LocalizarHorario();
    }

    private void LocalizarHorario() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());

        String horarioatual = String.format("%02d:%02d", calendar.get(Calendar.HOUR_OF_DAY), calendar.get(Calendar.MINUTE));

        horario.setText(horarioatual);
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