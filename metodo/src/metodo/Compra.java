package metodo;

import java.util.Scanner;

public class Compra {
	
	static int resto=0;
	static int restoJ=0;
	static int restoJ2=0;
	static int restoR=0;
	static int restoR2=0;
	static int restoL=0;
	static int restoL2=0;
	static int restoD=0;
	static int restoD2=0;
	static int jornal = 10;
	static int revista = 20;
	static int livro = 30;
	static int disco = 40;
	
	public static void jornal (int n1) {
		
		restoJ=n1*jornal;
		restoJ2=restoJ+restoJ2;

	}

	public static void revistas (int n1) {
		
		restoR=n1*revista;
		restoR2=restoR+restoR2;
	
	}
	
	public static void livro (int n1) {
		
		restoL=n1*livro;
		restoL2=restoL+restoL2;

	}
	
	public static void disco (int n1) {
		restoD=n1*disco;
		restoD2=restoD+restoD2;

	}
	
	public static void soma () {
		
		resto=restoJ2+restoR2+restoL2+restoD2;
		
	}
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int n,n1;
		
		
		while(true) {
			
			System.out.println("1. Jornal");
			System.out.println("2. Revista");
			System.out.println("3. Livro");
			System.out.println("4. Disco");
			System.out.println("5. Sair");
			n=entrada.nextInt();
			
			if(n==5) {
				System.out.println("Saindo...");
				System.out.println("total R$");
				soma();
				System.out.println(resto);
				break;
			}
			else {
			
			switch (n) {
			case 1:
				System.out.println("Quantos Jornais vai querer");
				n1=entrada.nextInt();
				jornal(n1);
				break;
				
			case 2:
				System.out.println("Quantas revistas vai querer");
				n1=entrada.nextInt();
				revistas(n1);
				break;
				
			case 3:
				System.out.println("Quantos livros vai querer");
				n1=entrada.nextInt();
				livro(n1);
				break;
				
			case 4:
				System.out.println("Quantos disco vai querer");
				n1=entrada.nextInt();
				disco(n1);
				break;
				
				default:
					System.out.println("Opçao invalida");
					break;
			}
		}
			
					
	  }
		entrada.close();
	}
	
}


