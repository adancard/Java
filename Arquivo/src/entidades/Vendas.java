package entidades;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Vendas {

	// definindo variaveis
	private int numeroV;
	private String NomeV;
	private int quantidade;
	private double preco;
	public Formasdepagamentos formasdepagamento;

	// construtor do enum
	public enum Formasdepagamentos {

		DINHEIRO("Dinheiro"), PIX("Pix"), CREDITO("Credito"), DEBITO("debito");

		private String nome;

		private Formasdepagamentos(String nome) {

			this.nome = nome;

		}

		public String getNome() {
			return nome;
		}

	}

	// contrutor
	public Vendas(int NumeroV, String NomeV, int quantidade, double preco, Formasdepagamentos formadepamento) {

		this.numeroV = numeroV;
		this.NomeV = NomeV;
		this.quantidade = quantidade;
		this.preco = preco;
		this.formasdepagamento = formadepamento;

	}

	/**
	 * 
	 * Metodo para poder criar um arquivo chamado "vendas" e escrever nele as
	 * informaçoes que sao necessarias
	 * 
	 */

	public void gravararquivo() {

		try {
			FileWriter fileWriter = new FileWriter("vendas.csv", true);
			fileWriter.write("\n"+"Numero da venda: " + numeroV + ", \n" + "Nome do produto: " + NomeV + ", \n" + "Quantidade: "
					+ quantidade + ", \n" + "Preco: " + preco + ", \n" + formasdepagamento + ", \n");
			fileWriter.close();
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo nao encontrado: " + e.getMessage());
		} catch (IOException e) {
			System.out.println("Excecao: " + e.getMessage());
		}
	}

	// gets and sets

	public int getNumeroV() {
		return numeroV;
	}

	public void setNumeroV(int numeroV) {
		this.numeroV = numeroV;
	}

	public String getNomeV() {
		return NomeV;
	}

	public void setNomeV(String nomeV) {
		NomeV = nomeV;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

}
