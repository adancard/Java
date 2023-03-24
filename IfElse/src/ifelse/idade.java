package ifelse;

import java.util.Scanner;

public class idade {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		int idade;
		System.out.println("infome a idade: ");
		idade = entrada.nextInt();
		
		if (idade > 18) {
			System.out.println("Voce eh maior de idade!");
		}
		else {
			System.out.println("Voce eh menor de idade!");
		}
		entrada.close();

	}

}
