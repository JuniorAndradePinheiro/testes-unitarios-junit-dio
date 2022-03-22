package br.com.junitdio;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptionsTeste {
	
	@Test
	void ValidaUsuario() {
		//Executa um teste se ele estiver dentro do contexto  ou condição passa(ou seja, ASSUMINDO que é verdadeira a condição). 
		// No caso aqui ele vai executa somente se o usuário logado no sistema NÃO for o usuário Administrador.
		Assumptions.assumeFalse("root".equals((System.getenv("USER"))));
		System.out.println("Rodou liso");
	}

	
	@Test
	void ValidaUsuario2() {
		//Executa um teste se ele estiver dentro do contexto  ou condição passa. No caso aqui ele vai executa somente se 
		//o usuário logado no sistema for o usuário Administrador. (O TESTE NÃO DEVE SER EXECUTADO NESSE CASO)
		Assumptions.assumeTrue("root".equals((System.getenv("USER"))));
		System.out.println("Ué, não era pra executar");
	}
}
