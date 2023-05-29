package Exercicio_1;

public class Parte_1 {

	public static void metodo1() {
		System.out.println("Início da metodo1.");

		try {
			int[] vetor = new int[5];
			for (int i = 0; i < 10; i++) {
				vetor[i] = i;
				System.out.println(i);
			}
		} catch (ArrayIndexOutOfBoundsException e) {

			System.out.println("Indice fora dos limites do vetor.");

		}

		finally {
			System.out.println("Fim do metodo1.");

		}

	}

	public static void main(String[] args) {
		System.out.println("Início da main.");
		metodo1();
		System.out.println("Fim da main.");
	}

}
