package entidade;

import java.util.ArrayList;


public class Aluno extends pessoa {
	//declarando variaveis
	private String codigo;
	private double nota;
	private double media=0; 
	//criando array list de tipo double
	private ArrayList<Double> notas = new ArrayList<Double>();
	//declarando metodo enum
	private diciplina descricao;

	
	//construtor
	public Aluno (String codigo,String nome,int cpf,diciplina descricao) {
		
		super(nome,cpf);
		this.codigo=codigo;
		this.descricao=descricao;

		
	}

	//metodo para adicionar notasS
	public void addnotas() {
		
		notas.add(nota);
		media=media+nota;
		
	}
	
	//metodo para remover nota dependendo do indice
	public void removerNota(int indice){

	    if(indice >= 0 && indice < notas.size()){

	    	notas.remove(indice);
	    } 
	}
	
	//alterar nome dependo do indice
	public void alterarNota(int indice,double nota){

	    if(indice >= 0 && indice < notas.size()){

	    	notas.set(indice, nota);
	    } 
	}
	
	//mostrar notas
	public void listarnota() {
		
		for(int i = 0; i< notas.size(); i++) {
		System.out.println(i+" "+notas.get(i));
		}
	}
	
	//fazer a media das notas
	public void listarmedia() {
		
		
		media=media/notas.size();
		if(media>=6) {
			
			System.out.println("Aprovado "+media);
			
		}
		else {
			
			System.out.println("Reprovado "+media);
			
		}
		
	}

	//gets e sets
	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	public String getCodigo() {
		return codigo;
	}
	
	//metodo enum
	public enum diciplina {

		FPOO("Programacao de orientacao de objeto"), LM("Linguagem de Marcacao"), SO("Sistema Operacional"),
		REDES("Redes");

		private String descricao;

		private diciplina(String descricao) {

			this.descricao = descricao;

		}

		public String getDescricao() {
			return descricao;
		}
	}
	
	@Override
	public void tostring() {
		
		System.out.println(nome);
		System.out.println(cpf);
		System.out.println(descricao.getDescricao());
		
	}

	
	

	



}
