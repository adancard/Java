package princi;

import java.util.Scanner;
import obj_direto_exe.sistema;

public class Vendas {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		sistema venda = new sistema();
		int n;

		System.out.println("informe o nome do produto");
		venda.setNomeItem(entrada.next());

		System.out.println("Informe o preco ");
		venda.setPreco(entrada.nextDouble());

		System.out.println("Informe a quantidade");
		venda.setQuanti(entrada.nextInt());

		System.out.println("aceita um desconto");
		System.out.println("1. sim");
		System.out.println("2. nao");
		n = entrada.nextInt();

		if (n == 1) {
			System.out.println("Insira o valor do disconto");
			venda.setDiscon(entrada.nextDouble());
			
			System.out.println("Nome do produto:");
			System.out.println(venda.getnome());
			System.out.println("Quantidade do produto:");
			System.out.println(venda.getQuanti());
			System.out.println("Total do produto com disconto:");
			System.out.println("R$"+venda.gettotaldis());
			System.out.println("Valor do disconto");
			System.out.println((int)venda.getDiscon()+"%");
		
		}
		else {
			System.out.println("Nome do produto:");
			System.out.println(venda.getnome1());
			System.out.println("Quantidade do produto:");
			System.out.println(venda.getQuanti());
			System.out.println("Total do produto:");
			System.out.println("R$"+venda.gettotal());
			
		}

	}

}
