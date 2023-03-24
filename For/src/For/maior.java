package For;

import java.util.Scanner;

public class maior {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int n1,n2;
		
		System.out.println("n1");
		n1=entrada.nextInt();
		System.out.println("n2");
		n2=entrada.nextInt();
		
		do {
			if(n1>n2) {
				System.out.println(n1);
			}
			else {
				System.out.println(n2);
			}
			break;
		}while(n1>n2);
		
		do {
			if(n2>n1) {
				System.out.println(n2);
			}
			else {
				System.out.println(n1);
			}
			break;
		}while(n2>n1);
		entrada.close();
	}

}
