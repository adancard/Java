package entidade;

public class Pneu {
	
	private String Marca;
	private float pressao;
	
	public Pneu(String Marca,float pressao) {
		
		this.Marca=Marca;
		this.pressao=pressao;
		
	}
	
	@Override
	public String toString() {
	
		return "Marca: "+ Marca + " Pressao atual: " + pressao;
		
	}
	

	public String getMarca() {
		return Marca;
	}

	public void setMarca(String marca) {
		Marca = marca;
	}

	public double getPressao() {
		return pressao;
	}

	public void setPressao(float pressao) {
		this.pressao = pressao;
	}

}
