package br.com.junitdio;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

//Esse importe statico permeite que eu use os métodos da classe Assertions usando somente o nome do método sem precisar escrever o nome da classe 
//import static org.junit.jupiter.api.Assertions;

public class AssertionsTeste {
	
	@Test
	void validarLancamentos() {
		int[] primeiroLancamentos = {10, 20, 40, 50};
		int[] SegundoLancamentos = {-1, 5, 2, 10};
		int[] terceiroLancamentos = {10, 20, 40, 50};
		
		//Compara se os array são exatamente iguais
		Assertions.assertArrayEquals(primeiroLancamentos, terceiroLancamentos);

		//verifica se os parametros são diferentes
		Assertions.assertNotEquals(primeiroLancamentos, SegundoLancamentos);
	}

	@Test
	void validarSeForNull() {
		Pessoa pessoa = null;
		
		Assertions.assertNull(pessoa);
		
		pessoa = new Pessoa("Jessica", LocalDateTime.of(1992, 9, 23, 15, 0));
		Assertions.assertNotNull(pessoa);
	}
	
	
	@Test
	void validarNumeros() {
		double valor = 5.0;
		double outroValor = 5.0;
		
		//o método equals possui várias sobrecargas. Aqui está usando uma que compara valores double
		Assertions.assertEquals(valor, outroValor);
	}
}
