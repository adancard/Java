package array;

import java.util.Scanner;

public class Lista_convi {

	public static void main(String[] args) {
		String[] array = new String[3];
		Scanner entrada = new Scanner(System.in);
		
		
		for(int i = 0; i < array.length ;i++) {
			
			System.out.printf("Informe o nome do convidade[%d]: ", i);
			array[i]=entrada.nextLine();
			
		}
		
		for(int i = 0; i<array.length;i++) {
			
			System.out.println(array[i]);
			
		}

	}

}
