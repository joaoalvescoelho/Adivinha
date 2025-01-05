package com.slb.adivinha.jogador.scrapping;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ScrappingRepo extends JpaRepository<JogadorJPA, UUID> {
}
