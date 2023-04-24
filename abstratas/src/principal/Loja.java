package principal;

import entidades.Vestuario;

import java.util.Scanner;

import entidades.Eletronicos;
import entidades.Livro;
public class Loja {
	
	public static void main(String[] args) {
		int n;
		Livro livro = new Livro (10,"lucas","padeiro","Adan Cardoso",20,2022,"como treinar seu padeiro",10,30);
		Eletronicos ele = new Eletronicos(30,50,"tablet",10);
		Vestuario ves = new Vestuario(10, "Camisa azul", 20, 40, "Camisa", 41);
		Scanner entrada = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("1.Livro");
			System.out.println("2.Eletronicos");
			System.out.println("3.Vestuario");
			n=entrada.nextInt();
			
			switch(n) {
			
			case 1:
				
				System.out.println(livro.tostring());
				
				System.out.println("Comprar 1.sim /2. nao");
				n=entrada.nextInt();
				
				switch (n) {
				
				case 1:
					
					System.out.println("Preco: ");
					System.out.println(livro.calcularpreco());
					break;
				
				case 2:
					break;
					
				
				}
				break;
			
			}
			
		}
		

		
	}

}
