package entidades;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Diretor {

	//Criando uma arraylist do tipo aluno
	private ArrayList<Aluno> al;

	
	/**
	 * 
	 * metodo para criar um arquivo e escrever o nome dos alunos que foram registrados na arraylist
	 * 
	 */
	
	public void AddArquivo() {

		if (al.isEmpty()) {

			System.out.println("Aluno nao encontrado");

		} else {

			try {
				FileWriter fileWriter = new FileWriter("Escola.csv", true);
				for (Aluno a : this.al) {

					fileWriter.write("Nome: " + a.getNome() + "\n" + "ID: " + a.getId());
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
}
