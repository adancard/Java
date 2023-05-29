package principal;

import java.util.Scanner;

import entidades.Aluno;
import entidades.Disciplina;
import entidades.Professor;
import entidades.Turma;

public class Principal {

	


	/**
	 * metodo para adicionar nota em um aluno logo depois dele ter sido instanciado.
	 * 
	 * @param aluno
	 * @param lerDados
	 */
	

	/**
	 * MAIN
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner lerDados = new Scanner(System.in);

		Turma turma = new Turma();

		int menu = -1;
		long cpf = 0;
		double nota=0;

		while (menu != 0) {

			System.out.println();
			System.out.println("--- MENU PRINCIPAL ---");
			System.out.println("1 - Adicionar Aluno");
			System.out.println("2 - Remover Aluno");
			System.out.println("3 - Listar alunos da turma");
			System.out.println("4 - Editar informacoes de aluno");
			System.out.println("5 - Adicionar Professor");
			System.out.println("6 - Turma");
			System.out.println("7 - Menu de Notas");
			System.out.println("0 - Sair");
			System.out.println();
			System.out.printf("Selecione uma das opcoes: ");

			menu = lerDados.nextInt();

			switch (menu) {

			case 0:
				System.out.println("Saindo...");
				break;

			case 1:
				lerDados.nextLine();
				System.out.println("--- Adicionar Aluno ---");

				System.out.printf("Insira o nome do aluno: ");
				String nome = lerDados.next();

				System.out.printf("Insira o CPF do aluno: ");
				cpf = lerDados.nextLong();

				System.out.printf("Insira o codigo de turma do aluno: ");
				String codTurma = lerDados.next();

				System.out.println("1 - FPOO");
				System.out.println("2 - REDES");
				System.out.println("3 - SO");
				System.out.println("4 - LM");
				System.out.printf("Selecione uma das disciplinas: ");

				int menuDisciplinas = lerDados.nextInt();

				do {
					switch (menuDisciplinas) {
					case 1:
						Aluno aluno = new Aluno(nome, cpf, codTurma, Disciplina.FPOO);
						turma.adicionarAluno(aluno);
						aluno.adicionarNota(nota);
						aluno.exibirInformacoes();
						break;

					case 2:
						aluno = new Aluno(nome, cpf, codTurma, Disciplina.REDES);
						turma.adicionarAluno(aluno);
						aluno.adicionarNota(nota);
						aluno.exibirInformacoes();
						break;

					case 3:
						aluno = new Aluno(nome, cpf, codTurma, Disciplina.SO);
						turma.adicionarAluno(aluno);
						aluno.adicionarNota(nota);
						aluno.exibirInformacoes();
						break;

					case 4:
						aluno = new Aluno(nome, cpf, codTurma, Disciplina.LM);
						turma.adicionarAluno(aluno);
						aluno.adicionarNota(nota);
						aluno.exibirInformacoes();
						break;

					default:
						System.out.println("Digite uma opcao valida!");
					}
				} while ((menuDisciplinas == 1) && (menuDisciplinas == 2) && (menuDisciplinas == 3)
						&& (menuDisciplinas == 4));

				break;

			case 2:
				System.out.println("--- Remover aluno ---");
				System.out.printf("Insira o CPF do aluno: ");
				cpf = lerDados.nextLong();
				turma.removerAluno(cpf);

				break;

			case 3:
				System.out.println("--- Lista de alunos ---");
				turma.listarAlunos();

				break;

			case 4:
				System.out.println("--- Editar Informacoes de aluno ---");

				System.out.printf("Insira o CPF do aluno para encontrarmos: ");
				long cpfProcurar = lerDados.nextLong();

				System.out.println("Agora vamos inserir as novas informacoes!");

				System.out.printf("Insira o nome do aluno: ");
				nome = lerDados.next();

				System.out.printf("Insira o CPF do aluno: ");
				cpf = lerDados.nextLong();

				System.out.printf("Insira o codigo de turma do aluno: ");
				codTurma = lerDados.next();

				System.out.println("1 - FPOO");
				System.out.println("2 - REDES");
				System.out.println("3 - SO");
				System.out.println("4 - LM");
				System.out.printf("Selecione uma das disciplinas: ");

				menuDisciplinas = lerDados.nextInt();

				do {
					switch (menuDisciplinas) {
					case 1:
						turma.editarAluno(cpfProcurar, nome, cpf, codTurma, Disciplina.FPOO);
						break;

					case 2:
						turma.editarAluno(cpfProcurar, nome, cpf, codTurma, Disciplina.REDES);

						break;

					case 3:
						turma.editarAluno(cpfProcurar, nome, cpf, codTurma, Disciplina.SO);
						break;

					case 4:
						turma.editarAluno(cpfProcurar, nome, cpf, codTurma, Disciplina.LM);
						break;
						
						default:
							System.out.println("Digite uma opcao valida!");
					}
				} while ((menuDisciplinas == 1) && (menuDisciplinas == 2) && (menuDisciplinas == 3)
						&& (menuDisciplinas == 4));

				break;

			case 5:
				System.out.println("--- Professor ---");
				System.out.printf("Insira o nome do Professor: ");
				nome = lerDados.next();

				System.out.printf("Insira o CPF do Professor: ");
				cpf = lerDados.nextLong();

				System.out.printf("Insira a especialidade do Professor: ");
				String especialidade = lerDados.next();

				System.out.printf("Insira o periodo do Professor: ");
				String periodo = lerDados.next();
				System.out.println();

				System.out.println("1 - FPOO");
				System.out.println("2 - REDES");
				System.out.println("3 - SO");
				System.out.println("4 - LM");
				System.out.printf("Selecione a disciplina desse Professor: ");

				menuDisciplinas = lerDados.nextInt();

				do {
					switch (menuDisciplinas) {
					case 1:
						Professor professor = new Professor(nome, cpf, especialidade, periodo, Disciplina.FPOO);
						professor.exibirInformacoes();
						System.out.printf("Descricao: %s", Disciplina.FPOO.getDescricao());
						break;

					case 2:
						professor = new Professor(nome, cpf, especialidade, periodo, Disciplina.REDES);
						professor.exibirInformacoes();
						System.out.printf("Descricao: %s", Disciplina.REDES.getDescricao());
						break;

					case 3:
						professor = new Professor(nome, cpf, especialidade, periodo, Disciplina.SO);
						professor.exibirInformacoes();
						System.out.printf("Descricao: %s", Disciplina.SO.getDescricao());
						break;

					case 4:
						professor = new Professor(nome, cpf, especialidade, periodo, Disciplina.LM);
						professor.exibirInformacoes();
						System.out.printf("Descricao: %s", Disciplina.LM.getDescricao());
						break;
						
						default:
							System.out.println("Digite uma opcao valida!");
					}
				} while ((menuDisciplinas == 1) && (menuDisciplinas == 2) && (menuDisciplinas == 3)
						&& (menuDisciplinas == 4));

				break;

			case 6:
				System.out.println("--- Turma ---");
				System.out.printf("Insira o id da Turma: ");
				int id = lerDados.nextInt();

				turma.setId(id);

				System.out.println("Turma: ");
				System.out.println("ID: " + turma.getId());
				break;

			case 7:

				int menuNotas = 0;

				do {
					System.out.println();
					System.out.println("--- MENU DE NOTAS ---");
					System.out.println("1 - Adicionar nota");
					System.out.println("2 - Remover nota");
					System.out.println("3 - Lista de notas");
					System.out.println("4 - Calcular Media");
					System.out.println("5 - Voltar para o menu principal");
					System.out.println();
					System.out.printf("Selecione uma das opcoes: ");

					menuNotas = lerDados.nextInt();

					switch (menuNotas) {
					case 1:
						System.out.printf("Insira o CPF do aluno para encontrarmos: ");
						cpf = lerDados.nextLong();

						turma.auxiAdicionarNotas(cpf, lerDados);
						break;

					case 2:
						System.out.println("--- Remover Nota ---");
						System.out.printf("Insira o CPF do aluno para encontrarmos: ");
						cpf = lerDados.nextLong();

						turma.auxiListarNotas(cpf);

						System.out.printf("Insira o indice da nota a ser retirada: ");
						int indice = lerDados.nextInt();

						turma.auxiRemoverNotas(cpf, indice);
						break;

					case 3:
						System.out.println("--- Lista de Notas ---");
						System.out.printf("Insira o CPF do aluno para encontrarmos: ");
						cpf = lerDados.nextLong();

						turma.auxiListarNotas(cpf);
						break;

					case 4:
						System.out.println("--- Calcular Media ---");
						System.out.printf("Insira o CPF do aluno para encontrarmos: ");
						cpf = lerDados.nextLong();

						turma.auxiCalcMedia(cpf);
						break;

					case 5:
						System.out.println("Voltando...");
						break;
					}

				} while (menuNotas != 5);
				
			}
		}
	}
}
