public class Exercicio10 {
	// Ler dois valores para as variáveis A e B, efetuar a troca dos valores de
	// forma que a variável A passe a ter o valor da variável B e que a variável
	// B passe a ter o valor da variável A. Apresentar os valores trocados.

	public static void main(String[] args) {
		int var_a = 10;
		int var_b = 20;

		System.out.println("Valor das variáveis antes da troca (A,B): " + var_a + ", " + var_b);
		int placeholder = var_b;

		var_b = var_a;
		var_a = placeholder;

		System.out.println("Valor das variáveis após a troca (A,B): " + var_a + ", " + var_b);

	}

}
