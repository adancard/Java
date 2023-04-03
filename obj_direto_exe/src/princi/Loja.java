package princi;

import java.util.Scanner;

import obj_direto_exe.Sistema_loja;

public class Loja {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Sistema_loja sistema = new Sistema_loja();
		int n;

		while (true) {

			System.out.println("1. Adicionar compra");
			System.out.println("2. Consultar historico de Compra");
			System.out.println("3. Sair");
			n = entrada.nextInt();

			if (n == 3) {
				System.out.println("Saindo...");
				break;
			} else {
				switch (n) {

				case 1:
					sistema.getdata();

					System.out.println("Insira o Nome do Cliente:");
					sistema.setNome_C(entrada.next());
					sistema.getnomec();

					System.out.println("Insisra o Nome do Produto");
					sistema.setNome_P(entrada.next());
					sistema.getnomep();

					System.out.println("Insira o preco do Produto");
					sistema.setPeco(entrada.nextFloat());
					sistema.getpreco();

					break;

				case 2:

					sistema.total();
					break;

				}
			}

		}
		entrada.close();

	}

}
