package principal;

import java.util.Scanner;
import pacote.aluno;

public class Sistema {
	
	public static void main(String[] args) {
		int idade;
		String nome,materia;
		Scanner entrada = new Scanner(System.in);
		aluno a = new aluno();
		
		System.out.println("Nome: ");
		nome=entrada.next();
		a.setNome(nome);
		System.out.println("idade: ");
		idade=entrada.nextInt();
		a.setIdade(idade);
		System.out.println("materia: ");
		materia=entrada.next();
		a.setMateria(materia);
		
		a.mostrar();
		
		
		
	}

}
