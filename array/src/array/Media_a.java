package array;

import java.util.Scanner;

public class Media_a {

	public static void main(String[] args) {
		float[] array = new float[1];
		int quanti = 10;
		float num1, num2, num3;
		Scanner entrada = new Scanner(System.in);

		for (int i = 0; i < array.length; i++) {

			System.out.println("Quantidade: " + quanti);
			System.out.println("Insira a primeira nota : ");
			num1 = entrada.nextFloat();
			System.out.println("Insira a segunda nota: ");
			num2 = entrada.nextFloat();
			System.out.println("Insira a terceira nota: ");
			num3 = entrada.nextFloat();
			quanti--;

			array[i] =  (num1 + num2 + num3) / 3;

		}

		for (int i = 0; i < array.length; i++) {
			quanti++;
			System.out.printf("media do aluno [%d] %.2f: ",quanti ,array[i]);
			System.out.println();

		}
		entrada.close();

	}

}
