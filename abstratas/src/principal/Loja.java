package principal;

import entidades.Vestuario;
import java.util.Scanner;
import entidades.Eletronicos;
import entidades.Livro;

public class Loja {

	public static void main(String[] args) {
		int n;
		Livro livro = new Livro(10, "lucas", "padeiro", "Adan Cardoso", 20, 2022, "como treinar seu padeiro", 10, 30);
		Eletronicos ele = new Eletronicos(30, 50, "tablet", 10);
		Vestuario ves = new Vestuario(10, "Camisa azul", 20, 40, "Camisa", 41);
		Scanner entrada = new Scanner(System.in);

		while (true) {

			System.out.println("1.Livro");
			System.out.println("2.Eletronicos");
			System.out.println("3.Vestuario");
			System.out.println("4.Sair");
			n = entrada.nextInt();

			if (n == 4) {
				System.out.println("Saindo...");
				break;
			}

			switch (n) {

			case 1:

				System.out.println(livro.tostring());

				System.out.println("Comprar 1.sim /2. nao");
				n = entrada.nextInt();

				switch (n) {

				case 1:

					System.out.println("Preco: ");
					System.out.println(livro.calcularpreco());
					System.out.println(" ");
					break;

				case 2:
					break;

				}
				break;

			case 2:

				System.out.println(ele.tostring());

				System.out.println("Comprar 1.sim /2. nao");
				n = entrada.nextInt();

				switch (n) {

				case 1:

					System.out.println("Preco: ");
					System.out.println(livro.calcularpreco());
					System.out.println(" ");
					break;

				case 2:
					break;

				}
				break;

			case 3:

				System.out.println(ves.tostring());

				System.out.println("Comprar 1.sim /2. nao");
				n = entrada.nextInt();

				switch (n) {

				case 1:

					System.out.println("Preco: ");
					System.out.println(livro.calcularpreco());
					System.out.println(" ");
					break;

				case 2:
					break;

				}
				break;

			}

		}
		
		entrada.close();

	}

}
