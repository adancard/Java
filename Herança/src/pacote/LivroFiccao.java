package pacote;

public class LivroFiccao extends Livro {

	private String genero;
	private String subgenero;
	
	
	public void sinopse(){
		
		System.out.println("livro bao ");
		
	}
	
	public void Mostrar() {
		
		System.out.println("Autor: ");
		System.out.println(getNome());
		System.out.println("Titulo: ");
		System.out.println(getTitulo());
		System.out.println("Numero de paginas: ");
		System.out.println(getNumero());
		System.out.println("Genero: ");
		System.out.println(getGenero());
		System.out.println("Subgenero: ");
		System.out.println(getSubgenero());
		
	}
	
	

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getSubgenero() {
		return subgenero;
	}

	public void setSubgenero(String subgenero) {
		this.subgenero = subgenero;
	}

}
