package metodo;

import java.util.Scanner;

public class fatorial {
	
	public static int fat (int n1,int fat) {
		int cont;
		for(cont=n1;cont>=1;cont--) {
			fat=fat*cont;
		}
		return fat;
	}
	
	public static int raiz (int n1) {
		  double resultado = Math.sqrt(n1);
		  
		  return (int) resultado;
	}
	
	public static int expoente (int n1) {
		 double result = Math.pow(n1,2);
		 return (int) result;
	}


	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int n1,result,result2,result3,a=1;
		
		System.out.println("informe um numero");
		n1=entrada.nextInt();
		
		result = fat(n1,a);
		result2 = raiz (n1);
		result3 = expoente(n1);
		
		System.out.println("Fatorial: "+result);
		System.out.println("Raiz: "+result2);
		System.out.println("Expoente: "+result3);

	}

}
