package execucao;

import modelo.Mamifero;
import modelo.Peixe;

public class Execucao {
	public static void main(String[] args) {
		Peixe p1 = new Peixe("Peixe-palhaço", 0.10, "Laranja", "Mar", 1.56);
		p1.addCaracteristicas("Gordo");
		p1.addCaracteristicas("Colorido");
		
		Mamifero m1 = new Mamifero("Josefino", 1.78, 2, "Branco", "Terra", 4);
		m1.setAlimento("Bife");
		
		Peixe p2 = new Peixe("Tucunaré", 0.5, "Preto/Verde/Amarelo", "Rio", 2.6);
		p2.addCaracteristicas("Grande");
		
		Mamifero m2 = new Mamifero("Cara-preta", 2.3, 4, "Marrom", "Terra", 1.0);
		m2.setAlimento("Capim");
		
		p1.mostrarDados();
		m1.mostrarDados();
		p2.mostrarDados();
		m2.mostrarDados();
	}
}
