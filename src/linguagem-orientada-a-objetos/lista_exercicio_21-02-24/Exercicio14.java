
public class Exercicio14 {
	// Fazer um algoritmo que possa entrar com o saldo de uma aplicação e imprima
	// o novo saldo, considerando o reajuste de 1%

	public static void main(String[] args) {
		double balance = 200;
		double readjustment = 1.0 / 100;

		System.out.println("Saldo: " + balance);
		System.out.println("Saldo com acréscimo ajustado: " + (balance + (balance * readjustment)));
	}
}