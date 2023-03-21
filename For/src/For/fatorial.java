package For;

import java.util.Scanner;

public class fatorial {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int n, fat=1,cont;
		
		System.out.println("informe um numero");
		n=entrada.nextInt();
		
		while(true) {
			if(n>0) {
				for(cont=n;cont>=1;cont--) {
					fat=fat*cont;

				}
				System.out.println("O fatorial desse numero eh: ");
				System.out.println(fat);
				
				break;
			}
			else {
				System.out.println("informe um numero maior ou diferente de 0");
				System.out.println("informe um numero");
				n=entrada.nextInt();
			}
				
			}

	}

}
