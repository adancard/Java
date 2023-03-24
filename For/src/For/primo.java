package For;
import java.util.Scanner;

public class primo {

	public static void main(String[] args) {
		Scanner jorge = new Scanner(System.in);
		int n1,n2,cont;
		
		System.out.println("informe um numero");
		n1=jorge.nextInt();
		System.out.println("informe o segundo numero");
		n2=jorge.nextInt();
		jorge.close();
		
		if(n2>n1) {
			
		for(cont=n1;cont<= n2; cont++) {
			if(cont%2 != 0 || cont == 2) {
				System.out.printf("%d\n",cont);
			}	
		}
	}
		else {
			for(cont=n2;cont<= n1; cont++) {
				if(cont%2 != 0 || cont == 2) {
					System.out.printf("%d\n",cont);
		 }
		}
       }
	  }
	 }


