package principal;

import java.util.Scanner;

import entidade.Livraria;

public class Livraria1 {

	public static void main(String[] args) {
		Livraria livro = new Livraria();
		Scanner entrada = new Scanner(System.in);
		String nome;
		int n;

		while (true) {

			System.out.println("1.Adicionar");
			System.out.println("2.Mostrar");
			System.out.println("3.remover");
			System.out.println("4.Sair");
			n = entrada.nextInt();

			if (n == 4) {

				break;

			}

			else {

				switch (n) {

				case 1:

					System.out.println("Nome do livro");
					nome = entrada.next();
					livro.setNome(nome);
					livro.getname();

					System.out.println("Autor do livro");
					nome = entrada.next();
					livro.setAutor(nome);
					livro.getautor();

					System.out.println("codigo do livro");
					n = entrada.nextInt();
					livro.setCodigo(n);
					livro.getcodigos();

					System.out.println("Estoque do livro");
					n = entrada.nextInt();
					livro.setEstoque(n);
					livro.getestoque();

					break;

				case 2:

					livro.mostrar();

				case 3:

					livro.Remover();

					break;

				}

			}

		}

		entrada.close();

	}

}
