package execucao;

import modelo.Pessoa;

public class Execucao {

		public static void main(String[] args) {
			Pessoa p01 = new Pessoa("Jose","Rua 2","99283-9221");
			Pessoa p02 = new Pessoa("Maria","Rua 1","98123-7981");
			Pessoa p03 = new Pessoa("Kingnaldo","Rua 3","99221-1212");
			Pessoa p04 = new Pessoa("Joao","Rua 4","92929-6363");
			
			//System.out.println(p01.nome);
			p01.imprimirDados();
			p02.imprimirDados();
			p03.imprimirDados();
			p04.imprimirDados();
			
		}
}
