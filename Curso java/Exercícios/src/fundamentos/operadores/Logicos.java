package fundamentos.operadores;

public class Logicos {

	public static void main(String[] args) {

	boolean condicao1 = true;
	boolean condicao2 = 3 > 7;
	
	System.out.println(condicao1 && condicao2); // E = &&
	System.out.println(condicao1 && !condicao2); // E = &&
	
	System.out.println(condicao1 || condicao2); // Ou = ||
	
	System.out.println(condicao1 ^ condicao2); //Exclusivamente Ou = ^
	
	System.out.println(!!condicao1); //Falsa Negação(2x) = !!
	System.out.println(!condicao2); //Falsa Negação = !
	
	System.out.println("\nTabela Verdade E (And)");
	System.out.println(true && true);
	System.out.println(true && false);
	System.out.println(false && true);
	System.out.println(false && false);

	System.out.println("\nTabela Verdade Ou (Or)");
	System.out.println(true || true);
	System.out.println(true || false);
	System.out.println(false || true);
	System.out.println(false || false);
	
	System.out.println("\nTabela Verdade Ou Esclusivo (Xor)");
	System.out.println(true ^ true);
	System.out.println(true ^ false);
	System.out.println(false ^ true);
	System.out.println(false ^ false);	
	
	System.out.println("\nTabela Verdade Not");
	System.out.println(!true);
	System.out.println(!true);
	
	
	
	
	}
}
