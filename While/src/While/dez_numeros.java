package While;

import java.util.Scanner;

public class dez_numeros {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int n1,n2,n3,n4,n5,n6,n7,n8,n9,n10,maiorseis=0,menortres=0,igualum=0;
		
		System.out.println("informe o primeiro numero");
		n1=entrada.nextInt();
		System.out.println("informe o segundo numero");
		n2=entrada.nextInt();
		System.out.println("informe o terceiro numero");
		n3=entrada.nextInt();
		System.out.println("informe o quarto numero");
		n4=entrada.nextInt();
		System.out.println("informe o quinto numero");
		n5=entrada.nextInt();
		System.out.println("informe o sexto numero");
		n6=entrada.nextInt();
		System.out.println("informe o setimo numero");
		n7=entrada.nextInt();
		System.out.println("informe o oitavo numero");
		n8=entrada.nextInt();
		System.out.println("informe o nono numero");
		n9=entrada.nextInt();
		System.out.println("informe o decimo numero");
		n10=entrada.nextInt();
		
		entrada.close();
		
		do {
			if(n1<3) {
				menortres=menortres+1;	
			}
			if(n2<3) {
				menortres=menortres+1;	
			}
			if(n3<3) {
				menortres=menortres+1;	
			}
			if(n4<3) {
				menortres=menortres+1;	
			}
			if(n5<3) {
				menortres=menortres+1;	
			}
			if(n6<3) {
				menortres=menortres+1;
			}
			if(n7<3) {
				menortres=menortres+1;	
			}
			if(n8<3) {
				menortres=menortres+1;	
			}
			if(n9<3) {
				menortres=menortres+1;
			}
			if(n10<3) {
				menortres=menortres+1;
			}
			System.out.println("Numeros menores que 3:");
			System.out.println(menortres);
			break;
		}while(true);
		
		do {
			if(n1>6) {
				maiorseis=maiorseis+1;	
			}
			if(n2>6) {
				maiorseis=maiorseis+1;	
			}
			if(n3>6) {
				maiorseis=maiorseis+1;	
			}
			if(n4>6) {
				maiorseis=maiorseis+1;	
			}
			if(n5>6) {
				maiorseis=maiorseis+1;	
			}
			if(n6>6) {
				maiorseis=maiorseis+1;	
			}
			if(n7>6) {
				maiorseis=maiorseis+1;	
			}
			if(n8>6) {
				maiorseis=maiorseis+1;	
			}
			if(n9>6) {
				maiorseis=maiorseis+1;	
			}
			if(n10>6) {
				maiorseis=maiorseis+1;	
			}
			System.out.println("Numeros maiores que 6:");
			System.out.println(maiorseis);
			break;
		}while(true);
		
		do {
			if(n1==1) {
				igualum=igualum+1;	
			}
			if(n2==1) {
				igualum=igualum+1;	
			}
			if(n3==1) {
				igualum=igualum+1;
			}
			if(n4==1) {
				igualum=igualum+1;
			}
			if(n5==1) {
				igualum=igualum+1;
			}
			if(n6==1) {
				igualum=igualum+1;	
			}
			if(n7==1) {
				igualum=igualum+1;
			}
			if(n8==1) {
				igualum=igualum+1;	
			}
			if(n9==1) {
				igualum=igualum+1;	
			}
			if(n10==1) {
				igualum=igualum+1;
			}
			System.out.println("Numeros que sao iguais a  1:");
			System.out.println(igualum);
			break;
		}while(true);

	}

}
