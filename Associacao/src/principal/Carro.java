package principal;

import entidade.Motor;
import entidade.Pneu;
import entidade.Automovel;

public class Carro {
	
	public static void main(String[] args) {
		Motor motor = new Motor(24,1000);
		Pneu pneu = new Pneu("felipe",(float) 2.4);
		Automovel carro = new Automovel("mustang",12,motor.toString(),pneu.toString());
		
		System.out.println(carro.exibir());
		
	}

}
