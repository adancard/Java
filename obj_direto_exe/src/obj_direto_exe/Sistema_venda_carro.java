package obj_direto_exe;



public class Sistema_venda_carro {
	
	private int numero;
	private String nome;
	private String Carro;
	private int preco;
	private int parcelas;
	
	int[] parcelas1 = new int[1];
	
	public void getparcela() {
		

		for(int i = 0; i<parcelas1.length;i++) {
			
			parcelas1[i]=preco/parcelas;
			System.out.println("Preco de cada parcela: ");
			System.out.println(parcelas1[i]);

		}
		
	}
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public String setNome(String nome) {
		this.nome = nome;
		return nome;
	}

	public String getCarro() {
		return Carro;
	}

	public void setCarro(String carro) {
		Carro = carro;
	}

	public int getPreco() {
		return preco;
	}

	public void setPreco(int preco) {
		this.preco = preco;
	}

	public int getParcelas() {
		return parcelas;
	}

	public void setParcelas(int parcelas) {
		this.parcelas = parcelas;
	}
	

}
