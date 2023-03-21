package lsita_Exercicio;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int n,n1,cont;
		
		while(true) {
			
			System.out.println("1. Achar os Numeros impar de 1 ate N");
			System.out.println("2. Achar os Numero pares de 1 ate N");
			System.out.println("3. Achar os Numeros primos de 1 ate N");
			System.out.println("4. Sair do programa");
			n=entrada.nextInt();
			
			if(n == 4) {
				break;
			}
			
			else {
				
				switch (n) {
				
				case 1:
					System.out.println("Informe o Numero");
					n1=entrada.nextInt();
					
					for (cont = 1; cont <= n1;cont++) {
					if (cont%2 != 0 || cont == 1) {
						System.out.println("impar");
						System.out.println(cont);
					}
					}
					break;
					
				case 2:
					System.out.println("Informe o Numero");
					n1=entrada.nextInt();
					
					for (cont = 1; cont <= n1;cont++) {
						if (cont%2 == 0) {
							System.out.println("par");
							System.out.println(cont);
						}
						}
						break;
					
				case 3:
					System.out.println("Informe o Numero");
					n1=entrada.nextInt();
					
					for(cont=1;cont<= n1; cont++) {
						if(cont%2 != 0 || cont == 2) {
							System.out.printf("%d\n",cont);
						}	
					}
					break;
				}
			}
		}
		entrada.close();
	}

}
