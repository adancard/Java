package obj_direto_exe;

public class Calc_cir {

	private double raio;

	public double getareacir() {

		double pi = Math.PI;
		double resto = Math.pow(raio, 2);

		return (4*pi * resto);

	}
	
	public double getpericir() {
		
		double resto = Math.pow(raio, 3);
		double pi = Math.PI;
		return(4/3*pi*resto);
		
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

}
