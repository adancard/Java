package metodo;

import java.util.Scanner;

public class media_nota {
	
	public static float media (float n1, float n2, float n3) {
		float resultado;
		resultado= (n1+n2+n3)/3;
		return resultado;
		
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		float n1,n2,n3,resul;
		
		System.out.println("informe as tres notas:");
		n1=entrada.nextFloat();
		n2=entrada.nextFloat();
		n3=entrada.nextFloat();
		
		resul = media(n1, n2, n3);
		
		System.out.println("A media eh:");
		System.out.println(resul);

	}

}
