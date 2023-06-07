package entidades;

public class Produto {
	
	//declarando variaveis
	private String nome;
	private int codigo;
	private double preco;
	
	//metodo para mostar o codigo,nome e preco dos produto registrado
	public void Mostar() {
		
		System.out.println("Codigo: "+getCodigo());
		System.out.println("Nome: "+getNome());
		System.out.println("Preco: "+getPreco());
		
	}
	
	
	
	//gets and sets
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	


}
