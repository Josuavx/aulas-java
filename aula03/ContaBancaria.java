package br.com.unit.aula03;

public class ContaBancaria {
	private int idConta;
	private String agencia;
	private String numeroConta;
	private String tipo;
	private double saldo;
	private double limiteCredito;
	
	public int getIdConta() {
		return idConta;
	}

	public String getAgencia() {
		return agencia;
	}
	
	public String getNumeroConta() {
		return numeroConta;
	}
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String novoTipo) {
		this.tipo = novoTipo;
	}

	public double getSaldo() {
		return saldo;
	}

	public double getLimiteCredito() {
		return limiteCredito;
	}

	public void setLimiteCredito(double novoLimite) {
		this.limiteCredito = novoLimite;
	}
	
	
	
	public void cadastrarConta(int idConta, String agencia, String numeroConta, String tipo, double limiteCredito ) {
		this.saldo = 0;
		this.idConta = idConta;
		this.agencia = agencia;
		this.numeroConta = numeroConta;
		this.tipo = tipo;
		
		if (tipo == "N") {
			this.limiteCredito = 0;
		}else {
			this.limiteCredito = limiteCredito;
		}
		
	}
	
	public void registrarDeposito(double valor) {
		saldo += valor;
	}
	
	public boolean registrarSaque(double valor) {
		
		double resultado = this.saldo - valor;
		
		if (tipo == "N" && resultado > 0) {
			this.saldo = resultado;
			return true;
		}else if (tipo == "E" && resultado >= -limiteCredito){
			this.saldo = resultado;
			return true;
		}
		
		return false;
		
	}

}