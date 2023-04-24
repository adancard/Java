package entidades;

public abstract class Estoque {

	private String nome;
	private float preco;
	private float imposto;

	public Estoque(String nome, float preco, float imposto) {

		this.preco = preco;
		this.nome = nome;
		this.imposto = imposto;

	}

	public String getNome() {
		return nome;
	}

	public float getPreco() {
		return preco;
	}

	public float getImposto() {
		return imposto;
	}
	
	public  String tostring() {
		
		return "nome: "+nome+'\n';
		
	}

	public abstract float calcularpreco();

}
