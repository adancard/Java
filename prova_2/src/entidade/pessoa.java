package entidade;

public abstract class pessoa {
	
	protected String nome;
	protected int cpf;
	
	public pessoa (String nome, int cpf) {
		
		this.nome=nome;
		this.cpf=cpf;
		
	}
	
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

	public abstract void tostring();


}
