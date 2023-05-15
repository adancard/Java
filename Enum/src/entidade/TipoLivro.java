package entidade;

public enum TipoLivro {
	
		ROMANCE("romance"),
		FICCCAO_CIENTIFICA("ficcao cientifica"),
		AVENTURA("aventura"),
		TUTORIAL("tutorial");
	
	private String nome;
	
	private TipoLivro(String nome) {
		
		this.nome=nome;
		
	}

	public String getNome() {
		return nome;
	}
		

}
