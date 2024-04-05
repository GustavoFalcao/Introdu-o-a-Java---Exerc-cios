package Exercicio5;

/* Faça um algoritmo  que solicite ao usuário 2 
números diferentes e mostre o maior deles. */

import java.util.Scanner;

public class NumeroMaior {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Atribue um valor ao 1° número:");
		double a = scanner.nextDouble();

		System.out.println("Atribue um valor ao 2° número:");
		double b = scanner.nextDouble();

		// Verifica qual é o maior número, utilizando o operador ternário, ao invés do if e else
		double maiorNumero = (a > b) ? a : b;

		System.out.println("O número maior é " + maiorNumero);

		scanner.close();

	}
}
