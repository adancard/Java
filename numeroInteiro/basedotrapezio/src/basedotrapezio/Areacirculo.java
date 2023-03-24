package basedotrapezio;
import java.util.Scanner;

public class Areacirculo {

	public static void main(String[] args) {
			Scanner entrada = new Scanner(System.in);
			 double  raio,resto2;
			System.out.println("informe o raio: ");
			 raio = entrada.nextDouble(); //pegando o numero do raio
			  double resto = Math.pow(raio,2); // o valor do raio elevado a 2
			  double pi = 3.14; // definindo PI
			    resto2 = pi*resto; // fazendo a conta (pi multiplicando o resto do raio)
			System.out.println("A area do circulo eh: ");
			System.out.println(resto2);
			
			entrada.close();
			
			//Para um resultado com mais precisão usar o comando math.pi
			
	}
}