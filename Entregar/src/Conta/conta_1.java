package Conta;

public class conta_1 {

	private double saldo;
	private int limite;
	private int codigo;

	public conta_1(double saldo, int limite, int codigo) {
	}

	public void sacar(double valor) throws ContaExcecao {

		if (valor > limite) {

			throw new ContaExcecao(
					"valor maior que o limite\n" + "Limite: " + limite + "\n" + "Valor a sacar: " + valor + "\n");

		} else {

			saldo = saldo - valor;
			System.out.println("Novo saldo: " + saldo);

		}

	}

	public void depositar(double valor) {

		saldo = saldo + valor;

		System.out.println("Valor depositado: " + valor);
		System.out.println("Novo saldo: " + saldo);

	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getLimite() {
		return limite;
	}

	public void setLimite(int limite) {
		this.limite = limite;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

}
