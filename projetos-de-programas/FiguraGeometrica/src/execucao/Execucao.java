package execucao;

import modelo.Quadrado;
import modelo.Triangulo;

public class Execucao {
	public static void main(String[] args) {
		Quadrado q1 = new Quadrado(5);
		Triangulo t1 = new Triangulo(4, 3, 4, 4, 4);
		
		System.out.println("Nome >>>>> " + t1.getNomeFigura());
		System.out.println("Área >>>>> " + t1.getArea());
		System.out.println("Perímetro >>>>> " + t1.getPerimetro() + "\n");
		
		System.out.println("Nome >>>>> " + q1.getNomeFigura());
		System.out.println("Área >>>>> " + q1.getArea());
		System.out.println("Perímetro >>>>> " + q1.getPerimetro());
	}
}
