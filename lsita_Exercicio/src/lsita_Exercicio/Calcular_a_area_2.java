package lsita_Exercicio;

import java.util.Scanner;

public class Calcular_a_area_2 {
	
	public static float areacu (float areaC) {
		float result;
		
		double area = Math.pow(areaC,2);
		
		result = 6 * (float)area;
		
		return result;
	}
	
	public static float areaco (float raio, float geratriz) {
		float result;
		
		double pi = Math.PI;
		
		result = (float)pi*raio*(raio+geratriz);
		return result;
	}

	public static float areaes (float raio) {
		float result;
		
		double pi = Math.PI;
		
		double area = Math.pow(raio,2);
		
		result = 4*(float) pi*(float)area;
		
		return result;
		
	}
	
	public static float areaci (float raio, float alt) {
		float result;
		
		double pi = Math.PI;
		
		result=2*(float)pi*raio*(raio+alt);
		
		return result;
	}
	
	public static float areapiT (float base, float baseA, float alt) {
		float result;
		
		result= (float) ((0.5*base*baseA) + (1.5*base*alt));
		
		return result;
		
	}

	public static float areapiQ (float base) {
		float result;
		
		double area = Math.pow(base,2); 
		
		result=(float)area;
		
		return result;
		
	}
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		int n;
		float areaC,area,area1,area2,area3,area4,area5,raio,geratriz,alt,base,baseA;
		
		while(true) {
			
			System.out.println("1. Area do Cubo");
			System.out.println("2. Area do Cone");
			System.out.println("3. Area da Esfera");
			System.out.println("4. Area do Cilindro");
			System.out.println("5. Area da Piramide (triangular)");
			System.out.println("6. Area da Piramide (quadrangular)");
			System.out.println("7. Sair do Programa");
			n=entrada.nextInt();
			
			if(n==7) {
				break;
			}
			else {
				switch (n) {
				
				case 1:
					System.out.println("Informe a base do cubo");
					areaC=entrada.nextFloat();
					area=areacu(areaC);
					System.out.println(area);
					break;
					
				case 2:
					
					System.out.println("Informe o raio");
					raio=entrada.nextFloat();
					System.out.println("Informe a geratriz");
					geratriz=entrada.nextFloat();
					area1=areaco(raio, geratriz);
					System.out.println(area1);
					break;
					
				case 3:
					System.out.println("Informe o raio");
					raio=entrada.nextFloat();
					area2=areaes(raio);
					System.out.println(area2);
					break;
					
				case 4:
					System.out.println("Informe o raio");
					raio=entrada.nextFloat();
					System.out.println("Informe a altura");
					alt=entrada.nextFloat();
					area3=areaci(raio, alt);
					System.out.println(area3);
					break;
					
				case 5:	
					System.out.println("Informe a base");
					base=entrada.nextFloat();
					System.out.println("Informe a base A");
					baseA=entrada.nextFloat();
					System.out.println("Informe a altura");
					alt=entrada.nextFloat();
					area4=areapiT(base, baseA, alt);
					System.out.println(area4);
					break;
					
				case 6:
					System.out.println("Informe a base");
					base=entrada.nextFloat();
					area5 = areapiQ(base);
					System.out.println(area5);
					break;
					
				}	
			}
			
		}

	}

}
