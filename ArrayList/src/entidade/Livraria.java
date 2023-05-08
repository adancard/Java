package entidade;

import java.util.ArrayList;

public class Livraria extends Livro {
	
	ArrayList<String> nomes = new ArrayList<String>();
	ArrayList<Integer> codigos = new ArrayList<Integer>();
	ArrayList<String> autores = new ArrayList<String>();
	ArrayList<Integer> quantidade = new ArrayList<Integer>();

	
	public void getname() {
		
	nomes.add(getNome());
	
		
	}
	
	public void getautor() {
		
	autores.add(getAutor());
		
	}
	
	public void getcodigos() {
		
	codigos.add(getCodigo());
		
	}
	
	public void getestoque() {
		
	quantidade.add(getEstoque());
		
	}
	
	public void Remover() {
		
		System.out.println("Remover nome do livro");
		nomes.remove(getNome());
		
		System.out.println("Remover Autor do livro");
		autores.remove(getAutor());
		
		System.out.println("Remover codigo do livro");
		codigos.remove(getCodigo());
		
		System.out.println("Remover Estoque do livro");
		quantidade.remove(getEstoque());
		
		
	}
	
	public void mostrar() {
		
		for(int i = 0; i< nomes.size(); i++) {
			System.out.printf("%s\n",nomes.get(i));
		}
		
		for(int i = 0; i< autores.size(); i++) {
			System.out.printf("%s\n",autores.get(i));
		}
		
		for(int i = 0; i< codigos.size(); i++) {
			System.out.printf("%s\n",codigos.get(i));
		}
		
		for(int i = 0; i< quantidade.size(); i++) {
			System.out.printf("%s\n",quantidade.get(i));
		}
		
	}





}
