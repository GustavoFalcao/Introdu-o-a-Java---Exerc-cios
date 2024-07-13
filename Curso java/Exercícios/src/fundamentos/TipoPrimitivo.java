package fundamentos;

public class TipoPrimitivo {

	public static void main(String[] args) {
		
		// Tipos númericos inteiros
		
		byte anosDeEmpresa = 23;
		short numerosDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_234_845_223L;
				
		// Tipos númericos inteiros
		
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		// Tipos booleano
		
		boolean estaDeFerias = false; 
		
		// Tipo caractere
		
		char status = 'A';
		
		//Dias de Empresa
		System.out.println(anosDeEmpresa * 365);
		
		// Número de Viagens
		System.out.println(numerosDeVoos / 2);
		
		// Pontos por Real
		System.out.println(pontosAcumulados/vendasAcumuladas);
		
		System.out.println(id + ": Ganha -> " + salario);
		System.out.println("Ferias? " + estaDeFerias);
		System.out.println("Status: " + status);
	}
}
