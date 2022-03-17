package execucao;

import modelo.Funcionario;

public class Execucao {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario("João", "Professor", "José", "Primo");
		Funcionario f2 = new Funcionario("Maria", "Administrador");

		// f1.mostrarDados();
		f2.mostrarDados();

		f1.excluirDependente();
		f1.mostrarDados();
	}

}
