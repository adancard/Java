package principal;

import entidade.Pedido;
import entidade.Produto;

public class Louja {
	
	public static void main(String[] args) {
		Pedido pedido = new Pedido(20,10,2004,(float) 20);
		Produto produto = new Produto("lanche",2,10,pedido.toString());
		
		System.out.println(produto.exibir());
		
	}

}
