package While;

import java.util.Scanner;

public class produto {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int n1,n2;
         
		
		System.out.println("informe o primeiro numero: ");
		 n1 = entrada.nextInt();
		System.out.println("informe o segundo numero: ");
		 n2 = entrada.nextInt();
		
		if (n1>n2) {
			while (n2<n1) {
				System.out.println(++n2);
			}
		}
		
		else if (n1 == n2 && n2 == n1) {
			System.out.println("Os numeros sao iguais");
		}
		else {
			while(n1<n2) {
				System.out.println(++n1);
			}
		}
		
	}

}
