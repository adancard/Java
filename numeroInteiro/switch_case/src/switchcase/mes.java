package switchcase;

import java.util.Scanner;

public class mes {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int mes;
		
		System.out.println("informe o mes: ");
		mes = entrada.nextInt();
		
		switch (mes) {
		case 2:
			System.out.println("28 dias");
	        break;
		case 4:
			System.out.println("30 dias");
			break;
		case 6:
			System.out.println("30 dias");
			break;
		case 9:
			System.out.println("30 dias");
			break;
		case 11:
			System.out.println("30 dias");
			break;
		case 1:
			System.out.println("31 dias");
			break;
		case 3:
			System.out.println("31 dias");
			break;
		case 5:
			System.out.println("31 dias");
			break;
		case 7:
			System.out.println("31 dias");
			break;
		case 8:
			System.out.println("31 dias");
			break;
		case 10:
			System.out.println("31 dias");
			break;
		case 12:
			System.out.println("31 dias");
			break;
			default:
			System.out.println("codigo invalido");
			break;
		}
		

	}

}
