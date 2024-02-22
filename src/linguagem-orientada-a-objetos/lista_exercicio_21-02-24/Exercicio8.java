public class Exercicio8 {
	// Criar um algoritmo que leia o valor de um depósito e o valor da taxa de
	// juros.
	// Calcular e imprimir o valor do rendimento e o valor total depois do
	// rendimento.

	public static void main(String[] args) {
		double current = 125.0;
		double deposit = 200.0;
		double tax = 10;

		double total = current + deposit;
		double after_income = total * (tax / 100);

		System.out.println("Saldo anterior: " + current);
		System.out.println("Saldo com depósito: " + total);
		System.out.println("Saldo com depósito e rendimento: " + (total + after_income));
	}
}
