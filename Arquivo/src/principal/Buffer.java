package principal;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Buffer {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String nomeArquivo = "arquivo.txt";
		String texto;

		System.out.println("Digite o texto");
		texto = entrada.nextLine();

		try (FileOutputStream fout = new FileOutputStream(nomeArquivo);
				BufferedOutputStream bout = new BufferedOutputStream(fout)) {

			char vetor[] = texto.toCharArray();
			for (int i = 0; i < texto.length(); i++) {
				bout.write(vetor[i]);
			}
			System.out.println("Arquivo criado e" + "\n" + "mensagem escrita com sucesso!");
		} catch (FileNotFoundException e) {
			System.err.println("Captura de Excecao: " + e.getMessage());
		} catch (IOException e) {
			System.err.println("Ocorreu um erro: " + e.getMessage());

		}

	}

}
