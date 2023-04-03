package array;

import java.util.Scanner;

public class Temperatura {

	public static void main(String[] args) {
		
		float[] array = new float[1];
		Scanner entrada = new Scanner(System.in);
		float temp1, temp2, temp3, maior = 0, menor = 1000;

		for (int i = 0; i < array.length; i++) {

			System.out.println("Temperatura de  Manha: ");      
			array[i] = temp1 = entrada.nextFloat();             
                                                                
			System.out.println("Temperatura de  Tarde: ");      
			array[i] = temp2 = entrada.nextFloat();             
                                                                
			System.out.println("Temperatura de  Noite: ");      
			array[i] = temp3 = entrada.nextFloat();             

			if ((temp1 > temp2) && (temp1 > temp3)) {

				maior = temp1;

			}

			else if ((temp2 > temp1) && (temp2 > temp3)) {

				maior = temp2;

			}

			else if ((temp3 > temp1) && (temp3 > temp2)) {

				maior = temp3;

			}
			

			if ((temp1 < temp2) && (temp1 < temp3)) {

				menor = temp1;

			}

			else if ((temp2 < temp1) && (temp2 < temp3)) {

				menor = temp2;

			}

			else {

				menor = temp3;

			}

		}

		for (int i = 0; i < array.length; i++) {

			System.out.println("Maior Temperatura: " + maior);

		}

		entrada.close();

	}

}