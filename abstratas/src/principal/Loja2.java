package principal;

import entidades.Caderno;
import entidades.Livro2;

public class Loja2 {
	
	public static void main(String[] args) {
		
		Caderno cader = new Caderno(10,200,"fabercasttle","caderno",20,1);
		Livro2 livro = new Livro2("Ciencia","adan","eu mesmo","livro",10,1);
		
//		cader.pagamento();
//		cader.informacao();
		
		livro.pagamento();
		livro.informacao();
		
		
		
		
	}

}
