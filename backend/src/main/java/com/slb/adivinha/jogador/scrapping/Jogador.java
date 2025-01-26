package com.slb.adivinha.jogador.scrapping;

import java.util.UUID;

public class Jogador {

    private UUID id;
    private String nome;
    private String posicao;
    private String numero;
    private String golos;
    private String jogos;
    private String pe;
    private String altura;
    private String pais;
    private String periodoEquipa;
    private byte[] foto;

    public Jogador(UUID id, String nome, String posicao, String numero, String golos, String jogos, String pe, String altura, String pais, String periodoEquipa) {
        this.id = id;
        this.nome = nome;
        this.posicao = posicao;
        this.numero = numero;
        this.golos = golos;
        this.jogos = jogos;
        this.pe = pe;
        this.altura = altura;
        this.pais = pais;
        this.periodoEquipa = periodoEquipa;
        this.foto = foto;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getGolos() {
        return golos;
    }

    public void setGolos(String golos) {
        this.golos = golos;
    }

    public String getJogos() {
        return jogos;
    }

    public void setJogos(String jogos) {
        this.jogos = jogos;
    }

    public String getPe() {
        return pe;
    }

    public void setPe(String pe) {
        this.pe = pe;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getPeriodoEquipa() {
        return periodoEquipa;
    }

    public void setPeriodoEquipa(String periodoEquipa) {
        this.periodoEquipa = periodoEquipa;
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }

}

