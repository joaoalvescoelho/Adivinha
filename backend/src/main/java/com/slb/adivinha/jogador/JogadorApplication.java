package com.slb.adivinha.jogador;

import com.slb.adivinha.jogador.scrapping.ScrappingSite;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class JogadorApplication {

	private final ScrappingSite scrappingSite;

	public JogadorApplication(ScrappingSite scrappingSite) {
		this.scrappingSite = scrappingSite;
	}

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(JogadorApplication.class, args);

		ScrappingSite scrappingSite = context.getBean(ScrappingSite.class);
		scrappingSite.scrapping();
	}

}
