package obj_direto_exe;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Sistema_loja {

	Calendar c = Calendar.getInstance();
	private String nome_P;
	private Date data = c.getTime();
	private float peco;
	private String nome_C;

	ArrayList<Float> preco1 = new ArrayList<Float>();
	ArrayList<String> nome2 = new ArrayList<String>();
	ArrayList<String> nome1 = new ArrayList<String>();
	ArrayList<Date> data1 = new ArrayList<Date>();

	public void getdata() {
		DateFormat f = DateFormat.getDateInstance(DateFormat.SHORT);
		f.format(data);
		data1.add(data);
	}

	public void getnomep() {
		nome1.add(nome_P);
	}

	public void getnomec() {
		nome2.add(nome_C);
	}

	public void getpreco() {
		preco1.add(peco);
	}

	public void total() {

		System.out.println("Data:");
		for (int i = 0; i < data1.size(); i++) {
			System.out.printf("%s \n", data1.get(i));
		}
		System.out.println(" ");

		System.out.println("Nome Cliente:");
		for (int i = 0; i < nome2.size(); i++) {
			System.out.printf("%s \n", nome2.get(i));
		}
		System.out.println(" ");
		
		System.out.println("Nome Produto:");
		for (int i = 0; i < nome1.size(); i++) {
			System.out.printf("%s \n", nome1.get(i));
		}
		System.out.println(" ");
		
		System.out.println("Preco:");
		for (int i = 0; i < preco1.size(); i++) {
			System.out.printf("%s \n", preco1.get(i));
		}
		System.out.println(" ");

	}

	public String getNome_P() {
		return nome_P;
	}

	public void setNome_P(String nome_P) {
		this.nome_P = nome_P;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public float getPeco() {
		return peco;
	}

	public void setPeco(Float peco) {
		this.peco = peco;
	}

	public String getNome_C() {
		return nome_C;
	}

	public void setNome_C(String nome_C) {
		this.nome_C = nome_C;
	}

}
