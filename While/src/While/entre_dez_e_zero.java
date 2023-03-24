package While;

import java.util.Scanner;

public class entre_dez_e_zero {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int n1,n2,n3,n4,n5,n6,n7,n8,n9,n10,entredez=0;
		
		System.out.println("informe o primeiro numero");
		n1=entrada.nextInt();
		System.out.println("informe o segundo numero");
		n2=entrada.nextInt();
		System.out.println("informe o terceiro numero");
		n3=entrada.nextInt();
		System.out.println("informe o quarto numero");
		n4=entrada.nextInt();
		System.out.println("informe o quinto numero");
		n5=entrada.nextInt();
		System.out.println("informe o sexto numero");
		n6=entrada.nextInt();
		System.out.println("informe o setimo numero");
		n7=entrada.nextInt();
		System.out.println("informe o oitavo numero");
		n8=entrada.nextInt();
		System.out.println("informe o nono numero");
		n9=entrada.nextInt();
		System.out.println("informe o decimo numero");
		n10=entrada.nextInt();
		
		entrada.close();
		
		do {
			if(n1 <= 10 && n1 >= 0) {
				entredez=entredez+1;
			}
			if(n2 <= 10 && n2 >= 0) {
				entredez=entredez+1;
			}
			if(n3 <= 10 && n3 >= 0) {
				entredez=entredez+1;
			}
			if(n4 <= 10 && n4 >= 0) {
				entredez=entredez+1;
			}
			if(n5 <= 10 && n5 >= 0) {
				entredez=entredez+1;
			}
			if(n6 <= 10 && n6 >= 0) {
				entredez=entredez+1;
			}
			if(n7 <= 10 && n7 >= 0) {
				entredez=entredez+1;
			}
			if(n8 <= 10 && n8 >= 0) {
				entredez=entredez+1;
			}
			if(n9 <= 10 && n9 >= 0) {
				entredez=entredez+1;
			}
			if(n10 <= 10 && n10 >= 0) {
				entredez=entredez+1;
			}
			System.out.println("A quantidade de numeros que estao entre 0 e 10:");
			System.out.println(entredez);
			break;
		}while(true);

	}

}
