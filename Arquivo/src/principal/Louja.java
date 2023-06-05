package principal;

import entidades.Vendas;
import entidades.Vendas.Formasdepagamentos;

public class Louja {



	public static void main(String[] args) {
		Vendas vend = new Vendas(2,"leite",5,5.50,Formasdepagamentos.CREDITO);
		Vendas vend2 = new Vendas(4,"arroz",1,10.50,Formasdepagamentos.DEBITO);
		vend.gravararquivo();
		vend2.gravararquivo();

	}

}
