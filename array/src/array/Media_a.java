package array;

import java.util.Scanner;

public class Media_a {

	public static void main(String[] args) {
		int[] array = new int [1];
		float num1,num2,num3;
		float total=0;
		Scanner entrada = new Scanner(System.in);
		
		for(int i = 0; i <array.length;i++) {
			
			System.out.println("Quantidade: "+i);
			System.out.println("Insira a primeira nota : ");
			num1=entrada.nextFloat();
			System.out.println("Insira a segunda nota: ");
			num2=entrada.nextFloat();
			System.out.println("Insira a terceira nota: ");
			num3=entrada.nextFloat();
			
			array[i]=(int) (num1+num2+num3)/3;
			
			
			
			
		}
		
		for(int i = 0; i<array.length;i++) {
			
			System.out.printf("media do [%d]: ",i);
			System.out.println(array[i]);
			
		}
		
		
		
		

	}

}
