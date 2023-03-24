package ifelse;

import java.util.Scanner;

public class contas {

	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	int n1,n2,soma,divisao,multiplicacao,sub;
	
	System.out.println("informe o primeiro numero: ");
	n1=entrada.nextInt();
	System.out.println("informe o segundo numero: ");
	n2=entrada.nextInt();

	soma = n1+n2;
	System.out.println("A soma eh:");
	System.out.println(soma);
	sub = n1-n2;
	System.out.println("A subtraçao eh:");
	System.out.println(sub);
	multiplicacao = n1*n2;
	System.out.println("A multiplicacao eh:");
	System.out.println(multiplicacao);
	if(n1 == 0) {
		System.out.println("nao eh possivel fazer por zero");
	}
	else if (n2 == 0) {
		System.out.println("nao eh possivel fazer por zero");
	}
	else {
		divisao = n1/n2;
		System.out.println("A divisao eh:");
		System.out.println(divisao);
	}
	entrada.close();

	}

}
