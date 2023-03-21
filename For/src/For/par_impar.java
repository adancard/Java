package For;

import java.util.Scanner;

public class par_impar {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		int n1,n2,cont=0;
		
		System.out.println("Informe um numero: ");
		n1=entrada.nextInt();
		System.out.println("informe o segundo numero: ");
		n2=entrada.nextInt();
		entrada.close();
		
		if (n2>n1) {
		for (cont = n1; cont <= n2;cont++) {
			if(cont%2==0) {
				System.out.println("par");
			}
			else {
				System.out.println("impar");
			}
			System.out.println(cont);
		}
	}
		else {
			for(cont = n2; cont <= n1; cont++) {
				if(cont%2==0) {
					System.out.println("par");
				}
				else {
					System.out.println("impar");
				}
				System.out.println(cont);
			}
		}
	}
}
