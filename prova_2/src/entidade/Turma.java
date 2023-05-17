package entidade;

import java.util.ArrayList;

public class Turma {
	
	private String nome;
	private ArrayList<String> listadealunos = new ArrayList<String>();
	
	public void addalunos(String nome) {
		
			listadealunos.add(nome);
		
	}
	
	public void removealunos(String nome) {
		
		listadealunos.remove(nome);
		
	}
	
	
	public void alterarNota(int indice,String nome){

	    if(indice >= 0 && indice < listadealunos.size()){

	    	listadealunos.set(indice, nome);
	    } 
	}

	public void tostring() {
		
		for(int i = 0; i< listadealunos.size(); i++) {
			System.out.println(listadealunos.get(i));
		}
		
	}
		
}


