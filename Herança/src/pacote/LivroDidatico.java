package pacote;

public class LivroDidatico extends Livro {
	
	private String diciplina;
	private int nivel;
	private String ano;


	public void compatibilidade() {
		
		if(getNivel() == 3) {
			
			System.out.println("nivel escolar Aprovado");
			Mostrar();
			
		}
		else {
			
			System.out.println("nao aprovado");
			
		}
			
	}
	
	@Override
	public void Mostrar() {
	
			System.out.println("Autor:");
			System.out.println(getNome());
			System.out.println("titulo do livro:");
			System.out.println(getTitulo());
			System.out.println("Numero de paginas:");
			System.out.println(getNumero());
			System.out.println("Diciplina: ");
			System.out.println(getDiciplina());
			System.out.println("Ano: ");
			System.out.println(getAno());
			System.out.println("Nivel de dificuldade:");
			System.out.println(getNivel());

	}

	public String getDiciplina() {
		return diciplina;
	}

	public void setDiciplina(String diciplina) {
		this.diciplina = diciplina;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}
	

}
