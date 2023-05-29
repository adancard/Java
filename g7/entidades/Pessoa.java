package entidades;

public abstract class Pessoa {
	protected String nome;
	protected long cpf;

	// Construtores
	public Pessoa(String nome, long cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}

	// Metodos
	public abstract void exibirInformacoes();

	/**
	 * gets e sets
	 */
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}
}
