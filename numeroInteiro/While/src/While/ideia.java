package While;
import java.util.Scanner;

public class ideia {

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
				nota1=entrada.nextInt();
				System.out.println("informe a segunda nota: ");
				nota2=entrada.nextInt();
				
				if ((nota1 <= 10 && nota1 >=0) && (nota2 <= 10 && nota2 >=0)){

					
					media=(nota1+nota2)/2;
					alunos=alunos-1;
					System.out.printf("Quantidade de alunos:");
					System.out.println(alunos);
					System.out.printf("Media do aluno:");
					System.out.println(media);
				}
				else {
					System.out.println("informe um nota que esteja entre 0 e 10!");	
				}
				
			}
			  
		}
		

	}

}


