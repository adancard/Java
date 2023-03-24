package While;

import java.util.Scanner;

public class menos_um_dois_ponto_zero {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int n,soma=0,media=0,quantidade=0,maior,menor;
		
		while(true) {
		System.out.println("numero");
		n=entrada.nextInt();
		
		if (n == -1) {
			System.out.println(soma);
			System.out.println(quantidade);
			System.out.println(media);

			break;
		}
		else {
			soma=n+n;
			quantidade=quantidade+1;
			media=(n+n)/quantidade;

			
			
		}
		}

	}

}
