package prova;

import java.util.Scanner;

public class Prova_1 {
	
	static float restoT = 0;
	static float restoP = 0;
	static float resto = 0;
	static float maior = 0;
	static float menor = 1000;
	
	public static void maior (float nt1, float nt2) {
		
		if ((nt1 >=0 && nt1 <=10) && (nt2 >= 0 && nt2 <= 10)) {
		if (nt1 > maior) {
			maior=nt1;
		}
		else if (nt2 > maior) {
			maior=nt2;
		}


	}
}
	public static void menor (float nt1, float nt2) {
		
		if ((nt1 >=0 && nt1 <=10) && (nt2 >= 0 && nt2 <= 10)) {
		if (nt1 < menor) {
			menor=nt1;
		}
		else if (nt2 < menor) {
			menor=nt2;
		}


	}
}
	public static void MediaP (float nt1, float nt2 ) {
		
		restoP=(nt1+nt2)/2;
		
	}
	public static void MediaT (float nt1, float nt2 ) {	
		restoT=(nt1+nt2)/2;
		
	}
	public static void mediaTo () {
		 resto=(restoP+restoT)/2;
	}
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int n;
		float nt1,nt2;
		
		while(true) {
		System.out.println("1. Mostrar Maior nota");
		System.out.println("2. Mostrar Menor nota");
		System.out.println("3. Calcular a media das notas das Provas");
		System.out.println("4. Calcular a media das notas dos Trabalhos");
		System.out.println("5. verificar se foi Aprovado ou Reprovado");
		System.out.println("6. Sair");
		n=entrada.nextInt();
		
		if (n == 6) {
			System.out.println("Saindo...");
			break;
		}
		else {
		switch (n) {
		
		case 1:
			
			System.out.println("Insira a primeira nota");
			nt1=entrada.nextFloat();
			System.out.println("Insira a segunda nota");
			nt2=entrada.nextFloat();
			maior(nt1, nt2);
			
			while(true) {
			if ((nt1 >=0 && nt1 <=10) && (nt2 >= 0 && nt2 <= 10)) {
				maior(nt1, nt2);
				System.out.println("Esta eh a Maior Nota "+ maior);
				System.out.println(" ");
				break;
			}
			else {
				System.out.println("Digite um numero entre 0 e 10");
				System.out.println("Insira a primeira nota");
				nt1=entrada.nextFloat();
				System.out.println("Insira a segunda nota");
				nt2=entrada.nextFloat();
				maior(nt1, nt2);
			}
		}
			break;
		case 2:
			System.out.println("Insira a primeira nota");
			nt1=entrada.nextFloat();
			System.out.println("Insira a segunda nota");
			nt2=entrada.nextFloat();
			menor(nt1, nt2);
			
			while(true) {
				if ((nt1 >=0 && nt1 <=10) && (nt2 >= 0 && nt2 <= 10)) {
					menor(nt1, nt2);
					System.out.println("Esta eh a Menor Nota "+ menor);
					System.out.println(" ");
					break;
				}
				else {
					System.out.println("Digite um numero entre 0 e 10");
					System.out.println("Insira a primeira nota");
					nt1=entrada.nextFloat();
					System.out.println("Insira a segunda nota");
					nt2=entrada.nextFloat();
					menor(nt1, nt2);
				}
			}
			break;
		case 3:
			
			System.out.println("Insira a primeira nota");
			nt1=entrada.nextFloat();
			System.out.println("Insira a segunda nota");
			nt2=entrada.nextFloat();
			
			while(true) {
				if ((nt1 >=0 && nt1 <=10) && (nt2 >= 0 && nt2 <= 10)) {
					MediaP(nt1, nt2);
					System.out.println("Esta eh a Media das notas das Provas " + restoP);
					System.out.println(" ");
					break;
				}
				else {
					System.out.println("Digite um numero entre 0 e 10");
					System.out.println("Insira a primeira nota");
					nt1=entrada.nextFloat();
					System.out.println("Insira a segunda nota");
					nt2=entrada.nextFloat();
					MediaP(nt1, nt2);
				}
			}
			break;
		case 4:
					
					System.out.println("Insira a primeira nota");
					nt1=entrada.nextFloat();
					System.out.println("Insira a segunda nota");
					nt2=entrada.nextFloat();
					
					while(true) {
						if ((nt1 >=0 && nt1 <=10) && (nt2 >= 0 && nt2 <= 10)) {
							MediaT(nt1, nt2);
							System.out.println("Esta eh a Media das notas dos Trabalhos " + restoT );
							System.out.println(" ");
							break;
						}
						else {
							System.out.println("Digite um numero entre 0 e 10");
							System.out.println("Insira a primeira nota");
							nt1=entrada.nextFloat();
							System.out.println("Insira a segunda nota");
							nt2=entrada.nextFloat();
							MediaT(nt1, nt2);
						}
					}
					break;
		case 5:
			mediaTo();
			if(resto > 5) {
				System.out.println("aprovado");
				break;
			}
			else {
				System.out.println("reprovado");
				break;
			}
    }
   }
  }	
		entrada.close();
 }
}