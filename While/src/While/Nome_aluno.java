package While;
import java.util.Scanner;

public class Nome_aluno {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int alunos;
		String nome;
		
		System.out.println("n alunos");
		alunos=entrada.nextInt();
		
		System.out.println("nomes");
		nome=entrada.next();
		alunos=alunos-1;
		
		while(true) {
			if(alunos == 0){
				break;
			}
			else {
				System.out.println("nomes");
				nome=entrada.next();
				alunos=alunos-1;
			
			}
		}
	}

}
