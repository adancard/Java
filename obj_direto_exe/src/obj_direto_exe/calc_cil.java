package obj_direto_exe;

public class calc_cil {

	private double raio;
	private double alt;

	// metodo
	public double getareacil() {

		double pi = Math.PI;

		return (2 * pi * raio * alt);

	}

	public double getpericil() {

		double pi = Math.PI;
		double resto = Math.pow(raio, 2);
		return (pi * resto * alt);

	}

	// get e set
	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	public double getAlt() {
		return alt;
	}

	public void setAlt(double alt) {
		this.alt = alt;
	}

}
