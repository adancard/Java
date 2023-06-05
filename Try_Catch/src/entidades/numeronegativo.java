package entidades;

public class numeronegativo {

	public static void verificar(int indice) throws NegativeArraySizeException {

		if (indice < 0) {

			throw new NegativeArraySizeException("Digite apenas numeros positivos");

		}

	}

}
