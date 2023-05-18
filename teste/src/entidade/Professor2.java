package entidade;

import java.util.ArrayList;

public class Professor2 extends pessoa {

	// declarando variaveis
	private int escolha;
	private String espe;
	private String perio;
	// declarando metodo enum
	private diciplina descricao;
	private ArrayList<String> info = new ArrayList<String>();
	private ArrayList<Integer> cpf1 = new ArrayList<Integer>();

	// construtor
	public Professor2(String nome, int cpf) {

		super(nome, cpf);

	}

	// metodo enum
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

	public void addinfos() {

		info.add(nome);
		info.add(perio);
		info.add(espe);

	}

	public void addcpg() {

		cpf1.add(cpf);

	}

	public String getEspe() {
		return espe;
	}

	public void setEspe(String espe) {
		this.espe = espe;
	}

	public String getPerio() {
		return perio;
	}

	public void setPerio(String perio) {
		this.perio = perio;
	}

	public int getEscolha() {
		return escolha;
	}

	public void setEscolha(int escolha) {
		this.escolha = escolha;
	}

	public void mostar() {

		for (int i = 0; i < info.size(); i++) {
			System.out.println(info.get(i));
		}

		for (int i = 0; i < cpf1.size(); i++) {
			System.out.println(cpf1.get(i));
		}

		System.out.println(descricao.getDescricao());

	}

	public void escolhaenum() {

		if(escolha == 1) {
			
			descricao = diciplina.FPOO;
			
		}
		else if(escolha == 2) {
			
			descricao= diciplina.LM;
			
		}
		
		else if (escolha == 3) {
			
			descricao = diciplina.REDES;
			
		}
		
		else if(escolha == 4) {
			
			descricao = diciplina.SO;	
		}

	}

	
	

	@Override
	public void tostring() {

		System.out.println("Nome: " + nome);
		System.out.println("CPF: " + cpf);
		System.out.println("Especialidade: " + espe);
		System.out.println("Periodo: " + perio);
		System.out.println("Descricao: " + descricao.getDescricao());

	}

}
