package com.slb.adivinha.jogador.scrapping;

public class Jogador {

    private String nome;
    private String posicao;
    private String periodo;
    private String jogos;
    private String golos;
    private String link;

    public Jogador(String nome, String posicao, String periodo, String jogos, String golos, String link) {
        this.nome = nome;
        this.posicao = posicao;
        this.periodo = periodo;
        this.jogos = jogos;
        this.golos = golos;
        this.link = link;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Posição: " + posicao + ", Período: " + periodo +
                ", Jogos: " + jogos + ", Golos: " + golos + ", Link: " + link;
    }
}

