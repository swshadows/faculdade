package execucao;

import modelo.Circulo;

public class Execucao {
	public static void main(String[] args) {
		Circulo c01 = new Circulo(4.2);
		
		c01.imprimirDados();
		c01.setRaio(10);
		c01.imprimirDados();
	}
}
