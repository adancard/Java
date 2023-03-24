package While;
import java.util.Scanner;

public class nota_3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		 int nota1,nota2,nota3,media;
		 
		 System.out.println("informe a primeira nota: ");
		 nota1=entrada.nextInt();
		 System.out.println("informe a segunda nota: ");
		 nota2=entrada.nextInt();
		 System.out.println("informe a terceira nota: ");
		 nota3=entrada.nextInt();
		 
		 while(true) {
			 if ((nota1 <= 10 && nota1 >=0) && (nota2 <= 10 && nota2 >=0) && (nota3 <= 10 && nota3 >= 0)) {
				 media = (nota1+nota2+nota3)/3;
				 System.out.println(media);
				 break;
		 }
			 else {
				 System.out.println("O numero tem que estar entre 0 e 10");
				 
				 System.out.println("informe a primeira nota: ");
				 nota1=entrada.nextInt();
				 System.out.println("informe a segunda nota: ");
				 nota2=entrada.nextInt();
				 System.out.println("informe a terceira nota: ");
				 nota3=entrada.nextInt();
				 
			 }
           }
		 entrada.close();
         }
       }