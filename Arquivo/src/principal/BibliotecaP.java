package principal;

import entidades.Biblioteca;
import entidades.Biblioteca.classificacao;

public class BibliotecaP {

	public static void main(String[] args) {
		
		Biblioteca bi = new Biblioteca(12,"Peter Pan",200,"Adan","Sei la",classificacao.AVENTURA);
		bi.gravararquivo();
	}
	
}
