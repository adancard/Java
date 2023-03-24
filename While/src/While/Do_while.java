package While;
import java.util.Scanner;

public class Do_while {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int n1,n2,n3,n4,media;
		
		System.out.println("Informe o primeiro numero:");
		n1=entrada.nextInt();
		System.out.println("Informe o segundo numero: ");
		n2=entrada.nextInt();
		System.out.println("Informe o terceiro numero: ");
		n3=entrada.nextInt();
		System.out.println("Informe o quarto numero: ");
		n4=entrada.nextInt();
		entrada.close();
		
		do {
			if(n1>n2 && n1>n3 && n1>n4) {
				System.out.printf("Este eh o maior numero: %d \n",n1);
			}
			if(n2>n1 && n2>n3 && n2>n4) {
				System.out.printf("Este eh o maior numero: %d \n",n2);
			}
			if(n3>n1 && n3>n2 && n1>n4) {
				System.out.printf("Este eh o maior numero: %d \n",n3);
			}
			if(n4>n1 && n4>n2 && n4>n3) {
				System.out.printf("Este eh o maior numero: %d \n",n4);
			}
			
			if(n1<n2 && n1<n3 && n1<n4) {
				System.out.printf("Este eh o menor numero: %d \n",n1);
			}
			if(n2<n1 && n2<n3 && n1<n4) {
				System.out.printf("Este eh o menor numero: %d \n",n2);
			}
			if(n3<n1 && n3<n2 && n3<n4) {
				System.out.printf("Este eh o menor numero: %d \n",n3);
			}
			if(n4<n1 && n4<n2 && n1<n3) {
				System.out.printf("Este eh o menor numero: %d \n",n4);
			}
			if((n1==n2 && n1==n3 & n1 ==n4) && ( n2 == n1 && n2== n3 && n2 == n4) && ( n3 == n1 && n3== n2 && n3 == n4)&& ( n4 == n1 && n4== n2 && n4 == n3)) {
				System.out.println("Os numeros sao iguais");
			}
			break;
		}while(true);
		media=(n1+n2+n3+n4)/4;
		System.out.printf("A media desses numeros eh: %d",media);
		
		

	}

}
