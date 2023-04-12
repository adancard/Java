package pacote;

public class Livro {
	
	private String nome;
	private String titulo;
	private int numero;
	
	
	public void Mostrar() {
		
		System.out.println(getTitulo());
		System.out.println(getNome());
		System.out.println(getNumero());
			
	}
	
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	

}
