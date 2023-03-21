package switchcase;

import java.util.Scanner;

public class alimento {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
        int numero;
        
        System.out.println("informe o codigo do alimento de 1 a 15:");
        numero=entrada.nextInt();
        
        switch (numero) {
        case 1:
        	System.out.println("alimento nao perecivel");
        	break;
        case 2:
        	System.out.println("Alimento perecivel");
        	break;
        case 3:
        	System.out.println("Alimento perecivel");
        	break;
        case 4:
        	System.out.println("Alimento perecivel");
        	break;
        case 5:
        	System.out.println("Vestuario");
        	break;
        case 6:
        	System.out.println("Vestuario");
        	break;
        case 7:
        	System.out.println("Vestuario");
        	break;
        case 8:
        	System.out.println("Limpeza e Utensilios Domesticos");
        	break;
        case 9:
        	System.out.println("Limpeza e Utensilios Domesticos");
        	break;
        case 10:
        	System.out.println("Limpeza e Utensilios Domesticos");
        	break;
        case 11:
        	System.out.println("Limpeza e Utensilios Domesticos");
        	break;
        case 12:
        	System.out.println("Limpeza e Utensilios Domesticos");
        	break;
        case 13:
        	System.out.println("Limpeza e Utensilios Domesticos");
        	break;
        case 14:
        	System.out.println("Limpeza e Utensílios Domésticos");
        	break;
        case 15:
        	System.out.println("Limpeza e Utensílios Domésticos");
        	break;
        	default:
        	System.out.println("codigo invalido");
        	break;
        	
        }
	}

}
