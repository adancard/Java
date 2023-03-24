package metodo;

import java.util.Scanner;

public class IMC {
	
	public static double IMC (double peso, double altura) {
		double resultado;
		double altura2 = Math.pow(altura,2);
		resultado = peso/altura2;
		return resultado;
	}
	

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double peso, altura,result;
		
		System.out.println("informe seu peso: ");
		peso=entrada.nextDouble();
		System.out.println("informe sua altura: ");
		altura=entrada.nextDouble();
		
		result=IMC(peso, altura);
		
		System.out.printf("O seu peso de acordo com o IMC eh : %.2f kg %n",result);
		
		if (result < 18.5) {
			System.out.println("Abaixo Do Peso");
		}
		else if(result >= 18.5 && result <= 24.9) {
			System.out.println("Peso Normal");
		}
		else if(result >= 25 && result <= 29.9) {
			System.out.println("Acima Do Peso(sobrepeso");
		}
		else if(result >= 30 && result <= 34.9) {
			System.out.println("Obesidade 1");
		}
		else if(result >= 35 && result <= 39.9) {
			System.out.println("Obesidade 2");
		}
		else {
			System.out.println("Obesidade 3");
		}
		
		entrada.close();
		

	}

}
