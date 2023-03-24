package While;

import java.util.Scanner;

public class tabuada {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numero,x;
		System.out.println("insera um numero");
		numero=entrada.nextInt();
		entrada.close();
		
		for(x = 0; x <= 10; x++) {
			System.out.println(x*numero);
		}
	}
}
