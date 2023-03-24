package ifelse;
import java.util.Scanner;

public class Notinha {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
	  float nota1,nota2,media;
	  System.out.println("informe a primeira nota: ");
	  nota1=entrada.nextFloat();
	  System.out.println("informe a segunda nota: ");
	  nota2=entrada.nextFloat();
	  
	 media= (nota1+nota2)/2;
	 
	 System.out.println(media);
	}

}
