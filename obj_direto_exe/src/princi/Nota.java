package princi;

import java.util.Scanner;
import obj_direto_exe.prova;

public class Nota {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		prova media = new prova ();
		
		
		
		System.out.println("Informe o nome");
		media.setNome(entrada.next());
		
		System.out.println("informe a nota");
		media.setNota(entrada.nextDouble());
		
		System.out.println("Informe o peso");
		media.setPeso(entrada.nextDouble());
		
		
		System.out.println("esta eh a media final, "+ media.gettotal());

	}

}
