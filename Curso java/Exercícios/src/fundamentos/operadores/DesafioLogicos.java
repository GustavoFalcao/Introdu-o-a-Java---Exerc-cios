package fundamentos.operadores;

public class DesafioLogicos {

	public static void main(String[] args) {
		
	boolean trabalhoTerca = true;
	boolean trabalhoQuarta = true;
		
	boolean tv40 = trabalhoTerca ^ trabalhoQuarta;
	
	System.out.println("Comprou a TV de 40 Polegadas? " + tv40);	
	
	boolean tv60 = trabalhoTerca && trabalhoQuarta;
		
	System.out.println("\nComprou a TV de 60 Polegadas? " + tv60);
		
	boolean sorvete = trabalhoTerca || trabalhoQuarta;
	
	System.out.println("\nComprou Sorvete? " + sorvete);	
		
	System.out.println("\nMais saudável? " + !sorvete);
	}
}
