package com.example.gamesshowroom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.snackbar.Snackbar;

public class PerfilActivity extends AppCompatActivity {
    Button salvarButton;

    EditText nameField;
    EditText emailField;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);

        salvarButton = findViewById(R.id.salvarButton);
        nameField = findViewById(R.id.nameField);
        emailField = findViewById(R.id.emailField);
    }

    public void salvarDados(View view) {
        String nome = nameField.getText().toString();
        String email = emailField.getText().toString();
        SharedPreferences sharedPreferences = getSharedPreferences("meus_dados", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("nome", nome);
        editor.putString("email", email);
        editor.apply();

        Snackbar snackbar = Snackbar.make(view, "Dados salvos com sucesso!", Snackbar.LENGTH_SHORT);
        snackbar.show();
    }

    private void verificarDados() {
        SharedPreferences sharedPreferences = getSharedPreferences("meus_dados", Context.MODE_PRIVATE);
        String nome = sharedPreferences.getString("nome", null);
        String email = sharedPreferences.getString("email", null);

        if (nome != null) {
            nameField.setText(nome);
        }

        if (email != null) {
            emailField.setText(email);
        }
    }

    @Override
    protected void onResume() {
        super.onResume();

        this.verificarDados();
    }
}