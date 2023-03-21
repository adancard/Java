package metodo;

import java.util.Scanner;

public class menos_um_2 {
	
	static int sub = 0;
	static int adicao = 0;
	static int div;
	static double raiz;
	static double expo;
	
	public static void soma (int n) {
		if (n == -1) {
			System.out.println("esta eh sua adicao");
			System.out.println(adicao);
		}
		else {
			adicao = adicao+n;
		}
	}
	
	public static void sub ( int n) {
		
		if(n == -1) {
			System.out.println("subtraçao");
			System.out.println(sub);
		}
		else {
			sub = sub - n;
			
		}
	}
	
	public static void div (int n) {
		
		if (n == -1) {
			System.out.println("divisao");
			System.out.println(div);
		}
		else {
			div = n/n;
		}
		
	}
	
	public static void raiz (int n) {
		if (n == -1) {
			System.out.println("raiz");
			System.out.println(raiz);
		}
		else {
			raiz =  Math.sqrt(n);
		}
		
	}
	
	public static void expoente (int n) {
		if (n == -1) {
			System.out.println("expoente");
			System.out.println(expo);
		}
		else {
			expo =  Math.pow(n,n);
		}
		
	}
	
	
	

	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	int n;
	
	System.out.println("digite algo para começar");
	n=entrada.nextInt();
	while (true) {
		if(n == -1) {
			break;
		}
		else {
			System.out.println("n");
			n=entrada.nextInt();
			
			soma(n);
			sub(n);
			div(n);
			raiz(n);
			expoente(n);
		}
	}

	}

}
