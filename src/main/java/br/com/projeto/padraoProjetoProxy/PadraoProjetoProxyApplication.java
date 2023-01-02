package br.com.projeto.padraoProjetoProxy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.projeto.padraoProjetoProxy.repositoy.ClienteRepositoyLogProxy;
import br.com.projeto.padraoProjetoProxy.service.ClienteService;

@SpringBootApplication
public class PadraoProjetoProxyApplication {

	public static void main(String[] args) {
		SpringApplication.run(PadraoProjetoProxyApplication.class, args);

		System.out.println("----------------------");
		System.out.println("ENTROU NA APLICAÇÃO!!!");
		System.out.println("----------------------");
		
	}

}
