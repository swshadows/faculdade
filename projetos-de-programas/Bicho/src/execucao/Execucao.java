package execucao;

import modelo.Bicho;
import modelo.Cachorro;
import modelo.Gato;

public class Execucao {
	public static void main(String[] args) {
		/*
		 * Gato g1 = new Gato("Vladimir"); Cachorro c1 = new Cachorro("Jorge");
		 * 
		 * System.out.println(g1.som()); System.out.println(c1.som());
		 */

		Bicho[] bs = new Bicho[2];
		bs[0] = new Gato("Serjão");
		bs[1] = new Cachorro("Fred");

		for (int i = 0; i < bs.length; i++) {
			System.out.println(bs[i].som());
		}
	}
}
