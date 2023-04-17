package entidade;

public class Automovel {

	private String marca;
	private float quilometro;
	private String motor;
	private String pneu;

	public Automovel(String marca, float quilomestros, String motor, String pneu) {

		this.marca = marca;
		this.motor = motor;
		this.pneu = pneu;
		this.quilometro = quilomestros;
	}

	public String exibir() {

		return "Marca do carro " + marca + " Quilometros rodados: " + quilometro + "\nEspecificacao motor: \n"
				+ motor.toString() + "\nInformacao pneu: \n" + pneu.toString();

	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public float getQuilometro() {
		return quilometro;
	}

	public void setQuilometro(float quilometro) {
		this.quilometro = quilometro;
	}

	public String getMotor() {
		return motor;
	}

	public void setMotor(String motor) {
		this.motor = motor;
	}

	public String getPneu() {
		return pneu;
	}

	public void setPneu(String pneu) {
		this.pneu = pneu;
	}

}
