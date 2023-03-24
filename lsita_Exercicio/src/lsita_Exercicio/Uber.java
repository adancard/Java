package lsita_Exercicio;

import java.util.Scanner;

public class Uber {
	
	static double tarifa1 = 3.00;
	static double tarifa2 = 3.50;
	static double tarifa3 = 4.00;
	static double tarifa4 = 4.50;
	static double tarifa5 = 5.00;
	static double result = 0;
	
	public static void tarifa11 (double km){
		
		result = 3.00+(km*1.50);
		
	}
	
	public static void tarifa22 (double km){
		
		result = 3.50+(km*1.50);
		
	}
	public static void tarifa33 (double km){
		
		result = 4.00+(km*1.50);
		
	}
	public static void tarifa44 (double km){
		
		result = 4.50+(km*1.50);
		
	}
	public static void tarifa55 (double km){
		
		result = 5.00+(km*1.50);
		
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		int n;
		double km;
		
		while(true) {
			
			System.out.println("1. Tarifa base de R$ 3,00, das 6h às 18h ");
			System.out.println("2. Tarifa base de R$ 3,50, das 18h às 23h ");
			System.out.println("3. Tarifa base de R$ 4,00, das 23h às 6h ");
			System.out.println("4. Tarifa base de R$ 4,50, em feriados e finais de semana ");
			System.out.println("5. Tarifa base de R$ 5,00, para viagen longas (acima de 30km ");
			System.out.println("6. Sair ");
			n=entrada.nextInt();
			
			if (n==6) {
				break;
			}
			else {
			
			switch (n) {
			
			case 1:
				System.out.println("km");
				km=entrada.nextDouble();
				tarifa11(km);
				System.out.println(result);
				break;
				
			case 2:
				System.out.println("km");
				km=entrada.nextDouble();
				tarifa22(km);
				System.out.println(result);
				break;
				
			case 3:
				System.out.println("km");
				km=entrada.nextDouble();
				tarifa33(km);
				System.out.println(result);
				break;
				
			case 4:
				System.out.println("km");
				km=entrada.nextDouble();
				tarifa44(km);
				System.out.println(result);
				break;
				
			case 5:
				System.out.println("km");
				km=entrada.nextDouble();
				tarifa55(km);
				System.out.println(result);
				break;
	
			}
		}

	}

}
}
