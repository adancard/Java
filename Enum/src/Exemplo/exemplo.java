package Exemplo;

import java.util.Scanner;

public class exemplo {
	
	public enum Bebida{
	     CAFE(2.00,"Cafe"),
	     SUCO(1.50,"Suco"),
	     AGUA(1.00,"Agua");
	     
	     private double preco;
	     private String nome;
	     
	     private Bebida(double preco,String nome){
	        this.preco = preco;
	        this.nome=nome;
	     }
	     
	     public double getPreco(){
	       return this.preco;
	     }
	     
	     public String getNreco(){
		   return this.nome;
		 }
	}
	
	public enum Comida{
		
        SANDUICHE("Sanduiche", 4.0),
        HOTDOG("HotDog", 3.0);
        
        private String nome;
		private double preco;
        
        private Comida(String nome, double preco){
            this.nome = nome;
            this.preco = preco;
        }
        public double getPreco(){
            return this.preco;
        }
		public String getNome() {
			return nome;
		}
     
	}
	
	public static void menu(){
	     System.out.println("\nBebidas");
	     System.out.println("1." + Bebida.CAFE.getNreco() + ": R$ " + Bebida.CAFE.getPreco());
	     System.out.println("2." + Bebida.SUCO.getNreco() + ": R$ " + Bebida.SUCO.getPreco());
	     System.out.println("3." + Bebida.AGUA.getNreco() + ": R$ " + Bebida.AGUA.getPreco());
	     System.out.println("\nComidas");
	     System.out.println("4." + Comida.SANDUICHE.getNome() + ": R$ " + Comida.SANDUICHE.getPreco());
	     System.out.println("5." + Comida.HOTDOG.getNome() + ": R$ " + Comida.HOTDOG.getPreco());
	     System.out.println("0. Sair");
	     System.out.print("Escolha sua opção: ");
	    }
	
	public static double preco(int opcao){
        switch( opcao ){
            case 1:
                return Bebida.CAFE.getPreco();
            case 2:
                return Bebida.SUCO.getPreco();
            case 3:
                return Bebida.AGUA.getPreco();
            case 4:
                return Comida.SANDUICHE.getPreco();
            case 5:
                return Comida.HOTDOG.getPreco();
            default:
                return 0.0;        
        }
    }

	
	public static void main(String[] args) {
		
		  double total=0.0;
	        int opcao=0;
	        Scanner lerDados = new Scanner(System.in);
	        
	        do{
	            menu();
	            opcao = lerDados.nextInt();
	            total = total + preco(opcao);
	            
	            System.out.println("Opção escolhida: " + opcao);
	            System.out.println("Valor de sua conta: " + total + "\n");            
	        }while(opcao != 0);

	        lerDados.close();

		
	}

}
