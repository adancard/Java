package entidades;

import java.util.ArrayList;

public class Aluno extends Pessoa {
	private String codTurma;
	private Disciplina disciplina;
	private ArrayList<Double> listaNotas;

	// construtor

	public Aluno(String nome, long cpf, String codTurma, Disciplina disciplina) {
		super(nome, cpf);
		this.codTurma = codTurma;
		this.disciplina = disciplina;
		this.listaNotas = new ArrayList<>();
	}

	/**
	 * metodo para adicionar nota na lista de notas.
	 * 
	 * @param nota
	 */
	public void adicionarNota(double nota) {
		listaNotas.add(nota);
	}

	/**
	 * metodo para remover uma nota de acordo com o indice informado.
	 * 
	 * @param indice
	 */
	public void removerNota(int indice) {
		if (listaNotas.isEmpty()) {
			System.out.println("\nLista vazia!\n");
		} else if ((indice < 0) && (indice >= listaNotas.size())) {
			System.out.println("\nValor invalido!\n");
		} else {
			listaNotas.remove(indice - 1);
			System.out.printf("\n%dº nota removida com sucesso!\n", indice);
		}
	}

	/**
	 * metodo para printar as notas e suas posicoes no indice. Tambem printa o nome
	 * e a disciplina do aluno para que o usuário saiba de quem são as notas.
	 */
	public void listarNotas() {
		System.out.println();
		System.out.println("Nome: " + getNome());
		System.out.println("Disciplina: " + getDisciplina());

		for (int i = 0; i < listaNotas.size(); i++) {
			System.out.printf("%dº Nota: %.2f \n", i + 1, listaNotas.get(i));
		}
	}

	/**
	 * metodo para calcular a media de notas do aluno, de acordo com a soma das
	 * notas e quantidade delas. printa aprovado caso a media seja superior ou igual
	 * a 6 e reprovado caso a media seja inferior a 6.
	 */
	public void calcularMedia() {
		if (listaNotas.isEmpty()) {
			System.out.println("\nLista vazia!\n");
		} else {
			double soma = 0;

			for (Double nota : listaNotas) {
				soma = soma + nota;
			}
			System.out.println("___________");
			System.out.printf("\nNome: %s\n", this.nome);

			System.out.println("Disciplina: " + disciplina);

			System.out.printf("\nNota Total: %.2f\n", soma);

			System.out.printf("Quantidade de notas: %d\n", listaNotas.size());

			double media = soma / listaNotas.size();

			System.out.printf("Media: %.2f", media);
			if (media >= 6) {
				System.out.println("\nAluno aprovado!\n");
			} else {
				System.out.println("\nAluno reprovado!\n");
			}
			System.out.println("___________");
		}
	}

	/**
	 * metodo para exibir as informacoes de aluno.
	 */
	@Override
	public void exibirInformacoes() {
		System.out.println("Nome: " + this.nome);
		System.out.println("CPF: " + this.cpf);
		System.out.println("Codigo: " + this.codTurma);
		System.out.println("Disciplina: " + this.disciplina);

		for (int i = 0; i < listaNotas.size(); i++) {
			System.out.printf("%dº Nota: %.2f \n", i + 1, listaNotas.get(i));
		}

	}

	/**
	 * gets e sets.
	 */
	public ArrayList<Double> getListaNotas() {
		return listaNotas;
	}

	public void setListaNotas(ArrayList<Double> listaNotas) {
		this.listaNotas = listaNotas;
	}

	public void setCodTurma(String codTurma) {
		this.codTurma = codTurma;
	}

	public void setNotas(ArrayList<Double> notas) {
		listaNotas = notas;
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

}
