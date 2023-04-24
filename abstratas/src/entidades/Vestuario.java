package entidades;

public class Vestuario extends Estoque {

	private int tamanho;
	private int ID;
	private String desc;

	public Vestuario(int ID, String desc, float preco, float imposto, String nome, int tamanho) {

		super(nome, imposto, preco);
		this.tamanho = tamanho;
		this.desc = desc;
		this.ID = ID;

	}

	@Override

	public float calcularpreco() {

		return (float) (getPreco() + getImposto() + 0.07);

	}

	@Override
	public String tostring() {

		return "Tamanho da Roupa: " + tamanho + '\n' + "ID: " + ID + '\n' + "Descricao: " + desc + '\n'
		+"Preco: "+getPreco()+'\n'+"Imposto: "+getImposto()+'\n'+ super.tostring();

	}

}
