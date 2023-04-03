package obj_direto_exe;

public class Sistema_nota {

	private String aluno;
	private float notas;
	private int numero;
	private float soma = 0;
	

	
    public float media() {
    	
    	soma=notas+soma;
    	
    	return soma/2;
    	
    }
	
	
	
	

	public String getAluno() {
		return aluno;
	}

	public void setAluno(String aluno) {
		this.aluno = aluno;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public float getNotas() {
		return notas;
	}

	public void setNotas(float notas) {
		this.notas = notas;
	}
}