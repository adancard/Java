package metodo;

import java.util.Scanner;

public class nota {
	
	public static int soma (int n1, int n2) {
		int resultado;
		resultado = n1+n2;
		return resultado;
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int n1,n2,resul;
		
		System.out.println("informe 2 numeros");
		n1=entrada.nextInt();
		n2=entrada.nextInt();
		
		resul = soma(n1,n2);
		
		System.out.println(resul);
		

	}

}
