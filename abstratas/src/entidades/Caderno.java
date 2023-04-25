package entidades;

public final class Caderno extends Produto {
	
	private int ID;
	private int numero;
	private String fabri;
	
	public Caderno(int ID,int numero,String fabri,String Nomep,float preco,int quanti) {
		
		super(Nomep,preco,quanti);
		this.ID=ID;
		this.numero=numero;
		this.fabri=fabri;
		
	}
	
	public float pagamento() {
		
		return (float) ((getPreco()*getQuanti())+0.11);
		
	}
	
	
	public void informacao() {
		
		System.out.println("Nome :"+getNomep());
		System.out.println("Preco: R$"+getPreco());
		System.out.println("Imposto:11%");
		System.out.println("Quantidade :"+getQuanti());
		System.out.println("Identificacao: "+ID);
		System.out.println("Numero de Paginas: "+numero);
		System.out.println("Nome do Fabricante: "+fabri);
		System.out.println("Total a pagar: "+pagamento());
		
	}

}
