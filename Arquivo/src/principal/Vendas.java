package principal;

import java.util.Scanner;
import entidades.Produto;
import entidades.Produtos;

public class Vendas {

	public static void main(String[] args) {
		Produto prod = new Produto();
		Produtos prods = new Produtos();
		Scanner entrada = new Scanner(System.in);
		int n = -1, opcao = -1;
		String nome;
		double preco;

		while (opcao != 6) {

			System.out.println();
			System.out.println("--- MENU PRINCIPAL ---");
			System.out.println("1 - Adicionar Produto");
			System.out.println("2 - Listar Produto");
			System.out.println("3 - Editar Produto");
			System.out.println("4 - Remover Produto");
			System.out.println("5 - Gravar em um arquivo");
			System.out.println("6 - Sair");
			opcao = entrada.nextInt();

			switch (opcao) {

			case 1:

				System.out.println();
				System.out.println("--- ADICIONAR PRODUTO ---");
				System.out.println("Codigo do produto");
				n = entrada.nextInt();
				prod.setCodigo(n);
				System.out.println("Nome do produto");
				nome = entrada.next();
				prod.setNome(nome);
				System.out.println("Preco do produto");
				preco = entrada.nextDouble();
				prod.setPreco(preco);

				prods.add(prod);

				break;

			case 2:

				prods.Listar();

				break;

			case 3:

				System.out.println();
				System.out.println("--- EDITAR PRODUTO ---");
				System.out.println("Informe o codigo: ");
				n = entrada.nextInt();
				prod.setCodigo(n);
				System.out.println("Informe o nome do produto");
				nome = entrada.next();
				prod.setNome(nome);
				System.out.println("Informe o preco do produto");
				preco = entrada.nextDouble();
				prod.setPreco(preco);

				prods.Editar(n, nome, preco);

				break;

			case 4:

				System.out.println();
				System.out.println("--- REMOVER PRODUTO ---");
				System.out.println("Informe o codigo: ");
				n = entrada.nextInt();
				prod.setCodigo(n);

				prods.remover(n);

				break;

			case 5:

				prods.gravararquivo();

			case 6:

				System.out.println("Saindo...");

			}

		}

		entrada.close();

	}

}
