package br.com.unit.aula01;

public class Elevador {
	int pessoas;
	int codigo;
	String status;
	int limitePessoas;
	
	int consultarPessoasTransportadas() {
		return pessoas;
	}
	
	void cadastrarElevador(int codigo) {
		pessoas = 0;
		status = "Em operação";
		this.codigo = codigo;
		this.limitePessoas = 8;
	}
	
	void registrarEntrada(int quantidade) {
		pessoas += quantidade;
		if (pessoas > limitePessoas) {
			status = "Bloqueado";
		}
	}
	
	void registrarSaida(int quantidade) {
		pessoas -= quantidade;
		if (pessoas <= limitePessoas) {
			status = "Em operação";
		}
	}
	
	
	
}