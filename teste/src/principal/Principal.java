package principal;

import entidade.Professor;
import java.util.Scanner;
import entidade.Aluno;
import entidade.Turma;

public class Principal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String nome;// pega o nome
		double a;// setar notas
		int n;// escolha
		Professor prof = new Professor("Eduardo", 294903491, "Programacao", "manha", Professor.diciplina.FPOO);// professor nao mudar
		Aluno al = new Aluno("298104", "Adan", 1241, Aluno.diciplina.FPOO);// variaveis necessarias so add notas.
		Turma tur = new Turma();

		//looping para fazer as perguntas
		while (true) {

			System.out.println("1.Turma");
			System.out.println("2.Professor");
			System.out.println("3.Aluno");
			System.out.println("4.Sair");
			n = entrada.nextInt();

			if (n == 4) {

				System.out.println("Saindo...");
				break;

			}

			else {

				switch (n) {
				
				//adicionar alunos na turma
				case 1:

					while (true) {

						System.out.println("1.Adicionar Aluno");
						System.out.println("2.Remover Aluno");
						System.out.println("3.listar Aluno");
						System.out.println("4.Editar Informacao");
						System.out.println("5.Voltar");
						System.out.println(" ");
						n = entrada.nextInt();

						if (n == 5) {

							System.out.println("Voltando");
							break;

						}

						else {

							switch (n) {

							case 1:

								System.out.println("Nome: ");
								nome = entrada.next();
								tur.addalunos(nome);

								break;

							case 2:

								System.out.println("Nome para remover: ");
								nome = entrada.next();
								tur.removealunos(nome);

								break;

							case 3:

								System.out.println("Lista de alunos: ");
								tur.mostrarAlunos();

								break;

							case 4:

								System.out.println("Informe posicao: ");
								n = entrada.nextInt();
								System.out.println("Informe nome: ");
								nome = entrada.next();
								tur.alterarNome(n, nome);

								break;

							}

						}

					}

					break;
				
				//mostrar professor
				case 2:

					prof.tostring();
					break;

				//adicionar nota 
				case 3:

					while (true) {

						System.out.println("1.Adicionar Nota");
						System.out.println("2.Remover Nota");
						System.out.println("3.Alterar Nota");
						System.out.println("4.listar Nota");
						System.out.println("5.Calcular Media");
						System.out.println("6.Voltar");
						n = entrada.nextInt();

						if (n == 6) {

							break;

						} else {

							switch (n) {

							case 1:

								System.out.println("Informe a primeira nota : ");
								a = entrada.nextDouble();
								al.setNota(a);
								al.addnotas();

								break;

							case 2:
								System.out.println("Informe a posicao: ");
								n= entrada.nextInt();
								al.removerNota(n);

								break;

							case 4:

								al.listarnota();

								break;

							case 5:

								al.listarmedia();
								break;

							}

						}

					}

				}

			}

		}
		entrada.close();
	}
}
