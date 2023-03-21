package metodo;

import java.util.Scanner;

public class Menu_2 {
	
	static int  nMaior=0;
	static int  nMenor=1000;
	static int soma = 0;
	static int quanti = 0;
	static int media = 0;
	static int par;	
	static int primo;
	static int cont=0;
	
	
	public static void maior(int n2) {
		if (n2 == -1) {
			System.out.println("Este eh o numero maior: ");
			System.out.println(nMaior);
			System.out.println("Este eh o numero menor ");
			System.out.println(nMenor);	
		}
		else {
			if(n2 > nMaior) {
				nMaior = n2;
			}
			else if (n2 < nMenor) {
				nMenor = n2;
			}
		}
	}

	public static void soma(int n2) {
		if(n2 == -1) {
			System.out.println("A soma eh");
			System.out.println(soma);
		}
		else {
			soma=soma+n2;
			
		}
	}
	
	public static void media (int n2) {
		if (n2 == -1) {
			System.out.println("Esta eh sua media");
			System.out.println(media);
		}
		else {
			quanti++;
			media = (n2+cont)/quanti;
		}
	}
	
	public static void par (int n2) {
		if (n2 == -1) {
		}
		else {
			for(par = nMaior;par <= n2; par++) {
				if (par%2==0) {
					System.out.println("par");
				}
				else {
					System.out.println("Impar");
				}
				System.out.println(par);
			}
		}
	}

	public static void primo (int n2) {	
		for(primo=nMaior;primo <= n2; primo++) {
			if(primo % 2 != 0 || primo == 2) {
				System.out.println("primo");
		  }
			else {
				System.out.println("n primo");
			}
			System.out.println(primo);
		}
		
	}
	
	
	
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int n,n2;
		
		System.out.println("1. Verificar se eh maior ou menor de N numeros");
		System.out.println("2. Fazer soma de N numeros");
		System.out.println("3. Fazer media de N numeros");
		System.out.println("4. Achar o par e o impar de N numeros");
		System.out.println("5. Achar os numeros primos de N numeros");
		System.out.println("Escolha uma acima");
		n=entrada.nextInt();
		
		switch (n) {
		
		case 1:
			System.out.println("digite o numero");
			n2=entrada.nextInt();
			maior(n2);
			
			while(true) {
				if(n2 == -1) {
					break;	
				}
				else {
					System.out.println("digite o numero");
					n2=entrada.nextInt();
					maior(n2);
				}
				
			}
			break;
		case 2:
			System.out.println("digite o numero");
			n2=entrada.nextInt();
			soma(n2);
			
			while(true) {
				if(n2 == -1) {
					break;
				}
				else {
					System.out.println("digite o numero");
					n2=entrada.nextInt();
					soma(n2);
				}
				
			}
			break;
		case 3:
			System.out.println("digite o numero");
			n2=entrada.nextInt();
			media(n2);
			
			while(true) {
				if(n2 == -1) {
					break;
				}
				else {
					System.out.println("digite o numero");
					n2=entrada.nextInt();
					media(n2);
				}
				
			}
			break;
		case 4:
		System.out.println("digite o numero");
		n2=entrada.nextInt();
		par(n2);
		
		while(true) {
			if(n2 == -1) {
				break;
			}
			else {
				System.out.println("digite o numero");
				n2=entrada.nextInt();
				par(n2);	
			}
		}
		break;
		case 5:
			System.out.println("digite o numero");
			n2=entrada.nextInt();
			primo(n2);
			
			while(true) {
				if (n2 == -1) {
					break;
				}
				else {
					System.out.println("digite o numero");
					n2=entrada.nextInt();
					primo(n2);
				}
			}
			break;
			
			default:
				System.out.println("Nao existe esta opcao");
				break;
		}

	}

}
