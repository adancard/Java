package principal;

import java.util.Scanner;
import pacote.Vendedor;
import pacote.Adm;

public class Salario {
	public static void main(String[] args) {
		float salarioV,salarioA;
		int vendas,horas;
		Scanner entrada = new Scanner(System.in);
		Vendedor sala = new Vendedor();
		Adm sala1 = new Adm();
		
		
		System.out.println("informe o Salario do vendedor");
		salarioV=entrada.nextFloat();
		sala.setSalario(salarioV);
		System.out.println("Informe a Quantidade de vendas");
		vendas=entrada.nextInt();
		sala.setVendas(vendas);
		
		System.out.println("Salario do vendedor");
		sala.salarioV();
		
		System.out.println("informe o Salario do administrativo ");
		salarioA=entrada.nextFloat();
		sala1.setSalario(salarioA);
		System.out.println("Informe a Quantidade de hora extra");
		horas=entrada.nextInt();
		sala1.setVendas(horas);
		
		System.out.println("Salario do administrativo ");
		sala1.salarioA();
		
		
		
		
		
	}

}
