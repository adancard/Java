package princi;

import java.util.Scanner;
import obj_direto_exe.calc_cil;

public class Prin_cil {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		calc_cil area = new calc_cil();

		System.out.println("informe a altura");
		area.setAlt(entrada.nextDouble());

		System.out.println("informe o raio");
		area.setRaio(entrada.nextDouble());

		System.out.println("esta eh sua area");
		System.out.println((float) area.getareacil());

		System.out.println("este eh seu volume");
		System.out.println((float) area.getareacil());

	}

}
