package exercicios;

import java.util.Scanner;

public class CalculaAreaTrapezio {

	public static void main(String[] args) {
		float area, baseMaior, baseMenor, Altura;
		
	    Scanner lerBaseMaior = new Scanner(System.in);
		System.out.println("digite base Maior do Trapezio");
		baseMaior = lerBaseMaior.nextFloat();
				
	    Scanner lerBaseMenor = new Scanner(System.in);
		System.out.println("digite base Menor do Trapezio");
		baseMenor = lerBaseMenor.nextFloat();
		
		Scanner lerAltura = new Scanner(System.in);
		System.out.println("digite Altura do Trapezio");
		Altura = lerAltura.nextFloat();	
		
		area = ((baseMaior+baseMenor)*Altura)/2;
		System.out.println("area do trapezio");
		System.out.println(area);
		
		lerBaseMaior.close();
		lerBaseMenor.close();
		lerAltura.close();
		
	}		
	
}


