package pacote;

public class aluno extends nome {
	
	private String materia;
	
	
	
 public void mostrar() {
	 
	 System.out.println(getNome());
	 System.out.println(getIdade());
	 System.out.println(getMateria());
	 
 }
	
	
	
	

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}
	
	
	
	

}
