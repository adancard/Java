package entidades;

public final class Livro2 extends Produto {
	
	private String tema;
	private String nomeA;
	private String editora;
	
	public Livro2(String tema,String nomeA,String editora,String Nomep,float preco,int quanti) {
		
		super(Nomep,preco,quanti);
		this.tema=tema;
		this.nomeA=nomeA;
		this.editora=editora;
		
	}
	
	public float pagamento() {
		
		return ((getPreco()*getQuanti())+10);
		
	}
	
	public void informacao() {
		
		System.out.println("Nome do Produto: "+getNomep());
		System.out.println("Tema: "+tema);
		System.out.println("Nome do Autor: "+nomeA);
		System.out.println("Editora: "+editora);
		System.out.println("Preco: R$"+getPreco()+"R$+10");
		System.out.println("Preco"+pagamento());
		
	}

}
