package principal;

import java.util.ArrayList;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {

		ArrayList<String> tarefas = new ArrayList<String>();
		ArrayList<String> concluidas = new ArrayList<String>();
		Scanner entrada = new Scanner(System.in);
		int n;
		String tarefa, terminou;

		while (true) {

			System.out.println("1.Adicionar tarefa");
			System.out.println("2.Remover tarefa");
			System.out.println("3.Mostrar tarefas");
			System.out.println("4.Sair");
			n = entrada.nextInt();

			if (n == 4) {

				break;
			}

			else {

				switch (n) {

				case 1:

					System.out.println("Tarefa: ");
					tarefa = entrada.next();
					tarefas.add(tarefa);

					System.out.println("Terminou: ");
					terminou = entrada.next();
					concluidas.add(terminou);

					break;

				case 2:

					System.out.println("Remover Tarefa: ");
					tarefa = entrada.next();
					tarefas.remove(tarefa);

					System.out.println("Remover Terminou: ");
					terminou = entrada.next();
					concluidas.remove(terminou);

					break;

				case 3:

					System.out.println("Tarefas: ");
					for (int i = 0; i < tarefas.size(); i++) {
						System.out.printf("%s ", tarefas.get(i));
					}

					System.out.println(" ");

					System.out.println("terminou: ");
					for (int i = 0; i < concluidas.size(); i++) {
						System.out.printf("%s ", concluidas.get(i));
					}
					
					System.out.println(" ");

					break;

				}

			}

		}
		entrada.close();
	}

}
