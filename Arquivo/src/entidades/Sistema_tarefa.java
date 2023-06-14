package entidades;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Sistema_tarefa {

	protected ArrayList<Tarefa> tares;
	private String texto;

	public Sistema_tarefa() {

		this.tares = new ArrayList();

	}

	public void Add(Tarefa a) {

		tares.add(a);

		try (FileOutputStream fout = new FileOutputStream("Tarefas.csv");
				BufferedOutputStream bout = new BufferedOutputStream(fout)) {

			

			System.out.println("Arquivo criado e" + "\n" + "mensagem escrita com sucesso!");
		} catch (FileNotFoundException e) {
			System.err.println("Captura de Excecao: " + e.getMessage());
		} catch (IOException e) {
			System.err.println("Ocorreu um erro: " + e.getMessage());

		}
	}

	public void Remover(int codigo) {

		if (tares.isEmpty()) {

			System.out.println("A lista esta vazia");

		} else {

			for (Tarefa a : this.tares) {

				if (a.getId() == codigo) {

					tares.remove(a);
					atualizar();

				} else {

					System.out.println("Codigo incorreto");

				}

			}

		}

	}

	public void listar() {

		if (tares.isEmpty()) {

			System.out.println("Lista Vazia");

		}

		else {

			System.out.println("___________");
			for (Tarefa a : tares) {

				a.Mostrar();

				System.out.println("___________");
				System.out.println("\n");

			}

		}

	}

	public void carregar() throws FileNotFoundException {

		Scanner s = new Scanner(new File("Tarefas.csv"));
		ArrayList<String> list = new ArrayList<String>();
		while (s.hasNext()) {
			list.add(s.next());
		}
		s.close();
		atualizar();

	}

	public void atualizar() {

		try (FileOutputStream fout = new FileOutputStream("Tarefas.csv");
				BufferedOutputStream bout = new BufferedOutputStream(fout)) {
			
		

			System.out.println("Arquivo criado e" + "\n" + "mensagem escrita com sucesso!");
		} catch (FileNotFoundException e) {
			System.err.println("Captura de Excecao: " + e.getMessage());
		} catch (IOException e) {
			System.err.println("Ocorreu um erro: " + e.getMessage());

		}
	}

}
