package com.slb.adivinha.jogador.scrapping;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ScrappingRepo extends JpaRepository<JogadorJPA, UUID> {
}
