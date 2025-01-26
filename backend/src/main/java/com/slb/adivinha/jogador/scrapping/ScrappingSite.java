package com.slb.adivinha.jogador.scrapping;

import jakarta.transaction.Transactional;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

@Component
public class ScrappingSite {

    private final ScrappingRepo scrappingRepo;

    public ScrappingSite(ScrappingRepo scrappingRepo) {
        this.scrappingRepo = scrappingRepo;
    }

//    @Transactional
    public void scrapping() {
        try {
            // URL base da tabela paginada
            String baseUrl = "https://serbenfiquista.com/people?page=";

            // Número total de páginas
            int totalPages = 34; // Ajuste conforme necessário

            // Lista para armazenar os jogadores
            List<Jogador> jogadores = new ArrayList<Jogador>();

            // Iterar por cada página
            for (int page = 0; page <= totalPages; page++) {
                // Construir a URL da página atual
                String url = baseUrl + page;

                // Conectar à página e obter o HTML
                Document doc = Jsoup.connect(url).get();

                // Selecionar cada linha de jogador na tabela correta
                Elements players = doc.select("table.table-hover.table-striped tbody tr");

                // Iterar sobre os jogadores
                for (Element player : players) {

                    String link = player.select(".views-field-title a").attr("href");
                    if (!link.isEmpty()) {
                        Document docjogador = Jsoup.connect(link).get();
                        Elements ele = docjogador.select(".block-entity-viewnode");

                        String nome = player.select(".views-field-title a").text();
                        String jogos = player.select(".views-field-field-sl-matches-official").text();
                        String golos = player.select(".views-field-field-sl-goals-official").text();

                        for (Element player2 : ele) {

                            String posicao = "";
                            if (Objects.equals(player2.select(".field--name-field-sl-detailed-position .field--item").text(), "")) {
                                posicao = player2.select(".field--name-field-sl-person-position .field--item").text();
                                if (!posicao.equals("")) {
                                    posicao = posicao.substring(0, 1).toUpperCase() + posicao.substring(1);
                                }
                            } else {
                                posicao = player2.select(".field--name-field-sl-detailed-position .field--item").text();
                            }

                            String periodo = player2.select(".field--name-field-sl-periodo-no-benfica .field--item").text();
                            String pe = player2.select(".field--name-field-sl-favourite-foot .field--item").text();
                            String altura = player2.select(".field--name-field-sl-person-height .field--item").text();
                            String camisola =  player2.select(".field--name-field-sl-person-number .field--item").text();
                            String nacionalidade = player2.select(".field--name-field-sl-country .field--item .field__flags__item").text();

//                            Element imgElement = player2.select(".field--name-field-sb-person-full-picture img").first();
//                            String imageUrl = null;
//                            if (imgElement != null) {
//                                imageUrl = imgElement.attr("src");
//
//                                if (!imageUrl.startsWith("http")) {
//                                    imageUrl = "https://serbenfiquista.com" + imageUrl;
//                                }
//                            }

                            Jogador jogador1 = new Jogador(
                                    UUID.randomUUID(),
                                    nome,
                                    posicao != null && !posicao.isEmpty() ? posicao : "N/A",
                                    camisola != null && !camisola.isEmpty() ? camisola : "N/A",
                                    golos != null && !golos.isEmpty() ? golos : "N/A",
                                    jogos != null && !jogos.isEmpty() ? jogos : "N/A",
                                    pe != null && !pe.isEmpty() ? pe : "N/A",
                                    altura != null && !altura.isEmpty() ? altura : "N/A",
                                    nacionalidade,
                                    periodo
                            );

                            JogadorJPA jogadorJPA = Mapper.jogador2Jpa(jogador1);

                            scrappingRepo.save(jogadorJPA);

                            jogadores.add(jogador1);
                        }
                    } else {
                        System.out.println(player.select(".views-field-title a").text());
                    }

                }
//
//                // Exibir todos os jogadores
//                for (Jogador jogador : jogadores) {
//                    System.out.println(jogador);
//                }

            }
            System.out.println("TOTAL: " + jogadores.size());
            //System.out.println("RANDOM: " + jogadores.get(56));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
