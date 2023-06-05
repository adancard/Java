package principal;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lerb1 {

	public static void main(String[] args) {
		
		/**
		 * 
		 * Codigo para conseguir ler o arquivo que nos criamos no programa 
		 * anterior
		 * 
		 */

		try {
			FileReader fileReader = new FileReader("livro.csv");
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
