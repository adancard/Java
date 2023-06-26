package entidades;

public class Cadastro {

	private int senha = 1;

	public Cadastro() {

		this.senha = senha;

	}

	public void entrar(int Senha) {

		if (Senha == this.senha) {

			System.out.println("Bem-Vindo");
			return;

		}

		else {

			System.out.println("Login Incorreto");

		}

	}

	public int getSenha() {
		return senha;
	}

}
