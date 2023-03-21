package obj_direto_exe;

public class Calc {

	private int lado;

	public int getarea() {
		return (lado * lado);
	}
	
	public int getperi() {
		return (4*lado);
	}

	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}

}
