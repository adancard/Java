package entidades;

public class Gerente extends Funcion�rio {

	public Gerente (String nome,String matricula,float salario) {
		
		super(matricula,nome,salario);
		
	}
	
	public void tostring() {
		
		System.out.println("Gerente: "+getNome());
		System.out.println("Matricula: "+getMatricula());
		System.out.println("Salario: "+calculasalario());
		System.out.println(" ");
		
	}
	
	public float calculasalario() {
		
		return getSalario()*2;
		
	}
	
	
}
