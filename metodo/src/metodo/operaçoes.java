package metodo;

import java.util.Scanner;

public class operaçoes {
	
	public static int soma (int n1, int n2) {
		int resultado;
		resultado = n1+n2;
		return resultado;
	}
	public static int subtraçao (int n1, int n2) {
		int resultado;
		resultado = n1 - n2;
		return resultado;
	}
	public static int multi (int n1, int n2) {
		int resultado;
		resultado = n1*n2;
		return resultado;
	}
	public static int divi (int n1, int n2) {
		int resultado;
			resultado = n1/n2;
			return resultado;
}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int n1,n2,resul,result2,result3,result4;
		
		System.out.println("informe dois numero");
		n1=entrada.nextInt();
		n2=entrada.nextInt();
		
		resul=soma(n1, n2);
		result2=subtraçao(n1, n2);
		result3=multi(n1, n2);
		result4=divi(n1, n2);
		
		System.out.println("A soma eh:"+ resul);
		System.out.println("A subtracao eh:"+ result2);
		System.out.println("A multiplicacao eh:"+ result3);
		System.out.println("A divisao eh:"+ result4);
	}

}
