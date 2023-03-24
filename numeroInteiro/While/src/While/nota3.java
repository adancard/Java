package While;

import java.util.Scanner;

public class nota3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int nota1, nota2, nota3, media;
		
		System.out.println("informe a primeira nota: ");
		nota1 = entrada.nextInt();
		System.out.println("informe a segunda nota: ");
		nota2 = entrada.nextInt();
		System.out.println("informe a terceira nota: ");
		nota3 = entrada.nextInt();
		
		while (true) {
			
			if (nota1 !=0 && nota2 != 0 && nota3 !=0)  {
				
				media = (nota1+nota2+nota3)/3;
				System.out.println("A media eh: ");
				System.out.println(media);
				if (media >= 5) {
					System.out.println("Aprovado");
				}
				else {
					System.out.println("Reprovado");
				}
				
				break;
		     }
			else {
				System.out.println("por favor digite outro numero diferente de 0");
				
				System.out.println("informe a primeira nota: ");
				nota1 = entrada.nextInt();
				System.out.println("informe a segunda nota: ");
				nota2 = entrada.nextInt();
				System.out.println("informe a terceira nota: ");
				nota3 = entrada.nextInt();
				
				media = (nota1+nota2+nota3)/3;
			}
			System.out.println("A media eh: ");
			System.out.println(media);
		}
	
		

	}

}