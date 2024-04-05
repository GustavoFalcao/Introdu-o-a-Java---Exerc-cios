package Exercicio9;

/* Faça um algoritmo que calcule o salário líquido de um professor. Para elaborar o 
programa, é necessário solicitar do usuário alguns dados, tais como valor da hora aula, 
número de horas trabalhadas no mês, percentual de desconto do INSS. Em primeiro, deve-se 
estabelecer o seu salário bruto para fazer o desconto e ter o valor do salário líquido. */

import java.util.Scanner;

public class SalarioProfessor {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Valor da hora aula do professor?");
		double horaAula = scanner.nextDouble();

		System.out.println("Número de horas trabalhadas no mês:");
		double horasTrabalhadas = scanner.nextDouble();

		System.out.println("Percentual de desconto do INSS:");
		double inss = scanner.nextDouble();

		// Calcula o salário bruto
		double salarioBruto = horaAula * horasTrabalhadas;

		// Calcula o valor do desconto do INSS
		double descontoINSS = salarioBruto * (inss / 100);

		// Calcula o salário líquido
		double salarioLiquido = salarioBruto - descontoINSS;

		System.out.println("Salário bruto: R$" + salarioBruto);
		System.out.println("Desconto do INSS: R$" + descontoINSS);
		System.out.println("Salário líquido: R$" + salarioLiquido);

		scanner.close();
	}
}