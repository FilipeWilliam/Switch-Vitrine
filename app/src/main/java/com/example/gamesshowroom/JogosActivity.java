package com.example.gamesshowroom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class JogosActivity extends AppCompatActivity {
    private LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jogos);

        linearLayout = findViewById(R.id.gameListLayout);

        ScrollView scrollView = findViewById(R.id.scrollView);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                (int) (Resources.getSystem().getDisplayMetrics().heightPixels));
        scrollView.setLayoutParams(layoutParams);

        List<Jogo> jogos = getJogos();
        for (Jogo jogo : jogos) {
            addJogo(jogo);
        }
    }

    private void addJogo(Jogo jogo) {
        ImageView imagem = new ImageView(this);
        imagem.setImageResource(jogo.getImagem());
        imagem.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imagem.setLayoutParams(new LinearLayout.LayoutParams(400, 400));

        TextView nome = new TextView(this);
        nome.setText(jogo.getNome());

        TextView dataLancamento = new TextView(this);
        dataLancamento.setText("Lançamento: " + jogo.getDataLancamento());

        TextView notaCritica = new TextView(this);
        notaCritica.setText("Nota: " + jogo.getNotaCritica());

        TextView genero = new TextView(this);
        genero.setText("Gênero: " + jogo.getGenero());

        TextView preco = new TextView(this);
        preco.setText("Preço atual: " + jogo.getPreco());

        LinearLayout linearLayoutCelula = new LinearLayout(this);
        linearLayoutCelula.setOrientation(LinearLayout.HORIZONTAL);

        LinearLayout linearLayoutImagem = new LinearLayout(this);
        linearLayoutImagem.setOrientation(LinearLayout.VERTICAL);
        linearLayoutImagem.addView(imagem);
        linearLayoutCelula.addView(linearLayoutImagem);

        LinearLayout linearLayoutInformacoes = new LinearLayout(this);
        linearLayoutInformacoes.setOrientation(LinearLayout.VERTICAL);
        linearLayoutInformacoes.addView(nome);
        linearLayoutInformacoes.addView(dataLancamento);
        linearLayoutInformacoes.addView(notaCritica);
        linearLayoutInformacoes.addView(genero);
        linearLayoutInformacoes.addView(preco);
        linearLayoutInformacoes.setPadding(20, 0, 0, 0);
        linearLayoutCelula.addView(linearLayoutInformacoes);

        // Adiciona a célula da lista ao layout principal
        linearLayout.addView(linearLayoutCelula);
        linearLayoutCelula.setPadding(10, 10, 10, 10);
    }

    private List<Jogo> getJogos() {
        // Simula a obtenção dos dados dos jogos
        List<Jogo> jogos = new ArrayList<>();

        jogos.add(new Jogo(R.drawable.game1, "The Legend of Zelda: Breath of the Wild", "2017", "97", "Ação", "R$349,90"));
        jogos.add(new Jogo(R.drawable.game2, "Super Mario Odyssey", "2017", "97", "Plataforma", "R$299,90"));
        jogos.add(new Jogo(R.drawable.game3, "Hogwarts Legacy", "2023", "-", "RPG", "R$299,90"));
        jogos.add(new Jogo(R.drawable.game4, "Pokémon Scarlet", "2023", "-", "RPG", "R$299,90"));
        jogos.add(new Jogo(R.drawable.game5, "Mario Strikers: Battle League Football", "2022", "88", "Esporte", "R$299,90"));
        jogos.add(new Jogo(R.drawable.game6, "NBA 2K24", "2023", "-", "Esporte", "R$299,90"));
        jogos.add(new Jogo(R.drawable.game7, "Metroid Dread", "2021", "97", "Ação", "R$299,90"));
        jogos.add(new Jogo(R.drawable.game8, "Super Smash Bros. Ultimate", "2020", "96", "Luta", "R$249,00"));
        jogos.add(new Jogo(R.drawable.game9, "Animal Crossing: New Horizons", "2020", "90", "Simulação", "R$249,90"));
        jogos.add(new Jogo(R.drawable.game10, "Bayonetta 3", "2023", "-", "Ação", "R$299,90"));
        jogos.add(new Jogo(R.drawable.game11, "FC24", "2023", "-", "Esporte", "R$299,90"));
        jogos.add(new Jogo(R.drawable.game12, "Pokémon Arceus", "2022", "93", "RPG", "R$299,90"));
        jogos.add(new Jogo(R.drawable.game13, "Ace Attorney", "2023", "-", "Aventura", "R$299,90"));
        jogos.add(new Jogo(R.drawable.game14, "The Witcher 3: Wild Hunt", "2015", "93", "RPG", "R$249,90"));
        jogos.add(new Jogo(R.drawable.game15, "Monster Hunter Stories 2: Wings of Ruin", "2021", "88", "RPG", "R$299,90"));
        jogos.add(new Jogo(R.drawable.game16, "Hades", "2020", "97", "Ação", "R$249,00"));
        jogos.add(new Jogo(R.drawable.game17, "Persona Tactics", "2023", "-", "RPG", "R$299,90"));

        return jogos;
    }
}