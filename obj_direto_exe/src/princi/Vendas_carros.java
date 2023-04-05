package princi;

import java.util.Scanner;

import obj_direto_exe.Sistema_venda_carro;

public class Vendas_carros {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int[] array = new int[1];
		String[] nomes = new String[1];
		String[] carros = new String[1];
		int preco, parcela;
		Sistema_venda_carro venda = new Sistema_venda_carro();

		for (int i = 0; i < nomes.length; i++) {

			System.out.println("Nome do vendedor");
			nomes[i] = entrada.next();
			System.out.println("Nome do Carro");
			carros[i] = entrada.next();
			System.out.println("Preco: ");
			preco = array[i] = entrada.nextInt();
			venda.setPreco(preco);
			System.out.println("Quantidade de parcelas: ");
			parcela=entrada.nextInt();
			venda.setParcelas(parcela);
		}

		System.out.println("Nome do Vendedore: ");
		for (int i = 0; i < nomes.length; i++) {

			System.out.println(nomes[i]);
		}

		System.out.println("Nome do Carro vendido");
		for (int i = 0; i < nomes.length; i++) {

			System.out.println(carros[i]);
		}

		System.out.println("Precos:");
		for (int i = 0; i < array.length; i++) {

			System.out.println(array[i]);


		}
		
		venda.getparcela();
	
	}

}
