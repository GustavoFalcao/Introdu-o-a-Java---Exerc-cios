package fundamentos;

public class TipoString {
	
	public static void main(String[] args) {

		System.out.println("Olá pessoal".charAt(2));
		
		String s = "Boa tarde";
	
		System.out.println(s.concat("!!!"));							//Acrescenta valor S + "!!!"
		System.out.println(s + "!!!");									//Acrescenta valor S + "!!!"
		System.out.println(s.startsWith("Boa"));						//Verifica se S começa com "Boa"
		System.out.println(s.toLowerCase().startsWith("boa"));			//Transforma em minuscula e verifica se S começa com "boa"
		System.out.println(s.toUpperCase().endsWith("TARDE"));			//Transforma em maiuscula e verifica se S termina com "TARDE"
		System.out.println(s.length());									//Conta os caracteres
		System.out.println(s.toLowerCase().equals("boa tarde"));		//Transforma em minuscula e verifica se o texto é igual
		System.out.println(s.equalsIgnoreCase("boa tarde"));			//Avalia se o texto é igual sem se importar se é minuscula ou maisucula 
		
		var nome = "Pedro";
		var sobrenome = "Santos";
		var idade = 33;
		var salario = 12345.987;
		
		System.out.println("Nome: " + nome 
				+ "\nSobrenome: " + sobrenome
				+ "\nIdade: " + idade + "\nSalário: " + salario + "\n\n");
		
		System.out.printf("O senhor %s %s tem %d anos e recebe um salário de R$%.2f.", nome, sobrenome, idade, salario);
		
		String frase = String.format("\nO senhor %s %s tem %d anos e recebe um salário de R$%.2f.", nome, sobrenome, idade, salario);
		System.out.println(frase);
		
		System.out.println("Frase qualquer".contains("qual"));			//Se "Frase qualquer" contém "qual"
		System.out.println("Frase qualquer".indexOf("qual"));			//Quando começa a palavra "qual" na frase anterior
		System.out.println("Frase qualquer".substring(6));				//Começa no índice 6 e continua até o final da string
		System.out.println("Frase qualquer".substring(6, 8));			//Começa no indice 6 e vai até o range do 7
	}
}
