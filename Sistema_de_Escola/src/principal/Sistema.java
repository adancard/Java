package principal;

import java.util.Scanner;
import entidades.Diretor;
import entidades.Cadastro;
import entidades.Professor;
import entidades.Aluno;

public class Sistema {

	public static void main(String[] args) {

		Cadastro cas = new Cadastro();
		Professor pro = new Professor();
		Diretor di = new Diretor();
		Aluno al = new Aluno();
		Scanner entrada = new Scanner(System.in);
		String nome;
		int senha, id, escolha;
		double nota;

		System.out.println("Digite o nome de usuario: ");
		nome = entrada.next();

		System.out.println("Digite a senha : ");
		senha = entrada.nextInt();

		cas.entrar(senha);

		while (senha == 1) {

			System.out.println("----Menu de entrada----");
			System.out.println("1. Professor");
			System.out.println("2. Aluno");
			System.out.println("3. Diretor");
			System.out.println("4. Sair");
			System.out.println("Digite sua Opcao: ");
			escolha = entrada.nextInt();

			if (escolha == 4) {

				System.out.println("Saindo...");
				break;

			}

			switch (escolha) {

			case 1:

				System.out.println("----Menu de Materia----");
				System.out.println("1. FPOO");
				System.out.println("2. LM");
				System.out.println("3. HR");
				System.out.println("4. SO");
				System.out.println("5. Voltar");
				System.out.println("Digite sua Opcao: ");
				escolha = entrada.nextInt();

				switch (escolha) {

				case 1:

					System.out.println("Digite sua senha: ");
					senha = entrada.nextInt();

					pro.Senhafpoo(senha);

					if (senha == 1) {

						System.out.println("----Menu da Materia FPOO----");
						System.out.println("1. Adicionar aluno");
						System.out.println("2. Adionar nota");
						System.out.println("3. Voltar");
						System.out.println("Digite sua Opcao: ");
						escolha = entrada.nextInt();

						switch (escolha) {

						case 1:

							System.out.println("ID do aluno: ");
							id = entrada.nextInt();
							al.setId(id);

							System.out.println("Nome do aluno: ");
							nome = entrada.next();
							al.setNome(nome);

							pro.addaluno(al);

							break;

						case 2:

							System.out.println("ID do aluno: ");
							id = entrada.nextInt();
							al.setId(id);

							System.out.println("Digite a nota: ");
							nota = entrada.nextDouble();

							System.out.println("Digite a nota: ");
							nota = entrada.nextDouble();

							pro.notasfpoo(nota, id);

							break;

						case 3:

							break;

						default:

							System.out.println("Escolha invalida");

						}

					}
					break;

				case 2:

					System.out.println("Digite sua senha: ");
					senha = entrada.nextInt();

					pro.Senhalm(senha);

					if (senha == 3) {

						System.out.println("----Menu da Materia LM----");
						System.out.println("1. Adionar nota");
						System.out.println("2. Voltar");
						System.out.println("Digite sua Opcao: ");
						escolha = entrada.nextInt();

						switch (escolha) {

						case 1:

							System.out.println("ID do aluno: ");
							id = entrada.nextInt();
							al.setId(id);

							System.out.println("Digite a nota: ");
							nota = entrada.nextDouble();

							System.out.println("Digite a nota: ");
							nota = entrada.nextDouble();

							pro.notaslm(nota, id);

							break;

						case 2:

							break;

						default:

							System.out.println("Escolha invalida");

						}

					}
					break;

				case 3:

					System.out.println("Digite sua senha: ");
					senha = entrada.nextInt();

					pro.Senhalm(senha);

					if (senha == 3) {

						System.out.println("----Menu da Materia HR----");
						System.out.println("1. Adionar nota");
						System.out.println("2. Voltar");
						System.out.println("Digite sua Opcao: ");
						escolha = entrada.nextInt();

						switch (escolha) {

						case 1:

							System.out.println("ID do aluno: ");
							id = entrada.nextInt();
							al.setId(id);

							System.out.println("Digite a nota: ");
							nota = entrada.nextDouble();

							System.out.println("Digite a nota: ");
							nota = entrada.nextDouble();

							pro.notashr(nota, id);

							break;

						case 2:

							break;

						default:

							System.out.println("Escolha invalida");

						}

					}

					break;

				case 4:

					System.out.println("Digite sua senha: ");
					senha = entrada.nextInt();

					pro.Senhalm(senha);

					if (senha == 3) {

						System.out.println("----Menu da Materia SO----");
						System.out.println("1. Adionar nota");
						System.out.println("2. Voltar");
						System.out.println("Digite sua Opcao: ");
						escolha = entrada.nextInt();

						switch (escolha) {

						case 1:

							System.out.println("ID do aluno: ");
							id = entrada.nextInt();
							al.setId(id);

							System.out.println("Digite a nota: ");
							nota = entrada.nextDouble();

							System.out.println("Digite a nota: ");
							nota = entrada.nextDouble();

							pro.notasso(nota, id);

							break;

						case 2:

							break;

						default:

							System.out.println("Escolha invalida");

						}

					}

					break;

				}

				break;

			case 2:

				System.out.println("----Menu do aluno----");
				System.out.println("1. Listar media de FPOO");
				System.out.println("2. Listar media de LM");
				System.out.println("3. Listar media de HR");
				System.out.println("4. Listar media de SO");
				System.out.println("5. Voltar");
				System.out.println("Digite sua Opcao: ");
				escolha = entrada.nextInt();

				switch (escolha) {

				case 1:

					System.out.println("Informe seu ID: ");
					id = entrada.nextInt();

					pro.listarfpoo(id);
					break;

				case 2:

					System.out.println("Informe seu ID: ");
					id = entrada.nextInt();

					pro.listarlm(id);
					break;

				case 3:

					System.out.println("Informe seu ID: ");
					id = entrada.nextInt();

					pro.listarhr(id);
					break;

				case 4:

					System.out.println("Informe seu ID: ");
					id = entrada.nextInt();

					pro.listarso(id);
					break;

				case 5:

					break;

				default:

					System.out.println("Escolha invalida");

				}

				break;

			case 3:

				di.AddArquivo();

				break;

			}

		}

		entrada.close();

	}

}
