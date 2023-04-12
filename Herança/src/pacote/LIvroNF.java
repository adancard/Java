package pacote;

public class LIvroNF extends Livro {
	
	private String tema;
	private String topico;
	
	
	public void Recomendar() {
		
		System.out.println("aaaa");
		
	}
	
	@Override
	public void Mostrar() {
		
		System.out.println("Autor: ");
		System.out.println(getNome());
		System.out.println("numero de paginas: ");
		System.out.println(getNumero());
		System.out.println("Titulo : ");
		System.out.println(getTitulo());
		System.out.println("Tema: ");
		System.out.println(getTema());
		System.out.println("topico: ");
		System.out.println(getTopico());
		
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	public String getTopico() {
		return topico;
	}

	public void setTopico(String topico) {
		this.topico = topico;
	}

}
