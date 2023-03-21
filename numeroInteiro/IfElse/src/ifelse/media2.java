package ifelse;

import java.util.Scanner;

public class media2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int n1,n2,n3,media;
		
		System.out.println("informe a primeira nota: ");
		n1=entrada.nextInt();
		System.out.println("informe a segunda nota: ");
		n2=entrada.nextInt();
		System.out.println("informe a terceira nota: ");
		n3=entrada.nextInt();
		
		media=(n1+n2+n3)/3;
		
		if (media >= 5) {
			System.out.println("aprovado");
		}
		else {
			System.out.println("reprovado");
		}
	}

}
