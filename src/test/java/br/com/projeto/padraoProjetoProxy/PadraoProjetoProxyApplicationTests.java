package br.com.projeto.padraoProjetoProxy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.projeto.padraoProjetoProxy.repositoy.ClienteRepository;
import br.com.projeto.padraoProjetoProxy.repositoy.ClienteRepositoryLogProxy;
import br.com.projeto.padraoProjetoProxy.service.ClienteService;

@SpringBootTest
class PadraoProjetoProxyApplicationTests {

	@Test
	void buscarClienteSemPadraoProxy_quandoSucesso() {

		ClienteService clienteService = new ClienteService(new ClienteRepository());

		String retorno = clienteService.findById(1);

		assertEquals("Busca realizada pelo id", retorno);

	}

	@Test
	void contextLoadsx() {

		ClienteService clienteService = new ClienteService(new ClienteRepositoryLogProxy());

		String retorno = clienteService.findById(1);

		assertEquals("Log antes - Busca realizada pelo id - Log após", retorno);

	}

}
