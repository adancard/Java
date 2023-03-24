package princi;

import java.util.Scanner;
import obj_direto_exe.sistema_produto;

public class Produtos {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		sistema_produto produto = new sistema_produto();
		int n;
		
		while (true) {
			
			System.out.println("1. Adicionar Produto");
			System.out.println("2. Consultar quantidade");
			System.out.println("3. Remover Produto");
			System.out.println("4. Sair");
			System.out.println("Escolha a opcao: ");
			n=entrada.nextInt();
			
			if(n== 4) {
				System.out.println("Saindo...");
				break;
			}
			
			else {
				
				switch (n) {
				
				case 1:
					System.out.println("Insira o nome do Produto");
					produto.setProduto(entrada.next());
					produto.getname();
					break;
					
				case 2:
					produto.mostranome();
					break;
					
				case 3:
					System.out.println("Insira o nome do produto para Remover");
					produto.setProduto(entrada.next());
					produto.removename1();
					break;
				}
				
			}
			
			
			
		}
		entrada.close();
		

	}

}
