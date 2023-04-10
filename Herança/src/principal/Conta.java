package principal;

import java.util.Scanner;
import pacote.Conta_Bancaria;
import pacote.Conta_Corrente;
import pacote.Conta_Poupanca;

public class Conta {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int n, nu;
		float depo, saca;
		String nome;
		Conta_Bancaria cb = new Conta_Bancaria(null, 0, 0);
		Conta_Corrente cc = new Conta_Corrente(null, 0, 0, 0);
		Conta_Poupanca cp = new Conta_Poupanca(null, 0, 0, 10);

		while (true) {
			
			System.out.println("1.Incluir dados relativos a(s) conta(s) de um cliente");
			System.out.println("2.Sacar um determinado valor da(s) sua(s) conta(s)");
			System.out.println("3.Depositar um determinado valor na(s) sua(s) conta(s)");
			System.out.println("4.Mostrar saldo  da em conta corrente");
			System.out.println("5.sair");

			n = entrada.nextInt();

			if (n == 5) {
				break;
			}

			else {

				switch (n) {

				case 1:

					System.out.println("nome");
					nome = entrada.next();
					cb.setNocliente(nome);
					System.out.println("numero da conta");
					nu = entrada.nextInt();
					cb.setNconta(nu);
					System.out.println("Saldo da conta");
					System.out.println(cb.getSaldo());
					break;

				case 2:

					System.out.println("1.Conta Bancaria");
					System.out.println("2.Conta Corrente");
					n = entrada.nextInt();

					switch (n) {

					case 1:

						System.out.println("Quantidade para sacar:");
						saca = entrada.nextFloat();
						cb.setSacar(saca);
						break;

					case 2:

						System.out.println("Quantidade para sacar:");
						saca = entrada.nextFloat();
						cc.setSacar(saca);
						cc.sacarC();
						break;
					}
					break;

				case 3:

					System.out.println("1.Conta Bancaria");
					System.out.println("2.Conta Corrente");
					n = entrada.nextInt();

					switch (n) {

					case 1:

						System.out.println("Quantidade de deposito:");
						depo = entrada.nextFloat();
						cb.setDepo(depo);
						break;

					case 2:

						System.out.println("Quantidade de deposito:");
						depo = entrada.nextFloat();
						cc.setDepo(depo);
						cc.depositarC();
						break;
					}
					break;

				case 4:

					System.out.println(cb.getNocliente());
					System.out.println(cb.getSaldo());

					break;

				}

			}

		}
	}
}
