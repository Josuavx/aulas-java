package br.com.unit.aula03;

public class AppContaBancaria {

	public static void main(String[] args) {
		ContaBancaria conta= new ContaBancaria();
		boolean saque;
		
		conta.cadastrarConta(12, "0465-8", "222364", "E", 2000);
		
		System.out.printf("ID.............: %d\n", conta.getIdConta());
		System.out.printf("Agencia........: %s\n", conta.getAgencia());
		System.out.printf("Conta..........: %s\n", conta.getNumeroConta());
		System.out.printf("Tipo...........: %s\n", conta.getTipo());
		System.out.printf("Saldo..........: %.2f\n", conta.getSaldo());
		System.out.printf("Limite.........: %.2f\n", conta.getLimiteCredito());
		
		conta.registrarDeposito(1000);
		System.out.printf("Saldo..........: %.2f\n", conta.getSaldo());
		
		conta.registrarDeposito(500);
		System.out.printf("Saldo..........: %.2f\n", conta.getSaldo());
		
		saque = conta.registrarSaque(1000);
		if (saque) {
			System.out.printf("Saldo..........: %.2f\n", conta.getSaldo());
		}else {
			System.out.printf("Saldo insuficiente\n");
			System.out.printf("Saldo..........: %.2f\n", conta.getSaldo());
		}
		
		saque = conta.registrarSaque(2000);
		if (saque) {
			System.out.printf("Saldo..........: %.2f\n", conta.getSaldo());
		}else {
			System.out.printf("Saldo insuficiente\n");
			System.out.printf("Saldo..........: %.2f\n", conta.getSaldo());
		}
		
		saque = conta.registrarSaque(800);
		if (saque) {
			System.out.printf("Saldo..........: %.2f\n", conta.getSaldo());
		}else {
			System.out.printf("Saldo insuficiente\n");
			System.out.printf("Saldo..........: %.2f\n", conta.getSaldo());
		}

	}

}
