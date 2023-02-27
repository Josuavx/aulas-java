package br.com.unit.aula01;

import java.util.Scanner;

public class CalculadoraImc {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		MassaCorporea mc = new MassaCorporea();
		
		System.out.println("Peso.....:");
		mc.peso = input.nextDouble();
		System.out.println("Altura...:");
		mc.altura = input.nextDouble();
		
		
		mc.calcularImc();
		mc.definirSituacao();
		
		System.out.printf("IMC: %.1f\n", mc.imc);
		System.out.printf("Situação: %s\n", mc.situacao);
		
		
		input.close();

	}

}
