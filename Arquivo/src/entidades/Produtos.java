package entidades;

//bibliotecas importadas
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Produtos {

	// iniciando a lista de produtos
	protected ArrayList<Produto> produtos;

	// construtor
	public Produtos() {

		this.produtos = new ArrayList();

	}

	// metodo para adicionar os produtos
	public void add(Produto produto) {

		produtos.add(produto);

		System.out.println("Adicionado com sucesso");

	}

	/**
	 * 
	 * metodo para listar os produtos se a lista estiver vazia ele ira mostrar que
	 * esta vazia se nao ira mostrar o conteudo da lista
	 * 
	 */
	
	public void Listar() {

		if (produtos.isEmpty()) {

			System.out.println("Lista Vazia");

		}

		else {

			System.out.println("___________");
			for (Produto a : produtos) {

				a.Mostar();

				System.out.println("___________");
				System.out.println("\n");

			}

		}

	}

	/**
	 * 
	 * remove o produto dependo do codigo que foi colocado a ele
	 * 
	 * @param codigo
	 */
	
	public void remover(int codigo) {

		if (produtos.isEmpty()) {

			System.out.println("Lista Vazia");

		}

		else {

			for (Produto a : this.produtos) {

				if (a.getCodigo() == codigo) {

					this.produtos.remove(a);

					System.out.println("Produto Removido com Sucesso");
					return;
				}

				System.out.println("Produto nao encontrado");

			}

		}

	}

	
	/**
	 * 
	 * edita um produto existente dependendo do codigo que foi dado 
	 * 
	 * @param codigo
	 * @param nome
	 * @param preco
	 */
	public void Editar(int codigo, String nome, double preco) {

		if (produtos.isEmpty()) {

			System.out.println("Nao a Produtos listados");

		} else {

			for (Produto a : this.produtos) {

				if (a.getCodigo() == codigo) {

					a.setCodigo(codigo);
					a.setNome(nome);
					a.setPreco(preco);

					System.out.println("Informacoes alteradas com sucesso");
					return;

				}

				System.out.println("Produto nao encontrado");

			}

		}

	}

	
	/**
	 * 
	 * grava a lista em um arquivo de excel
	 * 
	 */
	public void gravararquivo() {

		if (produtos.isEmpty()) {

			System.out.println("Lista Vazia");

		} else {

			try {
				FileWriter fileWriter = new FileWriter("Estoque.csv", true);
				for (Produto a : this.produtos) {

					fileWriter.write("Codigo: " + a.getCodigo() + "\n" + "Nome: " + a.getNome() + "\n" + "Preco: "
							+ a.getPreco() + "\n");
					fileWriter.close();
				}

				System.out.println("Arquivo salvo com sucesso");

			} catch (FileNotFoundException e) {
				System.out.println("Arquivo nao encontrado: " + e.getMessage());
			} catch (IOException e) {
				System.out.println("Excecao: " + e.getMessage());
			}
		}
	}

}
