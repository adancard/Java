package entidades;

import java.util.ArrayList;

public class Professor {

	// Criando variaveis
	private int fpoo = 1;
	private int hr = 2;
	private int lm = 3;
	private int so = 4;

	// Criando arraylist de notas de cada materia
	private ArrayList<Double> notasfpoo;
	private ArrayList<Double> notashr;
	private ArrayList<Double> notaslm;
	private ArrayList<Double> notasso;

	// Criando arraylist do tipo aluno para armazenar os alunos criados
	private ArrayList<Aluno> al;

	// contrutor
	public Professor() {

		this.notasfpoo = new ArrayList<Double>();
		this.notashr = new ArrayList<Double>();
		this.notaslm = new ArrayList<Double>();
		this.notasso = new ArrayList<Double>();
		this.al = new ArrayList<Aluno>();

	}

	/**
	 * 
	 * Metodo para conseguir entrar na materia selecionada
	 * 
	 * @param senha
	 */

	public void Senhafpoo(int senha) {

		if (senha == fpoo) {

			System.out.println("Bem-Vindo, Professor de FPOO");

		}

		else {

			System.out.println("Senha incorreta");

		}

	}

	/**
	 * 
	 * Metodo para conseguir entrar na materia selecionada
	 * 
	 * @param senha
	 */

	public void Senhahr(int senha) {

		if (senha == hr) {

			System.out.println("Bem-Vindo, Professor de HR");

		}

		else {

			System.out.println("Senha incorreta");

		}

	}

	public void Senhalm(int senha) {

		if (senha == lm) {

			System.out.println("Bem-Vindo, Professor de LM");

		}

		else {

			System.out.println("Senha incorreta");

		}

	}

	/**
	 * 
	 * Metodo para conseguir entrar na materia selecionada
	 * 
	 * @param senha
	 */

	public void Senhaso(int senha) {

		if (senha == so) {

			System.out.println("Bem-Vindo, Professor de SO");

		}

		else {

			System.out.println("Senha incorreta");

		}

	}

	/**
	 * 
	 * metodo para adicionar os alunos
	 * 
	 * @param aluno
	 */

	public void addaluno(Aluno aluno) {

		al.add(aluno);

	}

	/**
	 * 
	 * Metodo para adicionar nota da materia de FPOO para o ID do aluno escrito e se
	 * nao tiver alunos ele vai dar a mensagem de erro
	 * 
	 * 
	 * @param nota
	 * @param id
	 */

	public void notasfpoo(double nota, int id) {

		if (al.isEmpty()) {

			System.out.println("Nao tem alunos para Adicionar notas");

		} else {

			for (Aluno a : this.al) {
				if (a.getId() == id) {

					notasfpoo.add(nota);

				} else {

					System.out.println("Aluno nao encontrado");

				}

			}

		}

	}

	/**
	 * 
	 * calcular a media de notas da materia de FPOO
	 * 
	 */

	public void mediafpoo() {

		if (notasfpoo.isEmpty()) {

			System.out.println("Nao a notas registradas");

		} else {

			double soma = 0;

			for (Double nota : notasfpoo) {
				soma = soma + nota;

				double media = soma / notasfpoo.size();

				System.out.printf("Media: %.2f", media);
			}

		}

	}

	/**
	 * 
	 * Metodo para adicionar nota da materia de HR para o ID do aluno escrito e se
	 * nao tiver alunos ele vai dar a mensagem de erro
	 * 
	 * 
	 * @param nota
	 * @param id
	 */

	public void notashr(double nota, int id) {

		if (al.isEmpty()) {

			System.out.println("Nao tem alunos para Adicionar notas");

		} else {

			for (Aluno a : this.al) {
				if (a.getId() == id) {

					notashr.add(nota);

				} else {

					System.out.println("Aluno nao encontrado");

				}

			}

		}

	}

	/**
	 * 
	 * calcular a media de notas da materia de HR
	 * 
	 */

	public void mediahr() {

		if (notashr.isEmpty()) {

			System.out.println("Nao a notas registradas");

		} else {

			double soma = 0;

			for (Double nota : notashr) {
				soma = soma + nota;

				double media = soma / notashr.size();

				System.out.printf("Media: %.2f", media);
			}

		}

	}

	/**
	 * 
	 * Metodo para adicionar nota da materia de LM para o ID do aluno escrito e se
	 * nao tiver alunos ele vai dar a mensagem de erro
	 * 
	 * 
	 * @param nota
	 * @param id
	 */

	public void notaslm(double nota, int id) {

		if (al.isEmpty()) {

			System.out.println("Nao tem alunos para Adicionar notas");

		} else {

			for (Aluno a : this.al) {
				if (a.getId() == id) {

					notaslm.add(nota);

				} else {

					System.out.println("Aluno nao encontrado");

				}

			}

		}

	}

	/**
	 * 
	 * calcular a media de notas da materia de HR
	 * 
	 */

	public void medialm() {

		if (notaslm.isEmpty()) {

			System.out.println("Nao a notas registradas");

		} else {

			double soma = 0;

			for (Double nota : notaslm) {
				soma = soma + nota;

				double media = soma / notaslm.size();

				System.out.printf("Media: %.2f", media);
			}

		}

	}

	/**
	 * 
	 * Metodo para adicionar nota da materia de SO para o ID do aluno escrito e se
	 * nao tiver alunos ele vai dar a mensagem de erro
	 * 
	 * 
	 * @param nota
	 * @param id
	 */

	public void notasso(double nota, int id) {

		if (al.isEmpty()) {

			System.out.println("Nao tem alunos para Adicionar notas");

		} else {

			for (Aluno a : this.al) {
				if (a.getId() == id) {

					notasso.add(nota);

				} else {

					System.out.println("Aluno nao encontrado");

				}

			}

		}

	}

	/**
	 * 
	 * calcular a media de notas da materia de SO
	 * 
	 */

	public void mediaso() {

		if (notaslm.isEmpty()) {

			System.out.println("Nao a notas registradas");

		} else {

			double soma = 0;

			for (Double nota : notasso) {
				soma = soma + nota;

				double media = soma / notasso.size();

				System.out.printf("Media: %.2f", media);
			}

		}

	}

	/**
	 * 
	 * Metodo para listar o ID do aluno da materia de FPOO
	 * 
	 * @param id
	 */

	public void listarfpoo(int id) {

		System.out.println("____________");
		for (Aluno a : this.al) {

			if (a.getId() == id) {

				a.mostrar();
				mediafpoo();
				System.out.println("____________");

			}

		}

	}

	/**
	 * 
	 * Metodo para listar o ID do aluno da materia de LM
	 * 
	 * @param id
	 */

	public void listarlm(int id) {

		System.out.println("____________");
		for (Aluno a : this.al) {

			if (a.getId() == id) {

				a.mostrar();
				medialm();
				System.out.println("____________");

			}

		}

	}

	/**
	 * 
	 * Metodo para listar o ID do aluno da materia de HR
	 * 
	 * @param id
	 */

	public void listarhr(int id) {

		System.out.println("____________");
		for (Aluno a : this.al) {

			if (a.getId() == id) {

				a.mostrar();
				mediahr();
				System.out.println("____________");

			}

		}

	}

	/**
	 * 
	 * Metodo para listar o ID do aluno da materia de SO
	 * 
	 * @param id
	 */

	public void listarso(int id) {

		System.out.println("____________");
		for (Aluno a : this.al) {

			if (a.getId() == id) {

				a.mostrar();
				mediaso();
				System.out.println("____________");

			}

		}

	}

}
