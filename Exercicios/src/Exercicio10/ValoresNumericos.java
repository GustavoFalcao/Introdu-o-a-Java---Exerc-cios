package Exercicio10;

/* Faça um algoritmo que solicite ao usuário dois valores numéricos. 
Em seguida o algoritmo deverá efetuar a soma dos dois valores e 
apresentar o resultado caso seja maior que 10. */

import java.util.Scanner;

public class ValoresNumericos {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Escolha um número:");
		double num1 = scanner.nextDouble();

		System.out.println("Escolha outro número:");
		double num2 = scanner.nextDouble();

		double soma = num1 + num2;

		if (soma > 10) {
			System.out.println("A soma dos valores é " + soma);
		}

		scanner.close();

	}
}
