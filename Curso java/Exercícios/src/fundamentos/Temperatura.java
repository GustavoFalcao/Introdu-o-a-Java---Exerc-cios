package fundamentos;

public class Temperatura {

	public static void main(String[] args) {
		final int Ajuste = 32;
		final double Fator = 5.0/9;
		
		int Fahrenheit  =  75;
		
		double Celsius = (Fahrenheit  - Ajuste) * Fator;
		
		System.out.println("O valor de " + Fahrenheit + "° Fahrenheit equivale a " + Celsius + "° Celsius");
		
		Fahrenheit  =  50;
		Celsius = (Fahrenheit  - Ajuste) * Fator;
		System.out.println("O valor de " + Fahrenheit + "° Fahrenheit equivale a " + Celsius + "° Celsius");
		
	}
}
