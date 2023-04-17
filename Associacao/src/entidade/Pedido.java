package entidade;

public class Pedido {

	private int dia;
	private int mes;
	private int ano;
	private float preco;

	public Pedido(int dia, int mes, int ano, float preco) {

		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		this.preco = preco;

	}

	@Override

	public String toString() {

		return "\ndia: " + dia + " mes: " + mes + " ano: " + ano + " preco: " + preco;

	}

	public int getDia() {
		return dia;
	}

	public int getMes() {
		return mes;
	}

	public int getAno() {
		return ano;
	}

	public float getPreco() {
		return preco;
	}


}
