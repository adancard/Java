package entidade;

public class Turma {

	private String diciplina;
	private String professor;

	public Turma(String diciplina, String professor) {

		this.diciplina = diciplina;
		this.professor = professor;

	}

	@Override

	public String toString() {

		return "Professor: " + professor + " Diciplina: " + diciplina;

	}

}
