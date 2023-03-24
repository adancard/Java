package While;

import java.util.Scanner;

public class idade {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int n1,n2,n3,n4,n5,idade=0;
		
		System.out.println("informe sua idade");
		n1=entrada.nextInt();
		System.out.println("informe sua idade novamente");
		n2=entrada.nextInt();
		System.out.println("informe sua idade novamente");
		n3=entrada.nextInt();
		System.out.println("informe sua idade novamente");
		n4=entrada.nextInt();
		System.out.println("informe sua idade novamente");
		n5=entrada.nextInt();
		
		if(n1>=18) {
			idade=idade+1;
		}
		if(n2>=18) {
			idade=idade+1;
		}
		if(n3>=18) {
			idade=idade+1;
		}
		if(n4>=18) {
			idade=idade+1;
		}
		if(n5>=18) {
			idade=idade+1;
		}
		System.out.println("dentre as 5 pessoas essas sao as que tem 18:");
		System.out.println(idade);
		entrada.close();
	}

}
