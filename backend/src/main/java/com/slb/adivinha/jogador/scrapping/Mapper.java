package com.slb.adivinha.jogador.scrapping;

public class Mapper {

    public Mapper() {

    }

    public static JogadorJPA jogador2Jpa(Jogador jogador) {

        JogadorJPA jogadorJPA = new JogadorJPA();

        jogadorJPA.setNome(jogador.getNome());
        jogadorJPA.setPosicao(jogador.getPosicao());
        jogadorJPA.setNumero(jogador.getNumero());
        jogadorJPA.setGolos(jogador.getGolos());
        jogadorJPA.setJogos(jogador.getJogos());
        jogadorJPA.setPe(jogador.getPe());
        jogadorJPA.setAltura(jogador.getAltura());
        jogadorJPA.setPais(jogador.getPais());
        jogadorJPA.setPeriodoEquipa(jogador.getPeriodoEquipa());
        //jogadorJPA.setFoto(jogador.getFoto());

        return jogadorJPA;

    }
}
