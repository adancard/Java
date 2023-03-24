package metodo;

import java.util.Scanner;

public class menos_um_metodo {
	
	static int  nMaior=0;
	static int  nMenor=1000;
	static int adicao=0;
	static int quanti=0;
	static int resultado = 0;
	static int cont = 0;
	public static void soma (int n1) {
		if(n1 == -1) {
			System.out.println("Esta eh a adiçao");
			System.out.println(adicao);
		}
		else {
		adicao = n1+adicao;
		}
	}
	public static void quantidade (int n1) {
		
		if(n1 == -1) {
			System.out.println("Esta eh a quantidade");
			System.out.println(quanti);
		}
		else {
		quanti++;
		}
		
	}
	public static void media (int n1) {
		
		if(n1 == -1) {
			System.out.println("Esta eh a média: ");
			System.out.println(resultado);
			
		}
		else {
			resultado = (n1+cont)/quanti;
			
		}
		
		
	}
	
	public static void maior (int n1) {
		if(n1 == -1) {
			System.out.println("Esta eh o Numero Maior: ");
			System.out.println(nMaior);
			System.out.println("Esta eh o Numero Menor: ");
			System.out.println(nMenor);	
			
		}
		else {
		
			if(n1 > nMaior) {
			nMaior = n1;
			}
			else if (n1 < nMenor) {
			nMenor=n1;
			}
	    
		}

		

	}


		public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int n1;
		while(true) {
		System.out.println("Informe um numero");
		n1=entrada.nextInt();
		
		soma(n1);
		maior(n1);
		quantidade(n1);
		media(n1);
		}

	}

}
