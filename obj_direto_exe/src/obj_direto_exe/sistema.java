package obj_direto_exe;

public class sistema {

	String nomeItem;
	double Preco;
	int quanti;
	double discon;

	// metodo

	public double gettotal() {

		return (Preco * quanti);
	}

	public double gettotaldis() {
		
		
		

		return (gettotal() * (discon/100));

	}

	public String getnome() {
		
		return (nomeItem);
	}
	
	public String getnome1(){
		
		return (nomeItem);
		
	}

	// get e set
	public String getNomeItem() {
		return nomeItem;
	}

	public void setNomeItem(String nomeItem) {
		this.nomeItem = nomeItem;
	}

	public double getPreco() {
		return Preco;
	}

	public void setPreco(double preco) {
		Preco = preco;
	}

	public int getQuanti() {
		return quanti;
	}

	public void setQuanti(int quanti) {
		this.quanti = quanti;
	}

	public double getDiscon() {
		return discon;
	}

	public void setDiscon(double discon) {
		this.discon = discon;
	}

}
