package pacote;

public class Conta_Poupanca extends Conta_Bancaria{
	
	private int dataRendimento;
	private int diaDeRendimento;
	
	
	public int getDataRendimento() {
		return dataRendimento;
	}


	public void setDataRendimento(int dataRendimento) {
		this.dataRendimento = dataRendimento;
	}


	public int getDiaDeRendimento() {
		return diaDeRendimento;
	}


	public void setDiaDeRendimento(int diaDeRendimento) {
		this.diaDeRendimento = diaDeRendimento;
	}


	public Conta_Poupanca(String Nocliente, int Nconta, float saldo,int dataRendimento) {
		super(Nocliente, Nconta, saldo);
		this.dataRendimento = dataRendimento;
	}
	
	public void calcularNovoSaldo(float taxaDeRendimento, int diaDeRendimento) {
		float novoSaldo;
		
		this.diaDeRendimento = diaDeRendimento;
		
		if(dataRendimento == diaDeRendimento) {
			novoSaldo = (getSaldo() + (getSaldo()*(taxaDeRendimento/100)));
		}
	}
	
	

}
