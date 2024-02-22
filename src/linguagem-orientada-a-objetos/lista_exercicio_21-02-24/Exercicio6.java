
public class Exercicio6 {
	// Ler dois números reais e imprimir o quadrado da diferença do primeiro valor
	// pelo segundo e a diferença dos quadrados.

	public static void main(String[] args) {
		double n1 = 4;
		double n2 = 2;

		// double sqr_diff = Math.pow((n1 - n2), 2);
		// double sqr_diff_both = Math.pow(n1, 2) - Math.pow(n2, 2);

		// ou

		double sqr_diff = (n1 - n2) * (n1 - n2);
		double sqr_diff_both = (n1 * n1) - (n2 * n2);

		System.out.println("Quadrado da diferença = " + sqr_diff);
		System.out.println("Diferença dos quadrados = " + sqr_diff_both);
	}
}