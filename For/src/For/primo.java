package For;

import java.util.Scanner;

public class primo {

	public static void main(String[] args) {
		Scanner jorge = new Scanner(System.in);
		int n1, n2, cont, multi = 0;

		System.out.println("informe um numero");
		n1 = jorge.nextInt();
		jorge.close();

		for (n2 = 1; n2 <= n1; n2++) {

			if (n1 % n2 == 0) {

				multi++;

			}

		}

		System.out.println("Total de Multiplos:" + multi);
		System.out.println("Resutaldo :" + n1);

		if (multi <= 2) {

			System.out.println("Primo");

		} else {

			System.out.println("Nao Primo");

		}
	}
}
