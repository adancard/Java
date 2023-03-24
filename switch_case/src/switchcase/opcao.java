package switchcase;

import java.util.Scanner;

public class opcao {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numero,n1,n2,media,sub,multi,sub1,divi;
		
		System.out.println("Escolha uma opcao \n");
		System.out.println("1.Fazer media");
		System.out.println("2.Fazer diferenca");
		System.out.println("3.Produto entre digitados");
		System.out.println("4.Divisao dos numeros \n");
		System.out.println("Escolha uma opcao");
		numero = entrada.nextInt();
		
		System.out.println("Escolha o primeiro  numero");
		n1 = entrada.nextInt();
		System.out.println("escolha o segundo  numero");
		n2 = entrada.nextInt();

		switch (numero) {
		case 1:
			media = (n1+n2)/2;
			System.out.println(media);
			break;
		case 2:
			if (n1>n2) {
				sub1 = (n1-n2);
				System.out.println(sub1);
			}
			else {
				sub = n2-n1;
				System.out.println(sub);
			}
			break;
		case 3:
			multi= n1*n2;
			System.out.println(multi);
			break;
		case 4:
			if (n1 == 0) {
				System.out.println("divisao por 0");
			}
			else if (n2 == 0) {
				System.out.println("divisao por 0");
			}
			else {
				divi= n1/n2;
				System.out.println(divi);
			}
			break;
			default:
				System.out.println("nao existe essa opcao");
				break;
			
		}
		entrada.close();
		
	}

}
