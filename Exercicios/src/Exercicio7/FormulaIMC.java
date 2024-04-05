package Exercicio7;

/* Faça um algoritmo que leia o peso e a altura do usuário e informa se o mesmo está obeso. 
Lembre que para saber se uma pessoa está obesa deve-se utilizar a fórmula: imc = peso/altura2. 
Caso o resultado do imc seja maior que 30 o usuário está obeso. */

import java.util.Scanner;

public class FormulaIMC {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Informe o peso (em kg): ");
		double peso = scanner.nextDouble();

		System.out.print("Informe a altura (em metros): ");
		double altura = scanner.nextDouble();

		// Calcula o IMC
		double imc = peso / (altura * altura);

		if (imc > 30) {
			System.out.println("Você está obeso.");
		} else {
			System.out.println("Você não está obeso.");
		}

		scanner.close();

	}
}
