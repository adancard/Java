package pacote;

public class Vendedor {
	
	private float salario;
	private int vendas;
	
	
	public void salarioV(){
		
		vendas=(int) (vendas/0.05);
		
		salario=salario+vendas;
		
		System.out.println(salario);

	}


	public float getSalario() {
		return salario;
	}


	public void setSalario(float salario) {
		this.salario = salario;
	}


	public int getVendas() {
		return vendas;
	}


	public void setVendas(int vendas) {
		this.vendas = vendas;
	}

}
