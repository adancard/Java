package entidades;

public class ContaCorrente implements ContaBancaria {

	private float saldo = 1000;
	public float saque;
	public float depositar;
	
	
	public ContaCorrente(float saque,float depositar) {
		this.depositar=depositar;
		this.saque=saque;
		
	}
	
	public String getNumeroDaConta() {
		
		return "904237825";
		
	}
	
	public float getSaldo() {
		
		return saldo;
		
	}
	
	public float  depositar() {
		
		return saldo + depositar;
		
	}
	
	public float  sacar() {
		
		return saldo - saque;
		
	}
	
	public void tostring() {
		
		System.out.println("Numero Conta: ");
		System.out.println(getNumeroDaConta());
		System.out.println("Saldo: ");
		System.out.println(getSaldo());
		System.out.println("Depositar: ");
		System.out.println(getDepositar());
		System.out.println("Saldo da conta atual: ");
		System.out.println(depositar());
		System.out.println(" ");
		
	}
	
	public void tostring1() {
		
		System.out.println("Numero Conta: ");
		System.out.println(getNumeroDaConta());
		System.out.println("Saldo: ");
		System.out.println(getSaldo());
		System.out.println("Sacar: ");
		System.out.println(getSaque());
		System.out.println("Saldo da conta atual: ");
		System.out.println(sacar());
		
	}
	

	public float getSaque() {
		return saque;
	}

	public float getDepositar() {
		return depositar;
	}
	
	
	
	
}
