package princi;

import java.util.Scanner;
import obj_direto_exe.Sistema_nota;

public class Notas_sistema {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String[] nomes = new String[1];
		float[] array = new float[1];
		int[] numeros = new int[1];
		float nota;
		Sistema_nota notas = new Sistema_nota();

		for (int i = 0; i < nomes.length; i++) {

			System.out.println("nomes:");
			nomes[i] = entrada.next();
			System.out.println("numeros:");
			numeros[i] = entrada.nextInt();
			System.out.println("notas:");
			array[i] = nota = entrada.nextFloat();
			notas.setNotas(nota);
			
		}

		for (int i = 0; i < nomes.length; i++) {
			System.out.println("Nomes: ");
			System.out.println(nomes[i]);

			for (i = 0; i < numeros.length; i++) {
				System.out.println("Numero da chamada: ");
				System.out.println(numeros[i]);
				
				for (i = 0; i < array.length; i++) {
					System.out.println("Notas dos alunos: ");
					System.out.println(array[i]);
					System.out.println("Media:");
					System.out.println(notas.media());
					
				}
			}
		}
		entrada.close();
	}
}
