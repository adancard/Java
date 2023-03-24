package metodo;

import java.util.Scanner;

public class calculador {
	
	static int adicao = 0;
	static int sub = 0;
	static int nMaior = 0;
	static int multi = 1;
	static int div;
	static double raiz;
	static int quanti = 0;
	
	public static int fatorial ( int n2, int cont, int fat) {
		 for(cont=n2;cont>=1;cont--) {
			fat=fat*cont;
		}
		 return fat;
	}
	
	public static int mmc (int n, int n3, int maior) {
		int result;
		while(true) {
			if(n > n3) {
				maior = n;
			}
			else {
				maior = n3;
			}
			
		if((maior % n3 == 0)&&(maior % n ==0)) {
			result = maior;
			maior++;
			return result;	
	  }
     }
	}
	
	public static int mdc (int n3, int n4, int maior) {
		int result=1;
		
		if(n3 > n4) {
			maior = n3;
		}
		else {
			maior = n4;
		}
		
			for(int i = 2; i <= maior;i++) {
		if((n3 % i == 0)&&(n3 % i ==0)) {
			n4=n4/i;
			n3=n3/i;
			
			result = result*i;	
		}
	   }
		return result;
	}
	
	public static int Primo (int n3) {
		int result;
		
		 result = n3 % 2;
		 return result;
	}
	
	public static void soma ( int n3) {
		if (n3 == -1) {
			System.out.println(adicao);
		}
		else {
			adicao=adicao+n3;
		}

	}
	
	public static void subr (int n3) {
		 if(n3 == -1) {
			 System.out.println(sub);
			 
		 }
		 else{
				 sub = (-n3)-sub ;
		 }
		}

	public static void multi (int n3) {

		if (n3 == -1) {
			System.out.println(multi);
		}
		else {
			multi= multi*n3;
		}

		}

	public static void div (int n3) {
		if (n3 == -1) {
			System.out.println(div);
		}
		else {
			quanti++;
			div = n3/quanti;

		}
	}

	public static int raiz1 (int n3) {
		double result;
		
		result=Math.sqrt(n3);
		
		return (int) result;
		
	}
	
	public static int expo (int n3) {
		int result;
		
		double result1 = Math.pow(n3, n3);
		
		result=(int)result1;
		return result;
	}
	
	public static int loga (int n3,int n6) {
		double result;
		
		double base = Math.log(n3);
		double valor = Math.log(n6);
		
		result=valor/base;
		
		return (int)result;	
	}
	
	public static float  seno (float catetoop, float hipotenuza) {
		float result;
		result = catetoop/hipotenuza;
		
		return result;
		
	}
	
	public static float cos (float catetoad, float hipotenuza) {
		float result;
		
		result=catetoad/hipotenuza;
		
		return result;
		
	}
	
	public static float tan (float catetoop, float catetoad) {
		float result;
		
		result=catetoop/catetoad;
		
		return result;
	}
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int escolha,fat = 1, cont=0,n2,n3,n4,n5,n6,mmc,maior,mdc,primo,raiz2,expoen,logari;
		float result1,result2,result3,catetoop,hipotenuza,catetoad;
		
		System.out.println("1. MMC");
		System.out.println("2. MDC");
		System.out.println("3. Fatorial");
		System.out.println("4. Verificar se o numero eh primo");
		System.out.println("5. Mais opcoes");
		System.out.println("Escolha uma opcao acima");
		escolha=entrada.nextInt();
		
		switch (escolha) {
		
		case 1:
			System.out.println("informe dois numeros ");
			n3=entrada.nextInt();
			n4=entrada.nextInt();
			
			if(n3 > n4) {
				maior = n3;
			}
			else {
				maior = n4;
			}
			
			mmc = mmc(n3, n4, maior);
			System.out.println(mmc);
			break;
			
		case 2:
			
			System.out.println("informe dois numero: ");
			n3=entrada.nextInt();
			n4=entrada.nextInt();
			
			if(n3 > n4) {
				maior = n3;
			}
			else {
				maior = n4;
			}
			mdc=mdc(n3, n4, maior);
			System.out.println(mdc);
			break;
			
		
		case 3:
			
			System.out.println("informe o numero");
			n3=entrada.nextInt();
			fat=fatorial(n3, cont, fat);
			System.out.println(fat);
			break;

		case 4:
			System.out.println("Informe um numero");
			n3=entrada.nextInt();
			primo= Primo(n3);
			if (primo != 0 || n3 == 2) {
				System.out.println("primo");
			}
			else {
				System.out.println("Nao eh primo");
			}
			break;
			
		case 5:
			System.out.println("1. Soma");
			System.out.println("2. Subtraçao");
			System.out.println("3. multiplicaçao");
			System.out.println("4. divisao");
			System.out.println("5. Raiz");
			System.out.println("6. Exponencial");
			System.out.println("7. Logarítmica");
			System.out.println("8. Seno Cosseno e Tangente");
			System.out.println("Escolha uma opçao acima");
			n2=entrada.nextInt();
			
			switch (n2) {
			
			case 1:
				System.out.println("digite o numero" );
				n3=entrada.nextInt();
				soma(n3);
			while(true) {
				if (n3 == -1) {
					break;
				}
				else {
					System.out.println("digite o numero" );
					n3=entrada.nextInt();
					soma(n3);
				}
			}
				break;
				
			case 2:
				System.out.println("digite o numero" );
				n3=entrada.nextInt();
				subr(n3);
			while(true) {
				if (n3 == -1) {
					break;
				}
				else {
					System.out.println("digite o numero" );
					n3=entrada.nextInt();
					subr(n3);
				}
			}
				break;
			
				
			case 3:
				System.out.println("digite o numero" );
				n3=entrada.nextInt();
				multi(n3);
			while(true) {
				if (n3 == -1) {
					break;
				}
				else {
					System.out.println("digite o numero" );
					n3=entrada.nextInt();
					multi(n3);
				}
			}
				break;
				
			case 4:
				System.out.println("digite o numero" );
				n3=entrada.nextInt();
				div(n3);
			while(true) {
				if (n3 == 0) {
					System.out.println("digite um numero diferente de 0" );
					n3=entrada.nextInt();
				}
				else {
					if(n3 == -1){
						break;
					}
					else {
						System.out.println("digite o numero" );
						n3=entrada.nextInt();
						div(n3);
					}
				}
			}
				break;
				
			case 5:
				System.out.println("digite o numero" );
				n3=entrada.nextInt();
				
				raiz2=raiz1(n3);
				
				System.out.println(raiz2);
				break;			
			
		case 6:
			System.out.println("digite o numero" );
			n3=entrada.nextInt();
			
			expoen=expo(n3);
			
			System.out.println(expoen);
			break;
			
		case 7:
			System.out.println("digite a base" );
			n3=entrada.nextInt();
			System.out.println("digite o valor" );
			n6=entrada.nextInt();
			
			logari=loga(n3,n6);
			
			System.out.println(logari);
			break;
			
		case 8:
			System.out.println("1. Achar coseno ");
			System.out.println("2. Achar seno ");
			System.out.println("3. Achar tangente ");
			System.out.println("Escolha uma opcao acima");
			n5=entrada.nextInt();
			
			switch (n5) {
			
			case 1:
				System.out.println("informe o cateto adjacente");
				catetoad=entrada.nextFloat();
				System.out.println("informe a hipotenuza");
				hipotenuza=entrada.nextFloat();
				
				result2=cos(catetoad, hipotenuza);
				
				System.out.printf("%.2f",result2);
				break;

			case 2:
				System.out.println("informe o cateto oposto");
				catetoop=entrada.nextFloat();
				System.out.println("informe a hipotenuza");
				hipotenuza=entrada.nextFloat();
				result1 = seno(catetoop, hipotenuza);
				
				System.out.printf("%.2f",result1);
				break;
			
			case 3:
				System.out.println("informe o cateto oposto");
				catetoop=entrada.nextFloat();
				System.out.println("informe a adjacente");
				catetoad=entrada.nextFloat();
				
				result3=tan(catetoop, catetoad);
				System.out.printf("%.2f",result3);
				break;
				
	  }
			
			default:
			System.out.println("Nao existe esta opçao");
			entrada.close();
	 }
	}
  }
}