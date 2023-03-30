package array;

import java.util.Scanner;

public class Temperatura {

	public static void main(String[] args) {
		float[] array = new float[1];
		Scanner entrada = new Scanner(System.in);
		float temp1,temp2,temp3,maior=0,menor=1000;
		
		for(int i = 0; i < array.length;i++) {
			
			System.out.println("Temperatura de  Manha: ");
			temp1=entrada.nextFloat();
			array[i]=temp1;
			
			System.out.println("Temperatura de  Tarde: ");
			temp2=entrada.nextFloat();
			array[i]=temp2;
			
			System.out.println("Temperatura de  Noite: ");
			temp3=entrada.nextFloat();
			array[i]=temp3;
			
			if(temp1>temp2) {
				
				maior=temp1;
				
			}
			
			else if (temp2>temp1){
			
				maior = temp2;
				
			}
			
			else{
				
				maior = temp3;
				
			}
			
			
			if(temp1<temp2) {
				
				menor=temp1;
				
			}
			
			else if (temp2<temp1){
			
				menor = temp2;
				
			}
			
			else{
				
				menor = temp3;
				
			}
			
			
		}
		
		
		for(int i = 0; i < array.length; i++) {
			
				System.out.println("Maior Temperatura: "+maior);
				System.out.println("Menor Temperatura: "+menor);
				System.out.println(array[i]);

			
		}

	}

}
