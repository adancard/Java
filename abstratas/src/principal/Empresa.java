package principal;

import entidades.Vendedor;
import entidades.Assistente;
import entidades.Gerente;

public class Empresa {
	
	public static void main(String[] args) {
		Vendedor vend = new Vendedor("felipe","nao tem",2,1);
		Assistente ass = new Assistente("leo","tem",1);
		Gerente geren = new Gerente("tem todas","adan",1000);
		
		vend.tostring();
		ass.tostring();
		geren.tostring();
		
		
	}

}
