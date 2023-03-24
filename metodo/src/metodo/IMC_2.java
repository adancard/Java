package metodo;

import java.util.Scanner;

public class IMC_2 {
	
	public static double IMC (double peso, double altura) {
		double resultado;
		double resto = Math.pow(altura,2);
		resultado = peso/resto;
		return resultado;
	}
	
	public static double cnpd_H (double peso, double altura,double idade) {
		double resultado,cm;
		cm =altura/10000;
		resultado = (13.75*peso)+(5*cm)-(6.76* (int)idade)+66.5;
		return resultado;
	}
	
	public static double cnpd_M (double peso, double altura,double idade) {
		double resultado,cm;
		cm = altura/1000;
		resultado = (9.56*peso)+(1.85*cm)-(4.68*(int)idade)+665;
		return resultado;
	}
	
	public static double PG_H (double idade, double imc, double cn_H) {
		double resultado1;
		
		resultado1=(1.20*imc)+(0.23*(int)idade)-(10.8*cn_H)-5.4;
		return resultado1;
	}
	
	public static double PG_M (double idade, double imc, double cn_M) {
		double resultado1;
		
		resultado1=(1.20*imc)+(0.23*(int)idade)-(10.8*cn_M)-5.4;
		return resultado1;
	}
	
	public static double MG_M (double pg_m, double peso) {
		double result,result1;
		result = pg_m*100;
		result1 =(peso*result)-peso;
		return result1;
	}
	
	public static double MG_H (double pg_h, double peso) {
		double result,result1;
		result = pg_h*100;
		result1 =(peso*result)-peso;
		return result1;
	}
	
	
	

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double peso, altura,idade,cn_H,cn_M,imc,pg_h,pg_m,mg_h,mg_m;
		int n,n1,n2,n3;
		
		System.out.println("1.calorias necessarias por dia");
		System.out.println("2.IMC(Indice de Massa Corporal");
		System.out.println("3.Percentual de gordura");
		System.out.println("4.Massa Magra");
		System.out.println("Escolha uma acima");
		n=entrada.nextInt();
		

		
		switch(n) {
		case 1:
			System.out.println("1. Homem");
			System.out.println("2. Mulher");
			n1=entrada.nextInt();
			switch (n1) {
			case 1:
				System.out.println("peso");
				peso=entrada.nextDouble();
				System.out.println("altura");
				altura=entrada.nextDouble();
				System.out.println("idade");
				idade=entrada.nextDouble();
				
				cn_H=cnpd_H(peso, altura, idade);
				
				System.out.printf("Estas sao suas calorias necessarias: %.2f",cn_H);
				break;
				
			case 2:
				System.out.println("peso");
				peso=entrada.nextDouble();
				System.out.println("altura");
				altura=entrada.nextDouble();
				System.out.println("idade");
				idade=entrada.nextDouble();
				
				cn_M=cnpd_M(peso, altura, idade);
				
				System.out.printf("Estas sao suas calorias necessarias: %.2f",cn_M);
				break;
				
			default :
				System.out.println("Nao existe esta opçao");
				break;
	
			}
			break;
			
		case 2:
			System.out.println("peso");
			peso=entrada.nextDouble();
			System.out.println("altura");
			altura=entrada.nextDouble();
			
			imc=IMC(peso, altura);
			
			System.out.printf("Este eh seu IMC: %.2f",imc);
			break;
			
		case 3:
			System.out.println("1. Homem");
			System.out.println("2. Mulher");
			n2=entrada.nextInt();
			switch(n2) {
			case 1:
				System.out.println("peso");
				peso=entrada.nextDouble();
				System.out.println("altura");
				altura=entrada.nextDouble();
				System.out.println("idade");
				idade=entrada.nextDouble();
				
				cn_H=cnpd_H(peso, altura, idade);
				imc=IMC(peso, altura);
				pg_h = PG_H(idade, imc,cn_H);
				
				System.out.printf("Este eh seu percentual de gordura :%.2f",pg_h);
				break;
				
			case 2:
				System.out.println("peso");
				peso=entrada.nextDouble();
				System.out.println("altura");
				altura=entrada.nextDouble();
				System.out.println("idade");
				idade=entrada.nextDouble();
				
				cn_M=cnpd_H(peso, altura, idade);
				imc=IMC(peso, altura);
				pg_m=PG_M(idade, imc, cn_M);
				
				System.out.printf("Este eh seu percentual de gordura :%.2f",pg_m);
				break;
			}
			break;
			
		case 4:
			System.out.println("1. Homem");
			System.out.println("2. Mulher");
			n3=entrada.nextInt();
			switch(n3) {
			case 1:
				System.out.println("peso");
				peso=entrada.nextDouble();
				System.out.println("altura");
				altura=entrada.nextDouble();
				System.out.println("idade");
				idade=entrada.nextDouble();
				
				imc=IMC(peso, altura);
				cn_H=cnpd_H(peso, altura, idade);
				mg_h=PG_M(idade, imc, cn_H);
				
				System.out.printf("Este eh sua massa magra: %.2f",mg_h);
				break;
				
			case 2:
				System.out.println("peso");
				peso=entrada.nextDouble();
				System.out.println("altura");
				altura=entrada.nextDouble();
				System.out.println("idade");
				idade=entrada.nextDouble();
				
				imc=IMC(peso, altura);
				cn_M=cnpd_H(peso, altura, idade);
				mg_m=PG_M(idade, imc, cn_M);
				
				System.out.printf("Este eh sua massa magra: %.2f",mg_m);
				entrada.close();
				break;
			}
			break;
			
			default:
				System.out.println("Nao existe esta opcao");
				break;
	
		}
		
	}

}