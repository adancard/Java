package While;

import java.util.Scanner;

public class menos_um {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numero,cont;
		cont = 0;
		
		while (true) {
		System.out.println("informe um numero");
		numero = entrada.nextInt();
		
		if (numero == -1) {
			break;
		}
		else {
			cont = numero + cont;
			System.out.println("informe -1 para parar de contar");
		}
		
		}
		
		System.out.println(cont);
		entrada.close();

	}

}
