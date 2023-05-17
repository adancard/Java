package entidade;

import java.util.ArrayList;


public class Aluno extends pessoa {
	
	private String codigo;
	private double nota;
	private double media=0; 
	private ArrayList<Double> notas = new ArrayList<Double>();
	private diciplina descricao;

	

	public Aluno (String codigo,String nome,int cpf,diciplina descricao) {
		
		super(nome,cpf);
		this.codigo=codigo;
		this.descricao=descricao;

		
	}

	public void addnotas() {
		
		notas.add(nota);
		media=media+nota;
		
	}
	
	public void removenotas() {
		
		notas.remove(nota);
		media=media-nota;
		
	}
	
	public void listarnota() {
		
		for(int i = 0; i< notas.size(); i++) {
			System.out.println(notas.get(i));
		}
	}
	
	public void listarmedia() {
		
		
		media=media/notas.size();
		if(media>=6) {
			
			System.out.println("Aprovado "+media);
			
		}
		else {
			
			System.out.println("Reprovado "+media);
			
		}
		
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	public String getCodigo() {
		return codigo;
	}
	
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
