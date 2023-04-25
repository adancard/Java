package principal;

import java.util.Scanner;

import entidades.CartaoC;
import entidades.CartaoD;

public class Banco {
	
	public static void main(String[] args) {
		int n;
		Scanner entrada = new Scanner(System.in);
		CartaoC card = new CartaoC(50,100,20,10,2004,5,"adan",500,2);
		CartaoD cardD = new CartaoD(50,25,04,2023,30,"adan",500,10){};
		
		System.out.println("Pagar com: ");
		System.out.println("1.Cartao de Credito");
		System.out.println("2.Cartao de debito");
		n=entrada.nextInt();
		
		switch (n) {
		
		case 1:
			
			card.metodopagamento();
			System.out.println("Pago");
			break;
		case 2:
			
			cardD.metodopagamento();
			System.out.println("Pago");
			break;
			
		}
		
		
		
		
		
		
	}

}
