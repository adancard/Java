package entidades;

/**
 * 
 * Importando Biblioteca de erros e de lista
 * 
 */
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Turma {

	// Iniciando a lista dos alunos
	protected ArrayList<Aluno> listadealunos;

	// Contrutor
	public Turma() {

		this.listadealunos = new ArrayList();

	}

	/**
	 * 
	 * metodo para poder adicionar os alunos
	 * 
	 * @param aluno
	 */
	public void addAluno(Aluno aluno) {

		listadealunos.add(aluno);

		System.out.println("Aluno adicionado com sucesso");

	}

	/**
	 * 
	 * Metodo para poder editar as informaçoes de um aluno(ele acha pelo numero da
	 * matricula)
	 * 
	 * @param nome
	 * @param matricula
	 * @param idade
	 */

	public void Editaraluno(String nome, int matricula, int idade) {

		// Se a lista estiver vazia ele mostra a mensagem "Lista esta vazia"
		if (listadealunos.isEmpty()) {

			System.out.println("Lista esta vazia");

		}

		else {

			for (Aluno aluno : this.listadealunos) {

				if (aluno.getMatricula() == matricula) {

					aluno.setNome(nome);
					aluno.setMatricula(matricula);
					aluno.setIdade(idade);

				} else {

					System.out.println("Aluno nao encontrado");

				}

			}

		}

	}

	/**
	 * 
	 * Este metodo faz ele mostrar a lista total de alunos
	 * 
	 */
	public void listar() {

		if (listadealunos.isEmpty()) {

			System.out.println("Lista vazia");

		}

		else {

			System.out.println("___________");
			for (Aluno a : listadealunos) {

				a.Mostrar();

				System.out.println("___________");
				System.out.println("\n");

			}

		}

	}

	/**
	 * 
	 * Metodo para remover o aluno(ele remove pelo numero colocado da matricula)
	 * 
	 * @param matricula
	 */

	public void remover(int matricula) {

		if (listadealunos.isEmpty()) {

			System.out.println("Lista vazia");

		}

		else {

			for (Aluno a : this.listadealunos) {

				if (a.getMatricula() == matricula) {

					this.listadealunos.remove(a);

					System.out.println("Removido com sucesso");
					return;

				}

				System.out.println("Aluno nao encontrado");

			}

		}

	}

	/**
	 * 
	 * Metodo para criar uma arquivo em exel ele vai armazenar o nome, o numero da
	 * matricula e a idade do aluno
	 * 
	 */

	public void AddArquivo() {

		if (listadealunos.isEmpty()) {

			System.out.println("Aluno nao encontrado");

		} else {

			try {
				FileWriter fileWriter = new FileWriter("Escola.csv", true);
				for (Aluno a : this.listadealunos) {

					fileWriter.write("Nome: " + a.getNome() + "\n" + "Matricula: " + a.getMatricula() + "\n" + "Idade: "
							+ a.getIdade() + "\n");
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
