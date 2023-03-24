package lsita_Exercicio;

import java.util.Scanner;

public class Ari {
	
	static double raiz1 = 0;
	static double resto5 = 0;
	static double resto6 = 0;
	static double resto4 = 0;
	static double resto3 = 0;
	static double restoP = 0;
	static double resto2 = 0;
	static double resto1 = 0;
	static double resto = 0;
	static double quanti = 0;
	static double quanti1 = 0;
	
	public static void arime (double n1) {
		
		if (n1 == -1) {
			resto4=resto/quanti;
			System.out.println(resto4);
		}
		else {
			resto=resto+n1;
			quanti++;
		}
		
		
	}

	public static void arimeP (double n1, int n) {
		
		if (n1 == -1 || n == -1) {
			resto1=resto3/resto2;
			System.out.println(resto1);
		}
		else {
			resto3=resto3+n1*n;
			resto2=resto2+n;
		}
		
		
	}

	public static void geo (double n1) {
		
		if (n1 == -1) {
			System.out.println(raiz1);
		}
		else {
			resto6=resto6+n1;
			quanti1++;
			double raiz = Math.sqrt(resto6+quanti1);
			raiz1=raiz;
			
		}
		
		
	}
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		int n;
		double n1;
		
		while(true) {
			System.out.println("1. Calcular media Aritmetica");
			System.out.println("2. Calcular media Aritmetica Ponderada");
			System.out.println("3. Calcular media Gerometrica");
			System.out.println("4. Sair");
			n=entrada.nextInt();
			
			if (n == 4) {
				break;
			}
			else {
				switch (n) {
				
				case 1:
					while(true) {
					System.out.println("Informe o numero");
					n1=entrada.nextDouble();
					arime(n1);
					if(n1 == -1) {
						break;
					}
					else {
						System.out.println("Informe o numero");
						System.out.println("Para sair digite -1");
						n1=entrada.nextDouble();
						arime(n1);
					}
					break;
					}
					
				case 2:
					while(true) {
						System.out.println("Informe a nota ");
						n1=entrada.nextDouble();
						System.out.println("Informe o peso da nota");
						n=entrada.nextInt();
						arimeP(n1, n);
						
						if(n1 == -1 || n == -1) {
							break;
						}
						else {
							System.out.println("Informe a nota ");
							n1=entrada.nextDouble();
							System.out.println("Informe o peso da nota");
							System.out.println("Para sair digite -1");
							n=entrada.nextInt();
							arimeP(n1, n);	
						}
						break;
					}
					
				case 3:
					System.out.println("Informe o numero");
					n1=entrada.nextDouble();
					geo(n1);
					
					while(true) {
						if(n1== -1) {
							break;
						}
						else {
							System.out.println("Informe o numero");
							System.out.println("Para sair digite -1");
							n1=entrada.nextDouble();
							geo(n1);
						}
						break;
						
					}
					
					
				
				}
			}
			
		}

	}

}
