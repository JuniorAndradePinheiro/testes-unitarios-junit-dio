package br.com.junitdio;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;

public class CondicionaisJUnitTeste {

	/*
		*Executa um teste se ele estiver dentro do contexto  ou condição passa(ou seja, ASSUMINDO que é verdadeira a condição). 
		*No caso aqui ele vai executa somente se o usuário logado no sistema NÃO for o usuário Administrador.
		*Porém eu informa a condição direto na anotação e devido a isso não preciso da classe "Assumptions" 
	*/
	@Test
	@EnabledIfEnvironmentVariable(named ="USER", matches = "Junior")
	void ValidaUsuario() {
		System.out.println("Rodou liso");
	}
	
	@Test
	@EnabledIfEnvironmentVariable(named ="USER", matches = "root")
	void ValidaUsuario2() {

		System.out.println("Não era pra ter executado");
	}
}
