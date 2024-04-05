package Exercicio1;

/*Construir um algoritmo para que solicite ao usuário a quantidade de horas trabalhadas 
 no mês por um operário. Em seguida, calcular e informar o seu salário sabendo que ele
 ganha R$ 20,00 por hora. */

import java.util.Scanner;

public class CalculoSalario {

	public static void main(String[] args) {
		// Criar um objeto Scanner para entrada de dados

		Scanner scanner = new Scanner(System.in);

		// Solicitar ao usuário a quantidade de horas trabalhadas no mês
		System.out.println("Qual a quantidade de horas trabalhadas no mês por um operário?");

		// lê o valor digitado pelo usuário e armazena na variável horasTrabalhadas
		double horasTrabalhadas = scanner.nextDouble();

		double salarioPorHora = 20;

		double salarioTotal = horasTrabalhadas * salarioPorHora;

		System.out.println("O salário total do operário é de R$" + salarioTotal);

		scanner.close();
	}
}