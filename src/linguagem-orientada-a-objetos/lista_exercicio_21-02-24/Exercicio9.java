public class Exercicio9 {
	// Todo restaurante embora por lei não possa obrigar o cliente a pagar, cobra
	// 10% para o garçom. Fazer um algoritmo que leia o valor gasto com despesas
	// realizadas em um restaurante e imprima o valor total com a gorjeta.

	public static void main(String[] args) {
		double cost = 215.5;
		double tip = cost * 0.1;

		System.out.println("Total = " + cost);
		System.out.println("Total com gorjeta = " + (cost + tip));
	}
}
