package numerointeiro;
import java.util.Scanner;

public class numero {

	public static void main(String[] args) {
		int numero, resto1, resto2;
		Scanner ler = new Scanner(System.in);
		System.out.println("informe um numero: ");
		numero = ler.nextInt();
		
       resto1 = numero - 1;
       resto2 = numero + 1;
       
      System.out.println(resto1);
      System.out.println(numero);
      System.out.println(resto2);
      ler.close();

    }

}
