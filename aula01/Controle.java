package br.com.unit.aula01;
import java.util.Scanner;

public class Controle {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Elevador elevador = new Elevador();
		
		int codigo;
		
		System.out.println("Código: ");
		codigo = teclado.nextInt();
		elevador.cadastrarElevador(codigo);
		
		
		System.out.printf("Código: %d\nLimite de Pessoas: %d\nStatus: %s\nPessoas sendo transportadas: %d\n\n", elevador.codigo, elevador.limitePessoas, elevador.status, elevador.pessoas);
		
		//Parada 1
		
		elevador.registrarEntrada(4);
		System.out.println("Pessoas sendo transportadas: " + elevador.consultarPessoasTransportadas());
		
		//Parada 2
		
		elevador.registrarEntrada(4);
		System.out.println("Pessoas sendo transportadas: " + elevador.consultarPessoasTransportadas());
		
		//Parada 3
		
		elevador.registrarEntrada(4);
		System.out.println("Pessoas sendo transportadas: " + elevador.consultarPessoasTransportadas());
		
		//Parada 4
		
		elevador.registrarSaida(3);
		System.out.println("\nPessoas sendo transportadas: " + elevador.consultarPessoasTransportadas());
		System.out.println("Status: " + elevador.status);
		
		//Parada 5
		
		elevador.registrarSaida(2);
		System.out.println("\nPessoas sendo transportadas: " + elevador.consultarPessoasTransportadas());
		System.out.println("Status: " + elevador.status);
		
		
		
		teclado.close();
	}

}
