package obj_direto_exe;

public class piramideq {

	private float lado;
	private float alt;

	//metodo
	public float getArea() {

		return (lado * lado);

	}
	
	public float getVolume() {
		
		return((lado*lado)*alt/3);
		
	}

	// get e set
	public float getLado() {
		return lado;
	}

	public void setLado(float lado) {
		this.lado = lado;
	}

	public float getAlt() {
		return alt;
	}

	public void setAlt(float alt) {
		this.alt = alt;
	}

}
