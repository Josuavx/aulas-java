package br.com.unit.aula01;

public class Elevador {
	int pessoas = 0;
	int codigo;
	String status = "Em opera��o";
	int limitepessoas = 8;
	
	int consultarPessoasTransportadas() {
		return pessoas;
	}
	
	void cadastrarElevador() {
		pessoas = 0;
		status = "Em opera��o";
	}
	
	void registrarEntrada(quantidade) {
		pessoas = pessoas + quantidade;
	}
	
	void registrarSaida() {
		
	}
	
}