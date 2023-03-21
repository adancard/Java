package While;

import java.util.Scanner;

public class alunos {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int media, alunos, nota1, nota2;
		
		System.out.println("alunos");
		alunos=entrada.nextInt();
		
		
		while (true) {
			
			if (alunos == 0) {
				break;
			}
			
			else {
				System.out.println("informe a primeira nota: ");
				nota1 = entrada.nextInt();
				System.out.println("informe a segunda nota: ");
				nota2 = entrada.nextInt();
				
				media = (nota1+nota2)/2;
				alunos = alunos - 1;
				
			}
			    System.out.println("quantidade de alunos: ");
			    System.out.println(alunos);
			    System.out.println("A media eh:");
	            System.out.println(media);
		}
		

	}

}
