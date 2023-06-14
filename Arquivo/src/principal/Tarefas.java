package principal;

import java.util.Scanner;
import entidades.Sistema_tarefa;
import entidades.Tarefa;

public class Tarefas {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int id, n;
		String nome, descricao, tempo;
		Tarefa tares = new Tarefa();
		Sistema_tarefa sis = new Sistema_tarefa();

		do {

			System.out.println("1 - Adicionar Tarefa");
			System.out.println("2 - Remover Tarefa");
			System.out.println("3 - Sair");
			n = entrada.nextInt();


		
		switch (n) {
		
		
		case 1:
			
			
			System.out.println("ID da tarefa: ");
			id=entrada.nextInt();
			tares.setId(id);
			
			System.out.println("Nome da tarefa: ");
			nome=entrada.next();
			tares.setNome(nome);
			entrada.nextLine();
			
			System.out.println("Descricao tarefa: ");
			descricao=entrada.nextLine();
			tares.setDescricao(descricao);

			System.out.println("Tempo da tareda: ");
			tempo=entrada.next();
			tares.setTempo(tempo);
			
			sis.Add(tares);
			sis.listar();
			
			break;
			
			
		case 2:
			
			
			System.out.println("ID da tarefa: ");
			id=entrada.nextInt();
			tares.setId(id);
			
			sis.Remover(id);
			
			break;
			
		
		}
		
		} while (n != 3);

	}
		

}
