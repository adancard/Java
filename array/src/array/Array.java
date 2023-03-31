package array;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int[] array = new int[10];
		int total = 0;

		for (int i = 0; i < array.length; i++) {

			System.out.printf("Informe a posicao[%d]: ", i);
			array[i] = entrada.nextInt();

		}

		for (int i = 0; i < array.length; i++) {

			total = total + array[i];

		}

		System.out.printf("Total da soma dos elementos: %d\n", total);
		entrada.close();
	}

}