package entidade;

public class Aluno {

	private String nome;
	private int matricula;
	private int idade;
	private String informacao;

	public Aluno(String nome, int matricula, int idade, String informacao) {

		this.nome = nome;
		this.matricula = matricula;
		this.idade = idade;
		this.informacao = informacao;

	}

	public String exibir() {

		return "Nome: " + nome + " Idade: " + idade + " Numero da matricula " + matricula + "\n"
				+ informacao.toString();

	}

	public String getnome() {

		return nome;

	}

	public String getinformacao() {

		return informacao;

	}

	public int getidade() {

		return idade;

	}

	public int getmatricula() {

		return matricula;

	}

}
