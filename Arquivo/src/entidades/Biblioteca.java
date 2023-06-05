package entidades;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Biblioteca {
	
	private int codigoL;
	private String titulo;
	private int numeroP;
	private String autor;
	private String editora;
	private classificacao clas;
	
	
	public enum classificacao{
		
		ROMANCE("Livro de romance"),
		AVENTURA("Livro de aventura"),
		FICCAO("livro de ficcao"),
		TECNICO("Livro tecnico");
		
		private String descricao;
		
		classificacao (String descricao){
			
			this.descricao=descricao;
			
		}

		public String getDescricao() {
			return descricao;
		}
		
		
	
		
	}
	
	public Biblioteca (int codigoL,String titulo,int numeroP,String autor,String editora, classificacao clas) {
		
		this.codigoL=codigoL;
		this.titulo=titulo;
		this.numeroP=numeroP;
		this.autor=autor;
		this.editora=editora;
		this.clas=clas;
		
		
	}
	
	
	public void gravararquivo() {

		try {
			FileWriter fileWriter = new FileWriter("livro.csv", true);
			fileWriter.write("\n"+"Codigo do livro "+ codigoL + ", \n" + "Nome do Livro: " + titulo + ", \n" + "Numero de paginas: "
					+ numeroP + ", \n" + "Autor: " + autor + ", \n" + clas + "\n");
			fileWriter.close();
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo nao encontrado: " + e.getMessage());
		} catch (IOException e) {
			System.out.println("Excecao: " + e.getMessage());
		}
	}
	
	

}
