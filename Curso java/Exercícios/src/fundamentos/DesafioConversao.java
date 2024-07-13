package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {

	Scanner entrada = new Scanner(System.in);
	
	System.out.print("Digite o salário de Janeiro: ");
	String valor1 = entrada.next().replace(",", ".");
		
	System.out.print("Digite o salário de Fevereiro: ");
	String valor2 = entrada.next().replace(",", ".");
	
	System.out.print("Digite o salário de Março: ");
	String valor3 = entrada.next().replace(",", ".");
	
	double janeiro = Double.parseDouble(valor1);
	double fevereiro = Double.parseDouble(valor2);
	double março = Double.parseDouble(valor3);
	
	double media = (janeiro + fevereiro + março)/3;
	
	System.out.println("\nO valor do seu salário médio nos ultimos 3 meses é: " + media);
	
	entrada.close();
	
	}
}