package br.com.unit.aula03;

public class AppContaBancaria2 {

	public static void main(String[] args) {
		ContaBancaria conta= new ContaBancaria();
		boolean saque;
		
		conta.cadastrarConta(13, "7455-2", "3315396", "N", 1);
		
		System.out.printf("ID.............: %d\n", conta.getIdConta());
		System.out.printf("Agencia........: %s\n", conta.getAgencia());
		System.out.printf("Conta..........: %s\n", conta.getNumeroConta());
		System.out.printf("Tipo...........: %s\n", conta.getTipo());
		System.out.printf("Saldo..........: %.2f\n", conta.getSaldo());
		System.out.printf("Limite.........: %.2f\n\n", conta.getLimiteCredito());
		
		
		for (int i = 0; i < 3; i++) {
			conta.registrarDeposito(1000);
			System.out.printf("Saldo..........: %.2f\n", conta.getSaldo());
			
			conta.registrarDeposito(2000);
			System.out.printf("Saldo..........: %.2f\n", conta.getSaldo());
		}
		
		System.out.println();
		
		
		for (int i = 0; i < 2; i++) {
			saque = conta.registrarSaque(2000);
			if (saque) {
				System.out.printf("Saldo..........: %.2f\n", conta.getSaldo());
			}else {
				System.out.printf("Saldo insuficiente\n");
				System.out.printf("Saldo..........: %.2f\n", conta.getSaldo());
			}
		}
		
		System.out.println();
		
		for (int i = 0; i < 2; i++) {
			saque = conta.registrarSaque(3000);
			if (saque) {
				System.out.printf("Saldo..........: %.2f\n", conta.getSaldo());
			}else {
				System.out.printf("Saldo insuficiente\n");
				System.out.printf("Saldo..........: %.2f\n", conta.getSaldo());
			}
		}
		
	}

}