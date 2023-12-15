package com.example.gamesshowroom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView nomeCampo;
    Button jogosButton;

    Button perfilButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        perfilButton = findViewById(R.id.perfilButton);
        jogosButton = findViewById(R.id.jogosButton);
        nomeCampo = findViewById(R.id.nomeCampo);
        this.verificarDados();
    }

    private void verificarDados() {
        SharedPreferences sharedPreferences = getSharedPreferences("meus_dados", Context.MODE_PRIVATE);
        String nome = sharedPreferences.getString("nome", null);
        int larguraTela = Resources.getSystem().getDisplayMetrics().widthPixels;

        if (nome == null) {
            nomeCampo.setText("Olá!");
            nomeCampo.setX((larguraTela - 100) / 2);
        } else {
            nomeCampo.setText("Olá, " + nome);
            nomeCampo.setX((larguraTela  - nomeCampo.getMeasuredWidth()) / 2);
        }
    }

    public void navegarPerfil(View view) {
        Intent i = new Intent(MainActivity.this, PerfilActivity.class);
        startActivity(i);
    }

    public void navegarJogos(View view) {
        Intent i = new Intent(MainActivity.this, JogosActivity.class);
        startActivity(i);
    }

    @Override
    protected void onResume() {
        super.onResume();

        this.verificarDados();
    }
}