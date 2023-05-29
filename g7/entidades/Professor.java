package entidades;

public class Professor extends Pessoa {
	private String especialidade;
	Disciplina disciplina;
	private String periodo;

	// Construtor

	public Professor(String nome, long cpf, String especialidade, String periodo, Disciplina disciplina) {
		super(nome, cpf);
		this.especialidade = especialidade;
		this.disciplina = disciplina;
		this.periodo = periodo;
	}

	/**
	 * metodo para exibir as informacoes de professor
	 */
	@Override
	public void exibirInformacoes() {
		System.out.println("Nome: " + this.nome);
		System.out.println("CPF: " + this.cpf);
		System.out.println("Especialidade: " + this.especialidade);
		System.out.println("Periodo: " + this.periodo);
		System.out.println("Disciplina: " + this.disciplina);
	}

}