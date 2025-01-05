package com.slb.adivinha.jogador.scrapping;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.UUID;

@Entity
@Table(name = "players")
public class JogadorJPA {

    public UUID id;
    public String nome;
    public String posicao;
    public short numero;
    public short golos;
    public short jogos;
    public String pe;
    public short altura;
    public String pais;
    public String periodoEquipa;
    public byte[] foto;

    @Id
    @GeneratedValue
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

    public short getNumero() {
        return numero;
    }

    public void setNumero(short numero) {
        this.numero = numero;
    }

    public short getGolos() {
        return golos;
    }

    public void setGolos(short golos) {
        this.golos = golos;
    }

    public short getJogos() {
        return jogos;
    }

    public void setJogos(short jogos) {
        this.jogos = jogos;
    }

    public String getPe() {
        return pe;
    }

    public void setPe(String pe) {
        this.pe = pe;
    }

    public short getAltura() {
        return altura;
    }

    public void setAltura(short altura) {
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