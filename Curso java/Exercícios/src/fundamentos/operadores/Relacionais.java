package fundamentos.operadores;

public class Relacionais {
	
	public static void main(String[] args) {

	int a = 97;
	int b = 'a';	

	
	System.out.println(a == b);
	
	System.out.println(3 > 4);
	System.out.println(3 >= 4);
	System.out.println(10 < 7);
	System.out.println(10 <= 7);
	System.out.println(20 != 10);

	double nota = 7.3;
	boolean bomComportamento = true;
	boolean passouNaMedia = nota >= 7;
	
	boolean temDesconto = bomComportamento && passouNaMedia;
			
	System.out.println("Tem desconto? " + temDesconto);
	
	
	
	}
}
