package metodo;

import java.util.Scanner;

public class Camisa {
	
	static double restoS = 0;
	static double restoT = 0;
	static double restoCa = 0;
	static double restoCJ = 0;
	static double resto = 0;
	static double resto2 = 0;
	static double resto3 = 0;
	static double restoC = 0;
	static double camiseta = 29.90;
	static double calçaJ = 79.90;
	static double camisa = 99.90;
	static double tenis = 149.90;
	static double sapatos = 199.90;
	
	public static void camiseta1 (int n1) {
		
		restoC=n1*camiseta;
	
		
	}
	
	public static void desconto() {
		resto =resto2/10;
	}

	public static void desconto2() {
		resto3=resto2/20;
	}
	
	public static void caçaj (int n1) {
		
		restoCJ = n1*calçaJ;
	
		
	}
	
	public static void camisa (int n1) {
		
		restoCa = n1*camisa;
	
		
	}
	
	public static void tenis (int n1) {
		restoT = n1*tenis;

	}
	
	public static void sapato (int n1) {
		restoS=n1*sapatos;

	}
	
	public static void soma () {
		resto2 = restoC+restoCJ+restoT+restoCa+restoS;
		
	}
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int n,n1;
		
		while(true) {
			System.out.println("1. camiseta R$29.90");
			System.out.println("2. calça jens R$79.90");
			System.out.println("3. camisa R$99.90");
			System.out.println("4. tenis R$149.90");
			System.out.println("5. sapatos R$199.90");
			System.out.println("6. Sair e Ver total");
			System.out.println("Escolha uma acima para adicionar");
			n=entrada.nextInt();
			
			switch (n) {
			
			case 1:
				System.out.println("quantidade");
				n1=entrada.nextInt();
				camiseta1(n1);
				break;
				
			case 2:
				System.out.println("quantidade");
				n1=entrada.nextInt();
				caçaj(n1);
				break;
				
			case 3:
				System.out.println("quantidade");
				n1=entrada.nextInt();
				camisa(n1);
				break;

			case 4: 
				System.out.println("quantidade");
				n1=entrada.nextInt();
				tenis(n1);
				break;
				
			case 5:
				System.out.println("quantidade");
				n1=entrada.nextInt();
				sapato(n1);
				break;
				
			case 6:
				soma();
				System.out.println(resto2);
				
				if(resto2 > 100) {
					System.out.println("Na proxima compra acima de R$100 ganhe 10% de desconto");
					System.out.println("1. Sim");
					System.out.println("2. Nao");
					n=entrada.nextInt();
					
					while(true) {
					
					switch (n) {
					
					case 1:
						
						System.out.println("1. camiseta R$29.90");
						System.out.println("2. calça jens R$79.90");
						System.out.println("3. camisa R$99.90");
						System.out.println("4. tenis R$149.90");
						System.out.println("5. sapatos R$199.90");
						System.out.println("6. Sair e Ver total");
						System.out.println("Escolha uma acima para adicionar");
						n=entrada.nextInt();
						
						switch (n) {
						
						case 1:
							System.out.println("quantidade");
							n1=entrada.nextInt();
							camiseta1(n1);
							break;
							
						case 2:
							System.out.println("quantidade");
							n1=entrada.nextInt();
							caçaj(n1);
							break;
							
						case 3:
							System.out.println("quantidade");
							n1=entrada.nextInt();
							camisa(n1);
							break;

						case 4: 
							System.out.println("quantidade");
							n1=entrada.nextInt();
							tenis(n1);
							break;
							
						case 5:
							System.out.println("quantidade");
							n1=entrada.nextInt();
							sapato(n1);
							break;
							
						case 6:
							soma();
							desconto();
							System.out.println(resto);
							
							if (resto > 100) {
								System.out.println("Na proxima compra acima de R$100 ganhe 20% de desconto");
								System.out.println("1. Sim");
								System.out.println("2. Nao");
								n=entrada.nextInt();
								
								while(true) {
									
									switch (n) {
									
									case 1:
										
										System.out.println("1. camiseta R$29.90");
										System.out.println("2. calça jens R$79.90");
										System.out.println("3. camisa R$99.90");
										System.out.println("4. tenis R$149.90");
										System.out.println("5. sapatos R$199.90");
										System.out.println("6. Sair e Ver total");
										System.out.println("Escolha uma acima para adicionar");
										n=entrada.nextInt();
										
										switch (n) {
										
										case 1:
											System.out.println("quantidade");
											n1=entrada.nextInt();
											camiseta1(n1);
											break;
											
										case 2:
											System.out.println("quantidade");
											n1=entrada.nextInt();
											caçaj(n1);
											break;
											
										case 3:
											System.out.println("quantidade");
											n1=entrada.nextInt();
											camisa(n1);
											break;

										case 4: 
											System.out.println("quantidade");
											n1=entrada.nextInt();
											tenis(n1);
											break;
											
										case 5:
											System.out.println("quantidade");
											n1=entrada.nextInt();
											sapato(n1);
											break;
											
										case 6:
											soma();
											desconto2();
											System.out.println(resto3);
											break;
									
			 }
										case 2:
										break;
		   }
		  }
		 }					
		}	
										case 2:
											break;			
	  }
	 }		
	}	
									else {	
										break;
									}
   }
  }
 }
}

