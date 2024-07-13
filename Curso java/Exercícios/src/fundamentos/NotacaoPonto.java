package fundamentos;

public class NotacaoPonto {

	public static void main(String[] args) {
		
		String s = "Bom dia X";
		s = s.replace("X", "Senhora");
		s = s.toUpperCase();		
		s = s.concat("!!!");
		
		System.out.println(s);
		
		String x = "Leo".toUpperCase();     //linha 14-15. Ou da para fazer assim:
		System.out.println(x);				//System.out.println("Leo".toUpperCase());
													
		String y = "Bom dia X"
				.replace("X", "Gui")		//linha 17-20. Representa a mesma sentença
				.toUpperCase()				// de código
				.concat("!!!");
		System.out.println(y);
		
		// Tipos primitivos ñ tem o operador "."
		int a = 3;
		System.out.println(a);
		
	}
}
