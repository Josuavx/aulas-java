package br.com.unit.aula01;

public class AppCalculadora {

	public static void main(String[] args) {
		
		Calculadora calculadora = new Calculadora();
		
		calculadora.n1 = 50;
		calculadora.n2 = 2;
		
		System.out.printf("Adição...........: %d\n", calculadora.adicao());
		System.out.printf("Subtração........: %d\n", calculadora.subtracao());
		System.out.printf("Multiplicacão....: %d\n", calculadora.multiplicacao());
		System.out.printf("Divisão..........: %d\n", calculadora.divisao());
		
		
	}

}