package metodo;

import java.util.Scanner;

public class Fibonacci {
	
	public static int Fibonacci (int n1) {
		if(n1 < 2) {
			return n1;
		}else {
			return Fibonacci(n1-1)+Fibonacci(n1-2);
		}
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int n1,resultado;
		
		System.out.println("Informe um numero: ");
		n1=entrada.nextInt();
		
		resultado=Fibonacci(n1);
		
		while(true) {
			if(n1 == 0) {
				System.out.println("Informe um numero diferente de 0");
				n1=entrada.nextInt();
			}
			else {
				System.out.println(resultado);
				break;
			}
		}
		entrada.close();

	}

}
