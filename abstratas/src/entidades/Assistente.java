package entidades;

public class Assistente extends Funcionário {
	
	public Assistente (String nome,String matricula,float salario) {
		
		super(nome,matricula,salario);
		
	}
	
	public void tostring() {
		
		System.out.println("Assistente: "+getNome());
		System.out.println("Matricula: "+getMatricula());
		System.out.println("Salario: "+calculasalario());
		System.out.println(" ");
		
	}
	
	public float calculasalario() {
		
		return getSalario();
		
	}

}
