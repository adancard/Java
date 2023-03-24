package princi;

import java.util.Scanner;
import obj_direto_exe.Calc_cir;

public class Princi_cir {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		Calc_cir area = new Calc_cir();
		
		System.out.println("Informe o raio");
		area.setRaio(entrada.nextDouble());
		
		
		System.out.println("esta eh a area do circulo");
		System.out.println((float)area.getareacir());
		
		System.out.println("este eh o volume do circulo");
		System.out.println((float)area.getpericir());

	}

}
