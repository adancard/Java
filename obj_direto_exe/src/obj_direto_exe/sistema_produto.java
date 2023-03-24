package obj_direto_exe;

import java.util.ArrayList;

public class sistema_produto {

	ArrayList<String> item = new ArrayList<String>();
	private String produto;

	// medoto
	
	public void mostranome(){
		
		System.out.println("produtos:");
		
		for(int i = 0; i < item.size(); i++) {
			System.out.printf("%s \n",item.get(i));
		}
		
		System.out.println(" ");
		System.out.println("Quantidade");
		System.out.println(item.size());
		System.out.println(" ");
	}
	
	public ArrayList<String> getname() {
		item.add(produto);
		return item;
	}
	
	public ArrayList<String> removename1() {
		
		item.remove(produto);
		return item;
	}


	// get e set
	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}
}
