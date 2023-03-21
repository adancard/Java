package ifelse;

import java.util.Scanner;

public class positvo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numero;
		System.out.println("infome um numero: ");
		numero = entrada.nextInt();		
	   if (numero > 0) {
		   System.out.printf("valor positivo %d",numero);
      }
	   else {
		   System.out.printf("numero negativo %d",numero);
	   }
      entrada.close();
	}

}
