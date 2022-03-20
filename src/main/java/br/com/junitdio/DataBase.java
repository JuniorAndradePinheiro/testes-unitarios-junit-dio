package br.com.junitdio;

import java.util.logging.Logger;

public class DataBase {
	
	private static final Logger LOGGER = Logger.getLogger(DataBase.class.getName()); 
	
	public static void iniciarConexao() {
		LOGGER.info("Iniciou conexão");	
	}

	public static void finalizarConexao() {
		LOGGER.info("Finalizou conexão");	
	}
	
	public static void insereDados(Pessoa pessoa) {
		LOGGER.info("Inseriu Dados");
	}
	
	public static void removeDados(Pessoa pessoa) {
		LOGGER.info("Removeu Dados");
	}
}
