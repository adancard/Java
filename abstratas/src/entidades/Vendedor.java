package entidades;

public class Vendedor extends Funcionário {
	
	private float comissao;

	public Vendedor(String nome,String matricula,float salario,float comissao) {
		
		super(nome,matricula,salario);
		this.comissao=comissao;
		
	}
	
	public void tostring() {
		
		System.out.println("Vendedor: "+getNome());
		System.out.println("Matricula: "+getMatricula());
		System.out.println("Salario: "+calculasalario());
		System.out.println(" ");
		
	}
	
	public float calculasalario() {
		
		return getSalario()+comissao;
	}
	
}
