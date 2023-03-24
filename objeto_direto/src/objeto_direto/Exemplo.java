package objeto_direto;

public class Exemplo {

	private int dia;
	private int mes;
	private int ano;

	public Exemplo(int dia, int mes) {

		this.dia = dia;

		this.mes = mes;

		this.ano = 2023;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

}
