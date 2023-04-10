package pacote;

public class Adm extends Vendedor {

	private float salario;
	private float horas;
	
	
	public void salarioA() {
		
		horas=horas/100;
		
		salario=salario+horas;
		
		System.out.println(salario);
		
		
	}
	

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public float getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

}
