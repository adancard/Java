package entidade;

public abstract class pessoa {
	
	//criando variaveis para todos
	protected String nome;
	protected int cpf;
	
	//construtor
	public pessoa (String nome, int cpf) {
		
		this.nome=nome;
		this.cpf=cpf;
		
	}
	
	//gets e sets
	public String getNome() {
		return nome;
	}

	public int getCpf() {
		return cpf;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	//metodo para mostrar
	public abstract void tostring();


}
