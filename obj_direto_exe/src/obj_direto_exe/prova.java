package obj_direto_exe;

public class prova {

	private String nome;
	private double nota;
	private double peso;

	// metodo

	public double gettotal() {

		return ((nota * peso) / peso);

	}

	public String getnome() {

		return (nome);

	}

	// get e set
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

}
