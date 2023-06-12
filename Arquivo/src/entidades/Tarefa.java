package entidades;

public class Tarefa {

	private int id;
	private String nome;
	private String descricao;
	private String tempo;

	// contrutor
	public Tarefa() {

	}
	
	public void Mostrar() {
		
		System.out.println("ID: "+this.id);
		System.out.println("Nome: "+this.nome);
		System.out.println("Descricao: "+this.descricao);
		System.out.println("Tempo Gasto: "+this.tempo);
		
	}

	// gets and sets
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getTempo() {
		return tempo;
	}

	public void setTempo(String tempo) {
		this.tempo = tempo;
	}

}
