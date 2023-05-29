package Exercicio_1;

import java.util.Scanner;

//importanto bibliotecas criadas
import Conta.ContaExcecao;
import Conta.conta_1;

public class Parte_2 {

	public static void main(String[] args) throws ContaExcecao {

		// declarando variaveis
		int n;
		Scanner entrada = new Scanner(System.in);
		conta_1 conta = new conta_1(0, 0, 0);
		conta.setCodigo(1);

		System.out.println("digite o codigo de acesso");
		n = entrada.nextInt();

		// Vai chegar se o codigo de acesso eh igual o predefinido
		if (n == conta.getCodigo()) {

			// setando o limite e o saldo da conta
			conta.setLimite(100);
			conta.setSaldo(200);

			// Mostra o saldo Atual sem motificaçao
			System.out.println("\n" + "Saldo atual:" + conta.getSaldo() + "\n");

			// Ele vai tenta sacar 700 um valor que nao eh possivel porque o limite eh 200
			try {

				conta.sacar(700);

				// Aqui vai mostrar a mensagem de erro se o "try" nao funcionar
			} catch (ContaExcecao e) {

				System.out.println("Erro: " + e.getMessage());

			}

			// O quando vai ser depositado
			conta.depositar(100);

			// Se ele colocar um codigo que nao eh o certo vai mostar a mensagem "Codigo
			// invalido"
		} else {

			System.out.println("Codigo invalido");
		}
	}

}
