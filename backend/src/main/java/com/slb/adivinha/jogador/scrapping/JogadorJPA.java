package com.slb.adivinha.jogador.scrapping;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "players")
public class JogadorJPA {


    public UUID id;
    public String nome;
    public String posicao;
    public String numero;
    public String golos;
    public String jogos;
    public String pe;
    public String altura;
    public String pais;
    public String periodoEquipa;
    public byte[] foto;

    @Id
    @GeneratedValue
    @Column(name = "uuid")
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    @Column(name = "nome")
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Column(name = "posicao")
    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    @Column(name = "numero")
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Column(name = "golos")
    public String getGolos() {
        return golos;
    }

    public void setGolos(String golos) {
        this.golos = golos;
    }

    @Column(name = "jogos")
    public String getJogos() {
        return jogos;
    }

    public void setJogos(String jogos) {
        this.jogos = jogos;
    }

    @Column(name = "pe")
    public String getPe() {
        return pe;
    }

    public void setPe(String pe) {
        this.pe = pe;
    }

    @Column(name = "altura")
    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    @Column(name = "pais")
    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Column(name = "periodo_na_equipa")
    public String getPeriodoEquipa() {
        return periodoEquipa;
    }

    public void setPeriodoEquipa(String periodoEquipa) {
        this.periodoEquipa = periodoEquipa;
    }

    @Column(name = "foto")
    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }
}