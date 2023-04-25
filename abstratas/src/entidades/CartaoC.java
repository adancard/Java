package entidades;

public final class CartaoC extends Pagamento {

	private int limite;
	private int dia;
	private int mes;
	private int ano;
	private int numP;
	private float preco;
	
	public CartaoC (float preco,int limite,int dia, int mes, int ano, int numP,String nome,float conta,int ID) {
		
		super(nome,ID,conta);
		this.limite=limite;
		this.dia=dia;
		this.mes=mes;
		this.ano=ano;
		this.numP=numP;
		this.preco=preco;
		
	}
	
	public void metodopagamento() {
		float conta,parcelas;
		
		if(preco<=limite) {
			
			System.out.println("Valor da conta: "+getConta());
			
			System.out.println("Preco: "+preco);
			
			parcelas=preco/numP;
			System.out.println("Numeros de Parcelas: "+parcelas);
			
			conta=getConta()-preco;
			System.out.println("Saldo atual: "+conta);
			
		}
		else {
			
		 System.out.println("Passou do limite!");
			
		}
		
		
	}
	
	
	
}
