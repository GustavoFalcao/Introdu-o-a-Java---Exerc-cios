package Exercicio2;

/* Construa um algoritmo que calcule e informe a quantidade de gasolina que será 
preciso colocar no carro e quanto irá custar para o seu dono ir até a sua fazenda. 
O usuário deverá informar a distância que será percorrida e o preço do litro da 
gasolina. Para o cálculo, sabe-se que o carro faz em média 12 km/litro. */

import java.util.Scanner;

public class ViagemFazenda {

	public static void main(String[] args) {

		int media = 12;

		Scanner scanner = new Scanner(System.in);

		// Solicita ao usuário a distância a ser percorrida
		System.out.println("Qual a distancia será percorrida até a fazenda? (em KM)");
		double distanciaPercor = scanner.nextDouble();

		// Solicita ao usuário o preço do litro da gasolina
		System.out.println("Qual o preço do litro da gasolina?");
		double gasolinaValor = scanner.nextDouble();

		// Calculando a quantidade de gasolina necessária
		double quantidadeGasolina = distanciaPercor / media;

		// Calculando o custo total da viagem
		double custoTotal = quantidadeGasolina * gasolinaValor;

		// Exibindo os resultados na tela
		System.out.println("A quantidade de gasolina necessária é de " + quantidadeGasolina + " litros");
		System.out.println("Custo total da viagem é de R$" + custoTotal);

		scanner.close();
	}
}