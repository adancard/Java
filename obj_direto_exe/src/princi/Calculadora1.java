package princi;

import java.util.Scanner;

import obj_direto_exe.Calculadora;

public class Calculadora1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Calculadora calc = new Calculadora();
		int n;

		while (true) {
			System.out.println("1. Calculo da adicao");
			System.out.println("2. Calculo da subtracao");
			System.out.println("3. Calculo da divisao");
			System.out.println("4. Calculo da multiplicacao");
			System.out.println("5. Calculo da raiz quadrada");
			System.out.println("6. Calculo da potencia");
			System.out.println("7. Calculo da expotencial");
			System.out.println("8. Calculo da logaritmo");
			System.out.println("9. Sair");
			n = entrada.nextInt();

			if (n == 9) {
				System.out.println("Saindo...");
				break;
			}

			else {
				switch (n) {

				case 1:

					System.out.println("Informe o primeiro numero");
					calc.setNum1(entrada.nextInt());
					System.out.println("Informe o segundo numero");
					calc.setNum2(entrada.nextInt());

					System.out.println("A soma eh: " + calc.getadicao());
					break;

				case 2:

					System.out.println("Informe o primeiro numero");
					calc.setNum1(entrada.nextInt());
					System.out.println("Informe o segundo numero");
					calc.setNum2(entrada.nextInt());

					System.out.println("A subtracao eh: " + calc.getsub());
					break;

				case 3:

					System.out.println("Informe o primeiro numero");
					calc.setNum1(entrada.nextInt());
					System.out.println("Informe o segundo numero");
					calc.setNum2(entrada.nextInt());

					while (true) {
						if (calc.getNum1() != 0 && calc.getNum2() != 0) {

							System.out.println(calc.getdivi());
							break;

						} else {
							System.out.println("digite um numero diferente de 0");
							System.out.println("Informe o primeiro numero");
							calc.setNum1(entrada.nextInt());
							System.out.println("Informe o segundo numero");
							calc.setNum2(entrada.nextInt());
						}
					}
					break;

				case 4:

					System.out.println("Informe o primeiro numero");
					calc.setNum1(entrada.nextInt());
					System.out.println("Informe o segundo numero");
					calc.setNum2(entrada.nextInt());

					System.out.println(calc.getmult());
					break;

				case 5:

					System.out.println("Informe o  numero");
					calc.setNum1(entrada.nextInt());

					System.out.println(calc.getraiz());
					break;

				case 6:

					System.out.println("Informe o primeiro numero");
					calc.setNum1(entrada.nextInt());
					System.out.println("Informe o expoente");
					calc.setNum2(entrada.nextInt());

					System.out.println(calc.getpo());
					break;

				case 7:

					System.out.println("Informe o primeiro numero");
					calc.setNum1(entrada.nextInt());
					System.out.println("Informe o segundo numero");
					calc.setNum2(entrada.nextInt());

					System.out.println(calc.getpo());
					break;

				case 8:

					System.out.println("Informe o primeiro numero");
					calc.setNum1(entrada.nextInt());
					System.out.println("Informe o segundo numero");
					calc.setNum2(entrada.nextInt());

					System.out.println(calc.getloga());
					break;

				}

			}
			entrada.close();

		}

	}

}
