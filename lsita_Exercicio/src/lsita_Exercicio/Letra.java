package lsita_Exercicio;

import java.util.Scanner;

public class Letra {
	
	static int cont = 0;
	
	public static void vogais (String pala) {
		
		if (pala == "a") {
			cont++;
		}
		
	}
	

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int n;
		String pala;
		char a;
		
		while(true) {
			System.out.println("n");
			n=entrada.nextInt();
			
			if (n == 6) {
				break;
			}
			else {
				switch (n) {
				
				case 1:
					System.out.println("letra");
					pala=entrada.next();
					vogais(pala);
					System.out.println(cont);
					break;
					
				
				}
			}
		}

	}

}
