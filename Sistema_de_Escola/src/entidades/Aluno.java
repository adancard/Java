package entidades;

public class Aluno {

	//Declando variaveis
	private String nome;
	private int id;

	/**
	 * 
	 * Metodo para mostrar as informaçoes coletadas da classe principal
	 * 
	 */
	
	public void mostrar() {

		System.out.println("ID :" + this.id);
		System.out.println("Nome: " + this.nome);

	}

	//gets and sets
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
