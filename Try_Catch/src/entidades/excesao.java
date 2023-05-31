package entidades;

public class excesao{
	
	
	
	public void excessao (int n,int indice) throws numeroex {
		
		if(n<=0 || indice <=0){
			
			throw new numeroex("Digite numeros positivos");
			
		}
		
	}

}
