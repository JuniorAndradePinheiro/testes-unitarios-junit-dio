package br.com.junitdio;

import java.time.LocalDateTime;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ConsultaDadosPessoaTeste {
	
	//Indica que será executado esse trecho de código uma única vez durante a execução da classe antes de tudo
	@BeforeAll
	static void configuraConexao() {
		DataBase.iniciarConexao();
	}
	
	//Antes de cada teste insere estes dados
	@BeforeEach
	void insereDadosParaTeste() {
		DataBase.insereDados(new Pessoa("Jacqueline", LocalDateTime.of(1990, 8, 7, 12, 0 )));
	}

	//Remove os dados no final de cada Teste
	@AfterEach
	void removeDadosParaTeste() {
		DataBase.removeDados(new Pessoa("Jacqueline", LocalDateTime.of(1990, 8, 7, 12, 0 )));
	}
	
	@Test
	void validaDadosDeRetorno() {
		Assertions.assertTrue(true);
	}
	
	@Test
	void validarSeNull() {
		Assertions.assertNull(null);
	}
	
	
	//Indica que será executado esse trecho de código uma única vez durante a execução da classe depois de todo resto.
	@AfterAll
	static void FinalizarConexao() {
		DataBase.finalizarConexao();
		System.out.println("Rodou finaliza configuração");
	}
}
