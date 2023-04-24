package entidades;

public final class Eletronicos extends Estoque {
	
	private int id;
	
	public Eletronicos(float preco,float imposto,String nome,int id) {
		
		super(nome,imposto,preco);
		this.id=id;
		
	}
	
	@Override
	public float calcularpreco() {
		
		return (float) (getPreco() + getImposto() + 0.08);
		
	}
	
	@Override
	public String tostring() {
		
		return "ID: "+id+'\n'+"Preco: "+getPreco()+'\n'+"Imposto: "+getImposto()+'\n'+super.tostring();
		
	}
	
	
	
	

}
