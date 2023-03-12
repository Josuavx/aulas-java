package br.com.unit.aula01;

public class Elevador {
	private int pessoas;
	private int codigo;
	private String status;
	private int limitePessoas;
	
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
	
	int getPessoas() {
		return this.pessoas;
	}
	int getCodigo() {
		return this.codigo;
	}
	String getStatus() {
		return this.status;
	}
	int getLimitePessoas() {
		return this.limitePessoas;
	}
	
	
	void setPessoas(int valor) {
		this.pessoas = valor;
	}	
	void setCodigo(int valor) {
		this.codigo = valor;
	}
	void setStatus(String status) {
		this.status = status;
	}
	void setLimitePessoas(int limite) {
		this.limitePessoas = limite;
	}
	
}