package entidades;

import java.util.ArrayList;
import java.util.Scanner;

public class Turma {
	protected int id;
	protected ArrayList<Aluno> alunos;

	/**
	 * Construtor
	 */
	public Turma() {
		this.id = id;
		this.alunos = new ArrayList<>();
	}

	/*
	 * metodo para adicionar alunos na lista de alunos.
	 */
	public void adicionarAluno(Aluno aluno) {
		alunos.add(aluno);
		System.out.println("Aluno adicionado!");
	}

	/**
	 * metodo que utiliza do cpf do aluno para encontra-lo na lista, e entao realiza
	 * a acao de remove-lo.
	 * 
	 * @param cpf
	 */

	public void removerAluno(long cpf) {
		if (alunos.isEmpty()) {
			System.out.println("Não há alunos para remover! \nAdicione novos alunos!\n");
		} else {
			for (Aluno a : this.alunos) {
				if (a.getCpf() == cpf) {
					this.alunos.remove(a);
					System.out.println("Aluno removido com sucesso!\n");
					return;
				}
			}
			System.out.println("Aluno nao encontrado!\n");
		}
	}

	/**
	 * metodo que utiliza o metodo "exibirInformacoes" de cada aluno para listar
	 * todos os alunos.
	 */
	public void listarAlunos() {
		if (alunos.isEmpty()) {
			System.out.println("Lista vazia! \nAdicione novos alunos!\n");
		} else {
			System.out.println("___________");
			for (Aluno a : alunos) {
				a.exibirInformacoes();
				System.out.println("___________");
				System.out.println("\n");
			}
		}
	}

	/**
	 * metodo para editar informacoes de aluno. recebe um cpf para procurar o aluno
	 * especifico na lista de alunos, apos encontrar, o metodo reescreve as
	 * informacoes de aluno. (nao reescreve as notas).
	 * 
	 * @param cpfProcurar
	 * @param nome
	 * @param cpf
	 * @param codTurma
	 * @param disciplina
	 */
	public void editarAluno(long cpfProcurar, String nome, long cpf, String codTurma, Disciplina disciplina) {
		if (alunos.isEmpty()) {
			System.out.println("Não há alunos para editar \nAdicione novos alunos!\n");
		} else {
			for (Aluno a : this.alunos) {
				if (a.getCpf() == cpfProcurar) {
					a.setNome(nome);
					a.setCpf(cpf);
					a.setCodTurma(codTurma);
					a.setDisciplina(disciplina);
					System.out.printf("Informacoes do aluno %s editadas com sucesso!\n", a.getNome());
					return;
				}
			}
			System.out.println("Aluno nao encontrado!\n");
		}
	}

	/**
	 * METODOS AUXILIARES
	 * 
	 * foram usados principalmente para encontrar o aluno especifico na lista de
	 * aluno,
	 */

	/**
	 * metodo auxiliar para o metodo de adicionar notas de Aluno. Esse metodo recebe
	 * o cpf do aluno para encontra-lo na lista, apos isso, insere as notas em aluno
	 * apartir do metodo "adicionarNota". Tambem exibe as informacoes de aluno para
	 * que o usuario possa ver que as notas foram adicionadas
	 * 
	 * @param cpf
	 * @param lerDados
	 */
	public void auxiAdicionarNotas(long cpf, Scanner lerDados) {
		double nota = 0;
		int qtdNotas = 0;
		if (alunos.isEmpty()) {
			System.out.println("Nao ha alunos na lista! \nAdicione novos alunos!");
		} else {
			for (Aluno a : alunos) {
				if (a.getCpf() == cpf) {
					System.out.printf("Insira a quantidade de notas que serao adicionadas: ");
					qtdNotas = lerDados.nextInt();

					for (int i = 0; i < qtdNotas; i++) {
						System.out.printf("Insira a nota: ");
						nota = lerDados.nextDouble();
						a.adicionarNota(nota);
					}
					a.exibirInformacoes();
				}
			}
		}
	}

	/**
	 * metodo auxiliar para o metodo "removerNota" de Aluno. Utiliza o cpf para
	 * encontrar o aluno na lista, apos isso, utiliza o indice inserido pelo usuario
	 * para utilizar o metodo "removerNota".
	 * 
	 * @param cpf
	 * @param indice
	 */
	public void auxiRemoverNotas(long cpf, int indice) {
		for (Aluno a : alunos) {
			if (a.getCpf() == cpf) {
				a.removerNota(indice);
			}
		}
	}

	/**
	 * metodo auxiliar para o metodo "listarNotas" de Aluno. Utiliza o cpf para
	 * encontrar o aluno na lista, apos isso, utiliza o metodo "listarNotas".
	 * 
	 * @param cpf
	 * @param lerdados
	 */
	public void auxiListarNotas(long cpf) {
		if (alunos.isEmpty()) {
			System.out.println("Nao ha alunos na lista! \nAdicione novos alunos!");
		} else {
			for (Aluno a : alunos) {
				if (a.getCpf() == cpf) {
					a.listarNotas();
				}
			}
		}
	}

	/**
	 * metodo auxiliar para o metodo "calcularMedia" de Aluno. Utiliza o cpf do
	 * aluno para encontra-lo na lista e entao chama o metodo "calcularMedia".
	 * 
	 * @param cpf
	 */
	public void auxiCalcMedia(long cpf) {
		if (alunos.isEmpty()) {
			System.out.println("Nao ha alunos na lista! \nAdicione novos alunos!");
		} else {
			for (Aluno a : alunos) {
				if (a.getCpf() == cpf) {
					a.calcularMedia();
				}
			}
		}
	}

	/**
	 * get e set
	 */

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
