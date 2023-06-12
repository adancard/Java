package entidades;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Sistema_tarefa {

	protected ArrayList<Tarefa> tares;

	public Sistema_tarefa() {

		this.tares = new ArrayList();

	}

	public void Add(int codigo, Tarefa a) {

		if (a.getId() == codigo) {

			System.out.println("Tarefa ja Adicionada");

		} else {

			tares.add(a);

			try {
				FileWriter fileWriter = new FileWriter("Tarefas.csv", true);
				for (Tarefa b : this.tares) {

					fileWriter.write("ID: " + b.getId() + "\n" + "Tarefa: " + b.getNome() + "\n" + "Descricao: "
							+ b.getDescricao() + "\n" + "Tempo para fazer: " + b.getTempo());
					fileWriter.close();
				}

				System.out.println("Arquivo salvo com sucesso");

			} catch (FileNotFoundException e) {
				System.out.println("Arquivo nao encontrado: " + e.getMessage());
			} catch (IOException e) {
				System.out.println("Excecao: " + e.getMessage());
			}
		}

	}

	public void Remover(int codigo, Tarefa a) {

		if (tares.isEmpty()) {

			System.out.println("A lista esta vazia");

		} else {

			if (a.getId() == codigo) {

				tares.remove(a);
				atualizar();

			} else {

				System.out.println("Codigo incorreto");

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
	
	public void carregar() {;
	
	}
	
	
	public void atualizar() {
		
		try {
			FileWriter fileWriter = new FileWriter("Tarefas.csv", true);
			for (Tarefa b : this.tares) {

				fileWriter.write("ID: " + b.getId() + "\n" + "Tarefa: " + b.getNome() + "\n" + "Descricao: "
						+ b.getDescricao() + "\n" + "Tempo para fazer: " + b.getTempo());
				fileWriter.close();
			}

			System.out.println("Arquivo salvo com sucesso");

		} catch (FileNotFoundException e) {
			System.out.println("Arquivo nao encontrado: " + e.getMessage());
		} catch (IOException e) {
			System.out.println("Excecao: " + e.getMessage());
		}
	
	}

}
