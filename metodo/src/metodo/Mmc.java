package metodo;

import java.util.Scanner;

public class Mmc {
	
	public static int MMC (int n3, int n2,int maior) {
		int result;
		while(true) {
			
			if(n2 > n3) {
				maior = n2;
			}
			else {
				maior = n3;
			}
			
		if((maior % n2 == 0)&&(maior % n3 ==0)) {
			result = maior;
			maior++;
			return result;	
		}	
	  }
	}
	public static int MDC (int n3, int n2, int maior) {
		int result=1;
		
		if(n2 > n3) {
			maior = n2;
		}
		else {
			maior = n3;
		}
		
			for(int i = 2; i <= maior;i++) {
		if((n2 % i == 0)&&(n3 % i ==0)) {
			n2=n2/i;
			n3=n3/i;
			
			result = result*i;	
		}
	   }
		return result;
	  }
	

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int n1,n2,n3,MMC2,MDC2,maior;
		
		System.out.println("1. MMC");
		System.out.println("2. MDC");
		System.out.println("Informe o numero: ");
		n1=entrada.nextInt();
		
		
		
		switch(n1) {
		
		case 1:
			System.out.println("informe dois numero: ");
			n2=entrada.nextInt();
			n3=entrada.nextInt();
			
			if(n2 > n3) {
				maior = n2;
			}
			else {
				maior = n3;
			}
			MMC2= MMC(maior,n2,n3);
			System.out.println(MMC2);
			break;
				
		case 2:
			System.out.println("informe dois numero: ");
			n2=entrada.nextInt();
			n3=entrada.nextInt();
			
			if(n2 > n3) {
				maior = n2;
			}
			else {
				maior = n3;
			}
			
			MDC2=MDC(n3, n2, maior);
			System.out.println(MDC2);
			break;
		}

	}

}
