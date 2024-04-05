package Exercicio4;

/*  Faça um algoritmo para ler a temperatura do corpo medida com um termômetro. 
Caso a temperatura seja maior que 37 graus o paciente está com febre, caso contrário, 
sua temperatura está normal. Após ler a temperatura mostre a mensagem apropriada */

import java.util.Scanner;

public class PacienteComFebre {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// Solicita ao usuário a temperatura do corpo
		System.out.println("Qual a temperatura do corpo medida com um termômetro? (Em Graus)");

		double temperatura = scanner.nextDouble();

		// Verifica se a temperatura é maior que 37 graus
		if (temperatura > 37) {
			System.out.println("O paciente está com febre");
		} else {
			System.out.println("A temperatura está normal");
		}

		scanner.close();

	}
}
