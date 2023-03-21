package metodo;

import java.util.Scanner;

public class Temperatura {
	
	public static double kelvin (double n1) {
		double resultado;
		
		resultado= n1 + 273.15;
		return resultado;
	}
	
	public static double fahren (double n1) {
		double resultado;
		
		resultado= (n1 *9/5)+32;
		return resultado;
	}
	
	
	
	

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		double n1,kelvin,fahren;
		
		System.out.println("Informe a temperatura em Celsius: ");
		n1=entrada.nextInt();
		
		kelvin=kelvin(n1);
		fahren=fahren(n1);
		
		System.out.printf("A temperatura em Fahrenheit %.2f \n",fahren);
		System.out.printf("A temperatura em Kelvin %.2f ", kelvin);
		
		

	}

}
