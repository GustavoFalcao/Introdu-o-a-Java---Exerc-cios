package Exercicio3;

/* Faça um algoritmo que solicite ao usuário sua idade e informe se o mesmo já pode tirar 
carteira de motorista. O usuário somente poderá  tirar a carteira de motorista se a idade 
for maior que 18 anos. */

import java.util.Scanner;

public class CarteiraTransito {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Qual a sua idade?");
		int idade = scanner.nextInt();

		// Verifica se a idade é maior que 18 anos
		if (idade >= 18) {
			System.out.println("Você pode tirar a carteira de motorista!");
		} else {
			System.out.println("Você não pode tirar a carteira de motorista");
		}

		scanner.close();
	}
}