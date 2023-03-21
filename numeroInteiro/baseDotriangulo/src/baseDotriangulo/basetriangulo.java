package baseDotriangulo;
import java.util.Scanner;

public class basetriangulo {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in); // Scanner = ler 
		float base, altura, resto; // delcarando variaveis
		System.out.println("infome a base: "); // fazendo a pergunta 
		base = ler.nextInt(); 
		System.out.println("infome a altura: ");
		altura =  ler.nextInt(); // armazenar o valor escrito na variavel altura 
		
		resto = base*altura / 2;// fazendo a conta da area
		System.out.println(resto); // mostrando o resultado 
	}

}
