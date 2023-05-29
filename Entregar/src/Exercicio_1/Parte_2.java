package Exercicio_1;

import java.util.Scanner;

import Conta.ContaExcecao;
import Conta.conta_1;

public class Parte_2 {

	public static void main(String[] args) throws ContaExcecao {
		int n;
		Scanner entrada = new Scanner(System.in);
		conta_1 conta = new conta_1(0, 0, 0);
		conta.setCodigo(1);

		System.out.println("digite o codigo de acesso");
		n = entrada.nextInt();

		if (n == conta.getCodigo()) {

			conta.setLimite(100);
			conta.setSaldo(200);

			System.out.println("\n" + "Saldo atual:" + conta.getSaldo() + "\n");

			try {

				conta.sacar(700);

			} catch (ContaExcecao e) {

				System.out.println("Erro: " + e.getMessage());

			}

			conta.depositar(100);

		} else {

			System.out.println("Codigo invalido");
		}
	}

}
