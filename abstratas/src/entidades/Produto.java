package entidades;

public abstract class Produto {
	
	private String Nomep;
	private float preco;
	private int quanti;
	
	
	public Produto (String Nomep,float preco,int quanti) {
		
		this.Nomep=Nomep;
		this.preco=preco;
		this.quanti=quanti;
		
	}
	
	
	public abstract void informacao();
	
	public abstract float pagamento();
	
	


	public String getNomep() {
		return Nomep;
	}


	public float getPreco() {
		return preco;
	}


	public int getQuanti() {
		return quanti;
	}

}
