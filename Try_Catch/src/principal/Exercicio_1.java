package principal;

import java.util.InputMismatchException;
import java.util.Scanner;
import entidades.numeroex;
import entidades.excesao;

public class Exercicio_1{

	public static void main(String[] args) throws numeroex{

		Scanner entrada = new Scanner(System.in);
		int n, indice;
		int[] vetor = new int[5];
		excesao ex = new excesao();

		System.out.println("Informe o indice");
		indice = entrada.nextInt();

		System.out.println("Informe o valor");
		n = entrada.nextInt();

		try {

			vetor[indice] = n;

		} catch (ArrayIndexOutOfBoundsException e) {

			System.out.println("Indice nao existente");

		} catch (InputMismatchException f) {

			System.out.println("Digite apenas numeros");

		} 

	}
}
