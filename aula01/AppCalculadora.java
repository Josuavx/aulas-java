package br.com.unit.aula01;

public class AppCalculadora {

	public static void main(String[] args) {
		
		Calculadora calculadora = new Calculadora();
		
		calculadora.n1 = 50;
		calculadora.n2 = 2;
		
		System.out.printf("Adi��o...........: %d\n", calculadora.adicao());
		System.out.printf("Subtra��o........: %d\n", calculadora.subtracao());
		System.out.printf("Multiplicac�o....: %d\n", calculadora.multiplicacao());
		System.out.printf("Divis�o..........: %d\n", calculadora.divisao());
		
		
	}

}