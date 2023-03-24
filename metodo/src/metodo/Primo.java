package metodo;

import java.util.Scanner;

public class Primo {
	
	public static int Primo (int n1) {
		int result;
		
		 result = n1%2;
		 return result;
	}
	
	
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int n1,primo;
		
		System.out.println("n");
		n1=entrada.nextInt();
		
		primo = Primo(n1);
		
		if (primo != 0 || n1 == 2) {
			System.out.println("primo");
		  
		}
		else {
			System.out.println("n primo");
		}
		entrada.close();

	}

}
