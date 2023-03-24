package lsita_Exercicio;

import java.util.Scanner;

public class Conta_de_luz {
	
	static double tarifa = 10.00;
	static double tarifa2 = 15.00;
	static double tarifa3 = 20.00;
	static double tarifa4 = 25.00;
	static double tarifa5 = 30.00;
	
	static double valor = 0.50;
	static double valor2 = 0.70;
	static double valor3 = 0.90;
	static double valor4 = 1.00;
	static double valor5 = 1.20;
	
	static double result = 0;
	
	public static void con100 (double kwh) {
		
		result = kwh*valor+tarifa;
		
	}
	public static void con101 (double kwh) {
		
		result = kwh*valor2+tarifa2;
		
	}
	public static void con201 (double kwh) {
		
		result = kwh*valor3+tarifa3;
		
	}
	public static void con301 (double kwh) {
		
		result = kwh*valor4+tarifa4;
		
	}
	public static void con400 (double kwh) {
		
		result = kwh*valor5+tarifa5;
		
	}
	
	

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int n;
		double kwh;
		
		while(true) {
			 System.out.println("1. Consumo mensal de até 100 kWh: tarifa fixa de R$ 10,00 e valor por kWh de R$ 0,50.");
			 System.out.println("2. Consumo mensal de 101 a 200 kWh: tarifa fixa de R$ 15,00 e valor por kWh de R$0,70.");
			 System.out.println("3. Consumo mensal de 201 a 300 kWh: tarifa fixa de R$ 20,00 e valor por kWh de R$0,90.");
			 System.out.println("4. Consumo mensal de 301 a 400 kWh: tarifa fixa de R$ 25,00 e valor por kWh de R$1,00.");
			 System.out.println("5. Consumo mensal acima de 400 kWh: tarifa fixa de R$ 30,00 e valor por kWh de R$1,20.");
			 System.out.println("6. Sair");
			 n=entrada.nextInt();
			 
			 if(n==6) {
				 break;
			 }
			 
			 else {
				 switch (n) {
				 
				 case 1:
					 System.out.println("kWh");
					 kwh=entrada.nextDouble();
					 con100(kwh);
					 System.out.println(result);
					 break;
					 
				 case 2:
					 System.out.println("kWh");
					 kwh=entrada.nextDouble();
					 con101(kwh);
					 System.out.println(result);
					 break;
					 
				 case 3:
					 System.out.println("kWh");
					 kwh=entrada.nextDouble();
					 con201(kwh);
					 System.out.println(result);
					 break;
					 
				 case 4:
					 System.out.println("kWh");
					 kwh=entrada.nextDouble();
					 con301(kwh);
					 System.out.println(result);
					 break;
					 
				 case 5:
					 System.out.println("kWh");
					 kwh=entrada.nextDouble();
					 con400(kwh);
					 System.out.println(result);
					 break;
					 
					 default:
						 System.out.println("nao existe esta opcao");
						 break;
				 
				 }
			 }
		}

	}

}
