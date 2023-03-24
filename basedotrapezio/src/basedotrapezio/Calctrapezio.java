package basedotrapezio;
import java.util.Scanner;

public class Calctrapezio {

	public static void main(String[] args) {
	 Scanner entrada = new Scanner (System.in);  //scanner = entrada 
		 float base1,base2,altura,resto; // decarando variaveis
		 
	    System.out.println("digite base maior: "); 
		 base1 = entrada.nextFloat(); // pegando a resposta da pergunta e colocando na variavel base1 ou base maior 
		System.out.println("digite base menor: "); 
		 base2 = entrada.nextFloat(); 
		System.out.println("digite a altura ");
		 altura = entrada.nextFloat(); 
		 
		 resto = (base1+base2)*altura / 2; // fazendo a conta da area
		System.out.print(resto); // mostrar o resultado
		 entrada.close();		

	}
	

}