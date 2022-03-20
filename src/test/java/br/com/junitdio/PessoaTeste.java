package br.com.junitdio;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PessoaTeste {

	@Test
	void deveCalcularIdadeCorretamente() {
		Pessoa pessoa1 = new Pessoa("Jessica", LocalDateTime.of(1992, 9, 23, 15, 0));
		
		Assertions.assertEquals(29, pessoa1.getIdade());
	}
	
	@Test
	void deveRetornarSeEhMaiorDeIdade() {
		Pessoa pessoa2 = new Pessoa("Jessica", LocalDateTime.of(1992, 9, 23, 15, 0));
		Assertions.assertTrue(pessoa2.ehMaiordeIdade());
		
		Pessoa pessoa3 = new Pessoa("João", LocalDateTime.now());
		Assertions.assertFalse(pessoa3.ehMaiordeIdade());
	}
}
