package execucao;

import modelo.Carro;
import modelo.Fone;
import modelo.Pessoa;

public class Execucao {

	public static void main(String[] args) {
		Carro c1 = new Carro("Chevrolet", 10000, "OWX-1234", 2008);
		Pessoa p1 = new Pessoa("Josefino", 9000, c1);
		Fone f1 = new Fone("9344-3234", 92);
		
		p1.adicionarFone(f1);
		p1.mostrarPessoa();
	}
}
