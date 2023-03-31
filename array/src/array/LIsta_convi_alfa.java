package array;

import java.util.Arrays;
import java.util.Scanner;

public class LIsta_convi_alfa {

	public static void main(String[] args) {
		String[] array;
		int tamanhoArray;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o tamanho da lista: ");
		tamanhoArray = entrada.nextInt();
		array= new String [tamanhoArray];	
		
		for(int i = 0; i < array.length; i++) {
			System.out.println("Informe o nome do convidado:");
			array[i] = entrada.next();
		}
		
		System.out.println("Nomes: ");
		for(int i = 0; i < tamanhoArray;i++) {
			
			Arrays.sort(array);
			
			System.out.println(array[i]);
			
		}
		entrada.close();

	}

}
