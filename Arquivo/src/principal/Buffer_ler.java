package principal;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Buffer_ler {

	public static void main(String[] args) {

		try {
			FileInputStream fileInputStream = new FileInputStream("arquivo.txt");
			BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
			int i;
			while ((i = bufferedInputStream.read()) != -1) {
				System.out.print((char) i);
			}
			bufferedInputStream.close();
			fileInputStream.close();
		} catch (FileNotFoundException e) {
			System.err.println("Arquivo nao encontrado: " + e.getMessage());
		} catch (Exception e) {
			System.err.println("Excecao capturada: " + e.getMessage());
		}
	}

}
