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

	public abstract void tostring();


}
