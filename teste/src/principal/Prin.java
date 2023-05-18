package principal;

import java.util.Scanner;

import entidade.Professor;
import entidade.Professor2;

public class Prin {
	
	
	public static void main(String[] args) {
		
		Professor2 prof = new Professor2("eduardo",34141);
		Scanner entrada = new Scanner(System.in);
		String a;
		int b;
		
		System.out.println("a");
		a=entrada.next();
		prof.setNome(a);
		System.out.println("a2");
		a=entrada.next();
		prof.setEspe(a);
		System.out.println("a3");
		a=entrada.next();
		prof.setPerio(a);
		prof.addinfos();
		System.out.println("b");
		b=entrada.nextInt();
		prof.setCpf(b);
		prof.addcpg();
		System.out.println("c");
		b=entrada.nextInt();
		prof.setEscolha(b);
		prof.escolhaenum();
		
		prof.mostar();

		
		
		
		
	}

}
