package entidades;

public class Livro extends Estoque {

	private int Nid;
	private String Na;
	private String tema;
	private String editora;
	private int num;
	private int ano;

	public Livro(int Nid, String Na, String tema, String editora, int num, int ano, String nome, float preco,
			float imposto) {

		super(nome, preco, imposto);
		this.ano = ano;
		this.editora = editora;
		this.Na = Na;
		this.Nid = Nid;
		this.num = num;
		this.tema = tema;

	}

	@Override
	public float calcularpreco() {

		return (float) (getPreco() + getImposto() + 0.02);

	}

	@Override

	public String tostring() {

		return "Nome do Auto: " + Na + '\n' + "Tema: " + tema + '\n' + "editora: " + editora
		+ '\n' +"ID: "+Nid+'\n'+ "Numero de paginas: " + num + '\n' + "Ano de Pubicacao: " + ano +'\n'+ "Preco: " + getPreco() + '\n'
		+ "Imposto: " + getImposto()+'\n';

	}

	public int getNid() {
		return Nid;
	}

	public String getNa() {
		return Na;
	}

	public String getTema() {
		return tema;
	}

	public String getEditora() {
		return editora;
	}

	public int getNum() {
		return num;
	}

	public int getAno() {
		return ano;
	}

}
