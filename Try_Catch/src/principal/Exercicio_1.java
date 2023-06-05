package principal;

import java.util.InputMismatchException;
import java.util.Scanner;
import entidades.numeronegativo;
import entidades.NegativeArraySizeException;

public class Exercicio_1 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int n, indice;
		int[] vetor = new int[5];
		numeronegativo ex = new numeronegativo();

		try {

			for (int i = 0; i < vetor.length; i++) {

				System.out.println("Informe o indice");
				indice = entrada.nextInt();
				ex.verificar(indice);

				System.out.println("Informe o valor");
				n = entrada.nextInt();

				vetor[indice] = n;

			}

		} catch (NegativeArraySizeException e) {

			System.out.println(e.getMessage());

		}

		catch (InputMismatchException e) {

			System.out.println(" ");
			System.out.println("Digite apenas numeros");

		} catch (ArrayIndexOutOfBoundsException e) {

			System.out.println(" ");
			System.out.println("Indice nao existente");

		}

		System.out.println("Resultado final");
		for (int i = 0; i < vetor.length; i++) {

			System.out.println((i) + ". " + vetor[i]);

		}

	}
}
