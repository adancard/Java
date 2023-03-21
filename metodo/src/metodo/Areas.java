package metodo;

import java.util.Scanner;

public class Areas {
	
	public static float quadrado (float n1, float n2) {
		float result;
		
		result = n1*n2;
		return result;
	}

	public static float retangulo (float n1, float n2) {
		float result;
		
		result = n1*n2;
		
		return result;
		
	}

	public static float triangulo (float n1, float n2){
		float result;
		
		result=(n1*n2)/2;
		
		return result;
	}
	
	public static float trapezio (float n1, float n2, float n3){
		float result;
		
		result=(n1+n3)*n2/2;
		
		return result;
		
	}
	
	public static float circulo ( float n1) {
		float result;
		
		double PI = Math.PI;
		double resto = Math.pow(n1,2);
		
		result=(float)PI*(float)resto;
		
		return result;
	}
	
	
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int n;
		float n1,n2,n3,resto;
		
		System.out.println("1. Area do Quadrado");
		System.out.println("2. Area do Retangulo");
		System.out.println("3. Area do Trapezio");
		System.out.println("4. Area do Triangulo");
		System.out.println("5. Area Circulo");
		System.out.println("6. Sair");
		n=entrada.nextInt();
		
		switch (n) {
		
		case 1:
			
			System.out.println("informe a base");
			n1=entrada.nextFloat();
			System.out.println("informe a altura");
			n2=entrada.nextFloat();
			
			resto=quadrado(n1, n2);
			
			
			System.out.println("A area eh " + resto );
			break;
			
		case 2:
			System.out.println("informe a base");
			n1=entrada.nextFloat();
			System.out.println("informe a altura");
			n2=entrada.nextFloat();
			
			resto = quadrado(n1, n2);
			
			System.out.println("A area do retangulo eh "+ resto);
			
			break;
			
		case 3:
		
			System.out.println("informe a base maior");
			n1=entrada.nextFloat();
			System.out.println("informe a base menor");
			n3=entrada.nextFloat();
			System.out.println("informe a altura");
			n2=entrada.nextFloat();
			
			
			resto = trapezio(n1, n2, n3);
			
			System.out.println("A area do trapezio eh "+resto);
			
		break;
		
		
		case 4: 
			
			System.out.println("informe a base");
			n1=entrada.nextFloat();
			System.out.println("informe a altura");
			n2=entrada.nextFloat();
			
			resto = triangulo(n1, n2);
			
			System.out.println("A area do Triangulo eh "+ resto);
			
			break;
			
		case 5:
			

			System.out.println("informe o raio");
			n1=entrada.nextFloat();
			
			resto=circulo(n1);
			
			System.out.println("A area do circulo eh "+resto);

		case 6:
			System.out.println("Saindo...");
			break;
			
			
			default:
				while (true) {
					
					if (n != 1 && n!=2  && n!=3  && n!=4  && n!=5  && n!=6) {
						System.out.println("1. Area do Quadrado");
						System.out.println("2. Area do Retangulo");
						System.out.println("3. Area do Trapezio");
						System.out.println("4. Area do Triangulo");
						System.out.println("5. Area Circulo");
						System.out.println("6. Sair");
						System.out.println("Digite algum dos numeros acima");
						n=entrada.nextInt();
					}
					else {
						switch (n) {
						
						case 1:
							
							System.out.println("informe a base");
							n1=entrada.nextFloat();
							System.out.println("informe a altura");
							n2=entrada.nextFloat();
							
							resto=quadrado(n1, n2);
							
							
							System.out.println("A area eh " + resto );
							break;
							
						case 2:
							System.out.println("informe a base");
							n1=entrada.nextFloat();
							System.out.println("informe a altura");
							n2=entrada.nextFloat();
							
							resto = quadrado(n1, n2);
							
							System.out.println("A area do retangulo eh "+ resto);
							
							break;
							
						case 3:
						
							System.out.println("informe a base maior");
							n1=entrada.nextFloat();
							System.out.println("informe a base menor");
							n3=entrada.nextFloat();
							System.out.println("informe a altura");
							n2=entrada.nextFloat();
							
							
							resto = trapezio(n1, n2, n3);
							
							System.out.println("A area do trapezio eh "+resto);
							
						break;
						
						
						case 4: 
							
							System.out.println("informe a base");
							n1=entrada.nextFloat();
							System.out.println("informe a altura");
							n2=entrada.nextFloat();
							
							resto = triangulo(n1, n2);
							
							System.out.println("A area do Triangulo eh "+ resto);
							
							break;
							
						case 5:
							

							System.out.println("informe o raio");
							n1=entrada.nextFloat();
							
							resto=circulo(n1);
							
							System.out.println("A area do circulo eh "+resto);

						case 6:
							System.out.println("Saindo...");
							break;
						
					}
						break;
					
				}
					entrada.close();
					
			
		}
		
		
		
		
		
		
		
	}
	}
}
