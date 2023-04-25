package entidades;

public abstract class Pagamento {

	private String nome;
	private int ID;
	private float conta;

	public Pagamento(String nome, int ID, float conta) {

		this.nome = nome;
		this.ID = ID;
		this.conta = conta;

	}
	
	public abstract void metodopagamento();

	public String getNome() {
		return nome;
	}

	public int getID() {
		return ID;
	}

	public float getConta() {
		return conta;
	}

}
