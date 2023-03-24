package principal;

import java.util.Scanner;

import objeto_direto.Exemplo;

public class Principal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Exemplo data = new Exemplo(2, 10);

		System.out.println(data.getDia());
		data.setDia(1);
		System.out.println(data.getDia());

		System.out.println("a");
		data.setAno(entrada.nextInt());

		System.out.println(data.getAno());
		entrada.close();

	}

}
