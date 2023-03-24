package obj_direto_exe;

public class cone {

	private double raio;
	private double geratriz;
	private double alt;

	// metodo
	public double getarea() {

		double pi = Math.PI;

		return (pi * raio * (raio + geratriz));

	}

	public double getperi() {

		double pi = Math.PI;

		return (((pi * raio * (raio + geratriz))*alt)/3);

	}

	// get e set

	public double getAlt() {
		return alt;
	}

	public void setAlt(double alt) {
		this.alt = alt;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	public double getGeratriz() {
		return geratriz;
	}

	public void setGeratriz(double geratriz) {
		this.geratriz = geratriz;
	}

}
