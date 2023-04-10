package pacote;

public class Conta_Bancaria {
	
	private static int Nconta;
	private static String Nocliente;
	private static float saldo=0;
	private static float sacar;
	private static float depo;
	
	
	public Conta_Bancaria(String Nocliente, int Nconta, float saldo) {
		this.Nconta = Nconta;
		this.saldo = saldo;
	}


	public static void sacarB(){
		
		if (saldo<=0) {
			
			System.out.println("Nao eh possivel sacar");
			
		}
		
		else {
			
			saldo=saldo-sacar;
			
		}
		
	}
	
	
	public static void deposiB() {
		
		saldo=saldo+depo;
		
	}
	
	

	public static int getNconta() {
		return Nconta;
	}

	public static void setNconta(int nconta) {
		Nconta = nconta;
	}

	public static String getNocliente() {
		return Nocliente;
	}

	public static void setNocliente(String nocliente) {
		Nocliente = nocliente;
	}

	public static float getSaldo() {
		return saldo;
	}

	public static void setSaldo(float saldo) {
		Conta_Bancaria.saldo = saldo;
	}

	public static float getSacar() {
		return sacar;
	}

	public static void setSacar(float sacar) {
		Conta_Bancaria.sacar = sacar;
	}

	public static float getDepo() {
		return depo;
	}

	public static void setDepo(float depo) {
		Conta_Bancaria.depo = depo;
	}


	public void sacarC() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
	

}
