package Exercicio_1;

import java.util.Scanner;

//importanto bibliotecas criadas
import Conta.ContaExcecao;
import Conta.conta_1;

public class Parte_2 {

	public static void main(String[] args) throws ContaExcecao {

		// declarando variaveis
		int n;
		double n1;
		Scanner entrada = new Scanner(System.in);
		conta_1 conta = new conta_1(0, 0, 0);
		conta.setCodigo(1);

		System.out.println("digite o codigo de acesso (1): ");
		n = entrada.nextInt();

		// Vai chegar se o codigo de acesso eh igual o predefinido
		if (n == conta.getCodigo()) {

			// setando o limite e o saldo da conta
			conta.setLimite(100);
			conta.setSaldo(200);

			// Mostra o saldo Atual sem motificaçao
			System.out.println("\n" + "Saldo atual:" + conta.getSaldo() + "\n");

			// Prende o usuario ate ele digitar um valor de saque menor que o limite 
			do {

				// Pergunta de quanto vai querer sacar
				System.out.println("digite valor para sacar");
				n1 = entrada.nextDouble();

				try {

					// faz o teste logico se o valor for maior que o limite ele vai da erro se nao
					// faz a conta sem nenhum problema
					conta.sacar(n1);

				// Aqui vai mostrar a mensagem de erro se o "try" nao for verdadeiro
				} catch (ContaExcecao e) {

					System.out.println("Erro: " + e.getMessage());

				}

			// loop ate o valor for menor que o limite
			} while (n1 > conta.getLimite());

			// O quando vai ser depositado
			System.out.println("digite valor para Depositar");
			n1 = entrada.nextDouble();
			conta.depositar(n1);

			// Se ele colocar um codigo que nao eh o certo vai mostar a mensagem "Codigo
			// invalido"
		} else {

			System.out.println("Codigo invalido");
		}

		// fechando o scanner
		entrada.close();
	}

}
