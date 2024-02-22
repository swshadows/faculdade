public class Exercicio12 {
	// Criar um algoritmo que efetue o cálculo do salário líquido de um professor.
	// Os dados fornecidos serão: valor da hora aula, número de aulas dadas no mês
	// e percentual de desconto do INSS.

	public static void main(String[] args) {
		double class_hour_value = 12;
		int hours_per_class = 3;
		int classes_on_month = 20;
		double discount = 20.0 / 100;

		double salary = class_hour_value * hours_per_class * classes_on_month;
		double salary_real = salary - (salary * discount);

		System.out.println("Salário (sem disconto): " + salary);
		System.out.println("Salário (com desconto): " + salary_real);
	}
}
