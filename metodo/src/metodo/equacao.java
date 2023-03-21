package metodo;

import java.util.Scanner;

public class equacao {
	
	public static int delta1 ( int a, int b ,int c) {
		int delta;
		double Result = Math.pow(b, 2);
		delta=(int)Result-4*a*c;
		return delta;
	}
	
	public static int ultimo (int delta, int a, int b) {
		int result;
		 double resultado = Math.sqrt(delta);
		result= -b + (int) resultado/2*a;
		return result;
	}
	public static int ultimonegativo (int delta, int a, int b) {
		int result;
		 double resultado = Math.sqrt(delta);
		result= ((-b) - (int) resultado)/2*a;
		return result;
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int a,b,c,resultdelta,y,y2;
		
		System.out.println("informe o A ,B,C");
		a=entrada.nextInt();
		b=entrada.nextInt();
		c=entrada.nextInt();
		
		resultdelta= delta1 (a,b,c);
		
		System.out.println("Resultado de delta: "+resultdelta);
		
		y=ultimo(resultdelta, a, b);
		
		System.out.println("Resultado de tudo positivo: "+y);
		
		y2=ultimonegativo(resultdelta, a, b);
		
		System.out.println("Resultado de tudo negativo: "+y2);

	}

}
