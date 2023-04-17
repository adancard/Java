package principal;

import entidade.Aluno;
import entidade.Turma;

public class Escola {

	public static void main(String[] args) {
		Turma turma = new Turma("matematica", "eduardo");
		Aluno aluno = new Aluno("adan", 10, 18, turma.toString());

		System.out.println(aluno.exibir());

	}

}
