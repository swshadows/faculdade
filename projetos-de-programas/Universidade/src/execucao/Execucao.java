package execucao;

import modelo.Aluno;
import modelo.Departamento;
import modelo.Professor;

public class Execucao {
	public static void main(String[] args) {
		Professor prof1 = new Professor("Jose", "111.111.111-11", "1719999", "Doutor", "1234-1234", "Rua 999", 56,
				"Bairro Verde", "78099-96");
		Departamento dep1 = new Departamento("Computacao", "UEA", "11/09/2001", 2);
		Aluno alu1 = new Aluno("Ze 1", "222.222.222-22", "222", "Rua 1, Casa 4");
		Aluno alu2 = new Aluno("Ze 2", "111.111.111-11", "111", "Rua 2, Casa 3");
		Aluno alu3 = new Aluno("Ze 3", "444.444.444-44", "444", "Rua 3, Casa 2");
		Aluno alu4 = new Aluno("Ze 4", "333.333.333-33", "444", "Rua 4, Casa 1");

		// prof1.addOrientando(alu1);
		// prof1.addOrientando(alu4);
		prof1.mostrarDadosProf();
		// prof1.mostrarOrientandos();
		// prof1.cadastrarDepartamentoProf(dep1);
		// System.out.println("blz");
	}
}
