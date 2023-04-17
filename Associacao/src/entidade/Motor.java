package entidade;

public class Motor {
	
	private float combustivel;
	private int potencia;
	
	public Motor(float combustivel,int potencia) {
		
		this.combustivel=combustivel;
		this.potencia=potencia;
		
	}
	
	@Override
	public String toString() {
		
		return "Quantidade de combustivel: "+ combustivel + " Potencia do motor " + potencia;
		
	}
	

}
