package switchcase;

import java.util.Scanner;

public class estacao {

	public static void main(String[] args) {
	    Scanner entrada = new Scanner(System.in);
	    int numero;
	    
	    System.out.println("infome um numero de 1 a 4: ");
	     numero = entrada.nextInt();
	     
	     switch(numero) {
	     
	     case 1:
	    	 System.out.println("primavera");
	        break;
	     case 2:
	    	 System.out.println("Verao");
	        break;
	     case 3:
	    	 System.out.println("outono");
	    	 break;
	     case 4:
	    	 System.out.println("inverno");
	    	 default:
	    	 System.out.println("codigo invalido");
	    	 break;
	     }
	     entrada.close();

	}

}
