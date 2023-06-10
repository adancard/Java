package entidades;

public class Aluno {

	/**
	 * 
	 * Declarando Variaveis
	 * 
	 */
	
	private int idade;
	private int matricula;
	private String nome;

	/**
	 * 
	 * metodo para mostrar os alunos
	 * 
	 */
	
	public void Mostrar() {

		System.out.println("Nome: " + getNome());
		System.out.println("Matricula: " + getMatricula());
		System.out.println("Idade: " + getIdade());

	}

	// gets and sets

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
