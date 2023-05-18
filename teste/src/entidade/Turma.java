package entidade;

import java.util.ArrayList;

public class Turma {
	
	//declarando variaveis
	private String nome;
	//criando array list de alunos
	private ArrayList<String> listadealunos = new ArrayList<String>();
	
	//adicionar alunos
	public void addalunos(String nome) {
		
			listadealunos.add(nome);
		
	}
	
	//remover alunos
	public void removealunos(String nome) {
		
		listadealunos.remove(nome);
		
	}
	
	
	//alterar nome dependo do indice
	public void alterarNome(int indice,String nome){

	    if(indice >= 0 && indice < listadealunos.size()){

	    	listadealunos.set(indice, nome);
	    } 
	}

	//listar os alunos
	public void mostrarAlunos() {
		
		for(int i = 0; i< listadealunos.size(); i++) {
			System.out.println(i+ " "+ listadealunos.get(i));
		}
		
	}
		
}


