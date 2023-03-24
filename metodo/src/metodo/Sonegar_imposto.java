package metodo;

import java.util.Scanner;

public class Sonegar_imposto {
	
	public static double caso1 (double p) {
		double result;
		
		result = p*0.075;
		
		return result;
		
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		int n;
		double p,resto;
		
		System.out.println("n");
		n=entrada.nextInt();
		
		switch (n) {
		case 1:
			System.out.println("isento de imposto");
			break;
			
		case 2:
			System.out.println("preço");
			p=entrada.nextDouble();
			resto =caso1(p);
			System.out.println(resto);
			break;
			
		}

	}

}
