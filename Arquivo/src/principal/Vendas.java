package principal;

//bibliotecas importadas
import java.util.InputMismatchException;
import java.util.Scanner;
import entidades.Produto;
import entidades.Produtos;

public class Vendas {

	public static void main(String[] args) {
		// variaveis declaradas
		Produto prod = new Produto();
		Produtos prods = new Produtos();
		Scanner entrada = new Scanner(System.in);
		int n = -1, opcao = -1;
		String nome;
		double preco;

		/**
		 * lado enquanto que serve para prender o usuario para ele conseguir fazer
		 * varias tarefas ate digitar o numero para sair
		 */
		while (opcao != 6) {

			/**
			 * 
			 * painel do menu principal e com tratamento de erro que so pode digitar numero
			 * 
			 */
			try {
				System.out.println();
				System.out.println("--- MENU PRINCIPAL ---");
				System.out.println("1 - Adicionar Produto");
				System.out.println("2 - Listar Produto");
				System.out.println("3 - Editar Produto");
				System.out.println("4 - Remover Produto");
				System.out.println("5 - Gravar em um arquivo");
				System.out.println("6 - Sair");
				opcao = entrada.nextInt();
			} catch (InputMismatchException e) {

				entrada.nextLine();
				System.out.println("colocar numero" + e.getMessage());

			}

			switch (opcao) {

			/**
			 * 
			 * opcao 1 que deixar add um produto tem que informa o codigo dele o nome e o
			 * preco
			 * 
			 */

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

			/**
			 * 
			 * opcao 2 que serve para listar os produtos e se a lista estiver vazia ele nao
			 * ira mostrar que existe nada na lista
			 * 
			 */

			case 2:

				prods.Listar();

				break;

			/**
			 * 
			 * opcao 3 para editar um produto listado usando o codigo dele
			 * 
			 */
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

			/**
			 * 
			 * opcao 4 remover produto usando o codigo dele
			 * 
			 */

			case 4:

				System.out.println();
				System.out.println("--- REMOVER PRODUTO ---");
				System.out.println("Informe o codigo: ");
				n = entrada.nextInt();
				prod.setCodigo(n);

				prods.remover(n);

				break;

			/**
			 * 
			 * opcao 5 para gravar toda a lista em um arquivo de exel
			 * 
			 */

			case 5:

				prods.gravararquivo();

			}

		}

	}

}
