package ifelse;
import java.util.Scanner;

public class triangulo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
	   int ladoA, ladoB, ladoC; // definindo variaveis
         System.out.println("informe o lado A do triangulo: ");
          ladoA = entrada.nextInt(); // armazenando resposta do usuario
         System.out.println("informe o lado B do triangulo: ");
          ladoB = entrada.nextInt();
         System.out.println("informe o lado C do triangulo: ");
          ladoC = entrada.nextInt();
         
         if (ladoA == ladoB && ladoA== ladoC && ladoB == ladoC) { 
        	 System.out.println("este triangulo eh equilatero");
         }
         
         else if (ladoA != ladoB && ladoA== ladoC && ladoB != ladoC) {
        	 System.out.println("este triangulo eh escaleno");
         }
         
         else {
        	 System.out.println("este triangulo eh isosceles");
         }
	}
         

}
