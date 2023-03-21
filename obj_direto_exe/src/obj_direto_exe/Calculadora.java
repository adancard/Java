package obj_direto_exe;

public class Calculadora {

	private int num1;
	private int num2;

	// medoto
	public int getadicao() {

		return (num1 + num2);

	}

	public int getsub() {

		return (num1 - num2);

	}

	public int getdivi() {

		return (num1 / num2);
		
	}

	public int getmult() {

		return (num1 * num2);

	}

	public int getraiz() {

		double raiz = Math.sqrt(num1);

		return ((int) raiz);

	}

	public int getpo() {

		double expo = Math.pow(num1, num2);

		return ((int) expo);

	}

	public int getloga() {

		double loga = Math.log(num1);
		double base = Math.log(num2);

		return ((int) loga / (int) base);

	}

	// get e set
	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

}
