package entidades;

import java.util.Calendar;

public abstract class CartaoD extends Pagamento {

	private int limite;
	private int dia;
	private int mes;
	private int ano;
	private float pago;

	public CartaoD(int limite, int dia, int mes, int ano, float pago, String nome, float conta, int ID) {

		super(nome, ID, conta);
		this.limite = limite;
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		this.pago = pago;

	}

	public void metodopagamento() {

		Calendar c = Calendar.getInstance();

		if (c.get(Calendar.DAY_OF_MONTH) == dia && c.get((Calendar.MONTH)) + 1 == mes && c.get(Calendar.YEAR) == ano) {

			if (pago < limite) {
				float conta;

				System.out.println("Valor da conta: "+getConta());
				
				System.out.println("Valor pago: "+pago);
				
				conta = getConta() - pago;
				System.out.println("Saldo atual: " + conta);

			} else {

				System.out.println("Nao aprovado");

			}

		} else {

			System.out.println("Nao autorizado!");

		}

	}

}
