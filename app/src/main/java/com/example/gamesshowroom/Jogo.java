package com.example.gamesshowroom;

public class Jogo {

    private String nome;
    private String dataLancamento;
    private String notaCritica;
    private String genero;
    private String preco;
    private int imagem;

    public Jogo(int imagem, String nome, String dataLancamento, String notaCritica, String genero, String preco) {
        this.imagem = imagem;
        this.nome = nome;
        this.dataLancamento = dataLancamento;
        this.notaCritica = notaCritica;
        this.genero = genero;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(String dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public String getNotaCritica() {
        return notaCritica;
    }

    public void setNotaCritica(String notaCritica) {
        this.notaCritica = notaCritica;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}