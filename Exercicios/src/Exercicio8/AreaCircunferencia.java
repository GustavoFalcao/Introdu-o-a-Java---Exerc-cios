package Exercicio8;

/*  Faça um algoritmo que calcule a área de uma circunferência e apresente a 
medida da área calculada. Sabe-se que para realizar o cálculo da área de uma
circunferência é necessário utilizar a seguinte a seguinte fórmula: A = Pi*r². 
O valor do Raio será informado pelo usuário. */

import java.util.Scanner;

public class AreaCircunferencia {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Qual o valor do Raio da Circunferência?");
		double raio = scanner.nextDouble();

		// Calcula a área da circunferência
		double areaCircunferencia = Math.PI * raio * raio;

		System.out.println("A aréa da circunferência é " + areaCircunferencia + " M²");

		scanner.close();

	}
}
