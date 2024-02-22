public class Exercicio11 {
	// Efetuar o cálculo do valor de uma prestação em atraso, utilizando a fórmula:
	// prestação = valor + (valor*(taxa/100)*tempo).

	public static void main(String[] args) {
		double value = 200;
		double tax = 10;
		int time = 2;

		double installment = value + (value * (tax / 100) * time);

		System.out.println("Valor da parcela: " + installment);
	}
}
