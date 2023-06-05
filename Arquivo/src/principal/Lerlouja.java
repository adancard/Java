package principal;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lerlouja {

	public static void main(String[] args) {

		try {
			FileReader fileReader = new FileReader("vendas.csv");
			int i;
			while ((i = fileReader.read()) != -1) {
				System.out.print((char) i);
			}
			fileReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo nao encontrado: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Captura de Excecao: " + e.getMessage());
		}

	}

}
