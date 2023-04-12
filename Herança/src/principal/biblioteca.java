package principal;

import pacote.LivroDidatico;
import pacote.LivroFiccao;

import java.util.Scanner;

import pacote.LIvroNF;

public class biblioteca {

	public static void main(String[] args) {
		int n,nivel,nu;
		String nome,titulo,dici,genero,subg,tema,topico,ano;
		LivroDidatico ld = new LivroDidatico();
		LivroFiccao lf = new LivroFiccao();
		LIvroNF lnf = new LIvroNF();
		Scanner entrada = new Scanner (System.in);

		System.out.println("1. Livro Didatico");
		System.out.println("2. Livro de Ficcao");
		System.out.println("3. Livro de nao Ficcao");
		n=entrada.nextInt();
				
		switch (n) {
		
		case 1:
			
			System.out.println("autor livro: ");
			nome=entrada.next();
			ld.setTitulo(nome);
			
			System.out.println("titulo do autor: ");
			titulo=entrada.next();
			ld.setNome(titulo);
			
			System.out.println("numeros de paginas: ");
			nu=entrada.nextInt();
			ld.setNumero(nu);
			
			System.out.println("ano: ");
			ano=entrada.next();
			ld.setAno(ano);
			
			System.out.println("diciplina: ");
			dici=entrada.next();
			ld.setDiciplina(dici);
			
			System.out.println("nivel");
			nivel=entrada.nextInt();
			ld.setNivel(nivel);
			ld.compatibilidade();
			
			break;
			
		case 2:
			
			System.out.println("autor livro: ");
			nome=entrada.next();
			lf.setNome(nome);
			
			System.out.println("titulo do autor: ");
			titulo=entrada.next();
			lf.setTitulo(titulo);
			lf.sinopse();
			
			System.out.println("numeros de paginas: ");
			nu=entrada.nextInt();
			lf.setNumero(nu);
			
			System.out.println("Genero: ");
			genero=entrada.next();
			lf.setGenero(genero);
			
			System.out.println("subgenero: ");
			subg=entrada.next();
			lf.setSubgenero(subg);
			
			lf.Mostrar();
			break;
			
		case 3:
			
			System.out.println("autor livro: ");
			nome=entrada.next();
			lnf.setNome(nome);
			
			System.out.println("titulo do autor: ");
			titulo=entrada.next();
			lnf.setTitulo(titulo);
			lnf.Recomendar();
			
			System.out.println("numeros de paginas: ");
			nu=entrada.nextInt();
			lnf.setNumero(nu);
			
			System.out.println("Tema: ");
			tema=entrada.next();
			lnf.setTema(tema);
			
			System.out.println("topico: ");
			topico=entrada.next();
			lnf.setTopico(topico);
			
			lnf.Mostrar();

		}
		
		entrada.close();
		
		
		
		
	}

}
