package Exercicio6;

/* Faça um algoritmo que solicite ao usuário as notas de 2 provas e um trabalho e que 
seja capaz de calcular a média aritmética. Caso a média final seja maior ou igual a 
7 mostre a mensagem “aprovado”, caso contrario, imprimir a mensagem reprovado”. */

import java.util.Scanner;

public class MediaProva {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Qual a nota da 1ª prova?");
		double prova1 = scanner.nextDouble();

		System.out.println("Qual a nota da 2ª prova?");
		double prova2 = scanner.nextDouble();

		System.out.println("Qual a nota do trabalho");
		double trabalho = scanner.nextDouble();

		double mediaFinal = (prova1 + prova2 + trabalho) / 3;

		if (mediaFinal >= 7) {
			System.out.println("Aluno foi aprovado!");
		} else {
			System.out.println("Aluno reprovado");
		}

		scanner.close();

	}
}
