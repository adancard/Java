package princi;

import java.util.Scanner;

import obj_direto_exe.Calc;

public class area_do_quadrado {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Calc area = new Calc();

		System.out.println("Informe o lado: ");
		area.setLado(entrada.nextInt());

		System.out.println("este eh o perimetro");
		System.out.println(area.getperi());
		System.out.println("esta eh a area ");
		System.out.println(area.getarea());

		entrada.close();

	}

}
