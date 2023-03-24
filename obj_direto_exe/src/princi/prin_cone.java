package princi;

import java.util.Scanner;
import obj_direto_exe.cone;

public class prin_cone {

	public static void main(String[] args) {
		Scanner entrada = new Scanner ( System.in);
		cone area = new cone();
		
		System.out.println("Informe o raio");
		area.setRaio(entrada.nextDouble());

		
		System.out.println("Informe a geratriz");
		area.setGeratriz(entrada.nextDouble());
		
		System.out.println("Informe a altura");
		area.setAlt(entrada.nextDouble());
		
		System.out.println("Esta eh sua area");
		System.out.println((float)area.getarea());
		
		System.out.println("Este eh seu volume");
		System.out.println((float)area.getperi());

	}

}
