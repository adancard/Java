package princi;

import java.util.Scanner;
import obj_direto_exe.piramideq;

public class Piramide {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		piramideq area = new piramideq ();
		
		System.out.println("informe a altura");
		area.setAlt(entrada.nextFloat());
		
		System.out.println("informe o lado");
		area.setLado(entrada.nextFloat());
		
		System.out.println("esta eh a area");
		System.out.println(area.getArea());
		
		System.out.println("este eh o volume");
		System.out.println(area.getVolume());
		
		entrada.close();
		
	}

}
