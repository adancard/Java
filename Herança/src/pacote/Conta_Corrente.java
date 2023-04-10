package pacote;

public class Conta_Corrente extends Conta_Bancaria {

	private float limite = 100;
	private float saque;
	private float saldoC;
	
	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}
	public float getSaque() {
		return saque;
	}

	public void setSaque(float saque) {
		this.saque = saque;
	}

	public float getSaldoC() {
		return saldoC;
	}

	public void setSaldoC(float saldoC) {
		this.saldoC = saldoC;
	}
	
	public Conta_Corrente(String Nocliente, int Nconta, float saldo, float limite) {
		super(Nocliente, Nconta, saldo);
		this.limite = limite;
	}
	
	@Override
	
	public void sacarC() {
		
		if(saldoC>limite) {
			
			System.out.println("Passou do limite");
			
		}
		else {
			
			saldoC=(getSaldo()-getSacar());		
			
			
		}
		
	}

	public void depositarC() {
		
		saldoC=saldoC+getDepo();	
		
	}
	



}
