package entidades;

public abstract class Funcion�rio {

	protected String nome;
	protected String matricula;
	protected float salario;

	public Funcion�rio(String nome, String matricula, float salario) {

		this.matricula = matricula;
		this.nome = nome;
		this.salario = salario;

	}
	
	
	public abstract float calculasalario();
	
	

	public String getNome() {
		return nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public float getSalario() {
		return salario;
	}

}
