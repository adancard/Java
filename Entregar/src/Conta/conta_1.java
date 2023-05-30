package Conta;

public class conta_1 {

	// declarando variaveis
	private double saldo;
	private int limite;
	private int codigo;

	// iniciando um construtor vazio
	public conta_1(double saldo, int limite, int codigo) {
	}

	// Metodo de sacar dinheiro ele vai ver se eh possivel sacar se nao ira mostrar
	// um mensagem de erro
	public void sacar(double valor) throws ContaExcecao {

		//Teste logico se o valor for maior que o limite ele vai da erro
		if (valor > limite) {

			throw new ContaExcecao(
					"valor maior que o limite\n" + "Limite: " + limite + "\n" + "Valor a sacar: " + valor + "\n");
			
		//Se o valor for menor ele vai fazer a conta de saldo menos o valor	
		} else {

			saldo = saldo - valor;
			System.out.println("Novo saldo: " + saldo);

		}

	}

	// Metodo de depositar
	public void depositar(double valor) {

		saldo = saldo + valor;

		System.out.println("Valor depositado: " + valor);
		System.out.println("Novo saldo: " + saldo);

	}

	// gets e sets
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
