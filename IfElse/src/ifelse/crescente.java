package ifelse;

import java.util.Scanner;

public class crescente {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int n1,n2,n3;
		
		System.out.println("informe o primeiro numero: ");
		n1=entrada.nextInt();
		System.out.println("informe o segundo numero: ");
		n2=entrada.nextInt();
		System.out.println("informe o terceiro numero: ");
		n3=entrada.nextInt();
		
		if (n1>n2 && n1>n3) {
			System.out.println(n1);
		}
		else if (n2>n1 && n2>n3) {
			System.out.println(n2);
		}
		else {
			System.out.println(n3);
		}
		entrada.close();
	}

}
