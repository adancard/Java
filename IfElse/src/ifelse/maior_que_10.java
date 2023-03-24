package ifelse;

import java.util.Scanner;

public class maior_que_10 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int n1,n2,soma;
      System.out.println("infome o primeiro numero: ");
      n1=entrada.nextInt();
      System.out.println("informe o segundo numero: ");
      n2=entrada.nextInt();
      
      soma=(n1+n2)*2;
      
      if(soma > 10) {
    	  System.out.println("O numero eh maior que 10");
      }
      else if (soma == 10) {
    	  System.out.println("O numero eh igual a 10");
      }
      else {
    	  System.out.println("O numero eh menor que 10");
      }
      
      

      entrada.close();
    	  
      }
	
	}

