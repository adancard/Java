package metodo;

import java.util.Scanner;

public class Venda {
	
	static float quanti=0;
	static float venda1=0;
	static float resto = 0;
	static float resto2 = 0;
	
 	public static void  registro (float venda) {
		venda1=venda;
		quanti++;
	}
	
	public static void soma () {
		resto=venda1+resto;
	}

	public static void media () {

		resto2=resto/quanti;	
	}
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int n;
		float venda;
		
		while(true) {

			System.out.println("1. Registrar uma nova Venda");
			System.out.println("2. Consultar Valor das vendas Registradas");
			System.out.println("3. Consultar Media das vendas Registradas ");
			System.out.println("4. Quantidade de vendas registradas");
			System.out.println("5. Saindo...");
			n=entrada.nextInt();
			
			if (n == 5) {
				System.out.println("Saindo...");
				break;
			}
			else {
			
			switch (n) {
			
			case 1:
				
				System.out.println("Valor da venda");
				venda=entrada.nextInt();
				registro(venda);
				soma();
				break;
				
			case 2:
				System.out.println(resto);
				break;
				
			case 3:
				media();
				System.out.println(resto2);
				break;
				
			case 4:
				System.out.println(quanti);
				break;	
			}
			
		}
		


	}

}
}
