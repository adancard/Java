package principal;

/**
 * 
 * Importando bibliotecas de erro e classes criadas
 * 
 */

import entidades.Turma;
import java.util.InputMismatchException;
import java.util.Scanner;
import entidades.Aluno;

public class Secretaria {

	public static void main(String[] args) {

		// Declarando variaveis das bibliotecas
		Scanner entrada = new Scanner(System.in);
		Aluno a = new Aluno();
		Turma tur = new Turma();

		// Criando variaveis
		int opcao, matricula, idade;
		String nome;

		// Looping eterno ate o usuaria digitar 6
		while (true) {

			/**
			 * 
			 * Menu para mostrar o que o usuario pode faze e se o usuario digitar alguma
			 * letra ele ira levar ele para um erro personalizado
			 * 
			 */

			try {
				System.out.println("-------MENU-----");
				System.out.println("1. Adicionar aluno");
				System.out.println("2. Editar aluno");
				System.out.println("3. Remover aluno");
				System.out.println("4. Gravar em um arquivo");
				System.out.println("5. Listar alunos");
				System.out.println("6. Sair");
				opcao = entrada.nextInt();

			} catch (InputMismatchException e) {

				entrada.nextLine();
				System.out.println("Digite apenas numeros");
				break;

			}

			// Se o usuario digitar 6 ele ira terminar
			if (opcao == 6) {

				System.out.println("Saindo...");
				break;

			} else {

				switch (opcao) {

				/**
				 * 
				 * Ira adiocionar os dados do aluno
				 * 
				 */

				case 1:

					try {
						
						System.out.println("----ADICIONAR ALUNO----");
						System.out.println("Numero da matricula: ");
						matricula = entrada.nextInt();
						a.setMatricula(matricula);
						System.out.println("Nome do Aluno: ");
						nome = entrada.next();
						a.setNome(nome);
						System.out.println("Idade do aluno: ");
						idade = entrada.nextInt();
						a.setIdade(idade);

						tur.addAluno(a);
					} catch (InputMismatchException e) {

						entrada.nextLine();
						System.out.println("Digite apenas numeros");
						break;

					}

					break;

				/**
				 * 
				 * Ira editar os dados do aluno
				 * 
				 */

				case 2:

					try {
						
						System.out.println("----EDITAR ALUNO----");
						System.out.println("Numero da matricula: ");
						matricula = entrada.nextInt();
						a.setMatricula(matricula);
						System.out.println("Nome do Aluno: ");
						nome = entrada.next();
						a.setNome(nome);
						System.out.println("Idade do aluno: ");
						idade = entrada.nextInt();
						a.setIdade(idade);

						tur.Editaraluno(nome, matricula, idade);
					} catch (InputMismatchException e) {

						entrada.nextLine();
						System.out.println("Digite apenas numeros");
						break;

					}

					break;

				/**
				 * 
				 * Ira remover os dados do aluno
				 * 
				 */

				case 3:

					try {
						
						System.out.println("----REMOVER ALUNO----");
						System.out.println("Numero da matricula: ");
						matricula = entrada.nextInt();
						a.setMatricula(matricula);

						tur.remover(matricula);
					} catch (InputMismatchException e) {

						entrada.nextLine();
						System.out.println("Digite apenas numeros");
						break;

					}

					break;

				/**
				 * 
				 * Ira pegar as informaçoes dos alunos e ira escrever uma planilha
				 * 
				 */

				case 4:

					tur.AddArquivo();

					break;

				/**
				 * 
				 * Ira listar todos os alunos
				 * 
				 */

				case 5:

					tur.listar();

					break;

				/**
				 * 
				 * Se o usuario digitar um numero fora de 0 e 6 ele ira mostrar que a opçao
				 * esta invalida
				 * 
				 */

				default:

					System.out.println("Opcao invalida");
					break;

				}

			}
			entrada.close();

		}

	}

}
