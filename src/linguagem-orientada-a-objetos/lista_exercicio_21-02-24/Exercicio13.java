public class Exercicio13 {
	// Em épocas de pouco dinheiro, os comerciantes estão procurando aumentar
	// suas vendas oferecendo desconto. Faça um algoritmo que possa entrar com o
	// valor de
	// um produto e imprima o novo valor tendo em vista que o desconto foi de 10%.

	public static void main(String[] args) {
		double value = 250.6;
		double discount = 10.0 / 100;

		System.out.println("Valor sem disconto: " + value);
		System.out.println("Valor com disconto: " + (value - (value * discount)));
	}
}
