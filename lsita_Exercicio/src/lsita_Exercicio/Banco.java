package lsita_Exercicio;

import java.util.Scanner;

public class Banco {
	
	static float din = 0;
	
	public static float sacar (float tirar) {
	 din=din-tirar;
	
	 return din;
	}
	
	public static void depositar (float depo) {
		
		din=depo+din;
		
	}


	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int n;
		float tirar,depo;
		
		while(true) {
		System.out.println("1. Consultar Saldo");
		System.out.println("2. Sacar");
		System.out.println("3. Depositar");
		System.out.println("4. Sair do Sistema");
		n=entrada.nextInt();
		
		if (n == 4) {
			break;
		}
		else {
		switch (n) {
		case 1:
			System.out.println(din);
			break;
			
		case 2:
			if (din == 0) {
				System.out.println("Nao a dinhero para sacar");
				break;
			}
			else {
				System.out.println("Quanto vc quer retirar");
				tirar=entrada.nextFloat();
				sacar(tirar);
				break;
			}
			
		case 3:
			System.out.println("Quanto vc quer deposistar");
			depo=entrada.nextFloat();
			depositar(depo);
			break;
		
		 }
		}
	  }
		entrada.close();
	}
}
