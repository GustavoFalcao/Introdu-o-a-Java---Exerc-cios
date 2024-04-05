package Exercicio11;

/* Faça um algoritmo que solicite ao usuário dois valores numéricos. Em seguida o algoritmo 
deverá efetuar a soma dos dois valores e caso o resultado seja maior ou igual a 10, deve-se 
ser somado a 5 caso contrário o valor do resultado deverá ser subtraído de 7. Após a obtenção 
do resultado apresente essa informação para o usuário. */

import java.util.Scanner;

public class SomaValoresNumericos {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Escolha um número:");
		double num1 = scanner.nextDouble();

		System.out.println("Escolha outro número:");
		double num2 = scanner.nextDouble();

		double soma = num1 + num2;

		if (soma >= 10) {
			soma += 5;				// Se a soma for maior ou igual a 10, adiciona 5 ao resultado
		} else {
			soma -= 7;				// Se a soma for menor que 10, subtrai 7 do resultado
		}

		System.out.println("O resultado é: " + soma);

		scanner.close();

	}
}
