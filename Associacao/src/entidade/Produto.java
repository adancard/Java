package entidade;

public class Produto {

	private String nome;
	private int quanti;
	private float preco;
	private String pedido;

	public Produto(String nome, int quanti, float preco,String pedido) {

		this.nome = nome;
		this.quanti = quanti;
		this.preco = preco;
		this.pedido=pedido;

	}
	
	public String exibir() {
		
		return "Nome: "+nome+"\nQuantidade: "+quanti+" Preco: "+preco+"\nInformacao pedido: "+ pedido.toString();
		
	}
	

	public String getNome() {
		return nome;
	}

	public int getQuanti() {
		return quanti;
	}

	public float getPreco() {
		return preco;
	}

}
