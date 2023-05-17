package entidade;

public class Professor extends pessoa {

	private String espe;
	private String perio;
	private diciplina descricao;

	public Professor(String nome, int cpf, String espe, String perio,diciplina descricao) {

		super(nome, cpf);
		this.espe = espe;
		this.perio = perio;
		this.descricao=descricao;

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

		System.out.println("Nome: "+nome);
		System.out.println("CPF: "+cpf);
		System.out.println("Especialidade: "+espe);
		System.out.println("Periodo: "+perio);
		System.out.println("Descricao: "+descricao.getDescricao());

	}

}
