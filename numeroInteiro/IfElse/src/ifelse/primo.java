package ifelse;

import java.util.Scanner;

public class primo {

	public static void main(String[] args) {
	     Scanner entrada = new Scanner(System.in);
	     int numero,resto,resto1;
	     
	     System.out.println("informe o numero: ");
	     numero=entrada.nextInt();
	    
	     resto = numero % 2;
	     
	     if (resto == 0) {
	    	 System.out.println("primo");	 
	     }
	     else {
	    	 System.out.println("nao primo");
	     }
	     

	}

}
