package execucao;

import modelo.Alocacao;
import modelo.Empregado;
import modelo.Projetos;
import modelo.TrabalhaEm;

public class Execucao {
	public static void main(String[] args) {
		Alocacao alocar = new Alocacao();

		Empregado emp1 = new Empregado("Jose", "123.234.345-00", "1234445-78", "Rua 2");
		Empregado emp2 = new Empregado("Julio", "987-876-765-99", "1234445-98", "Rua 9");
		Empregado emp3 = new Empregado("Joao", "456.567.678-88", "1234445-65", "Rua 3");

		Projetos proj1 = new Projetos("Algoritmo e Estrutura de Dados", "AED", "Projeto de AED-1", "UEA");
		Projetos proj2 = new Projetos("Robotica", "NuComp Robotica", "Projeto de Robotica", "UEA");
		Projetos proj3 = new Projetos("Eng. Naval", "NuComp EN", "Projeto de Eng. Naval", "UEA");

		alocar.cadastrarAlocacoes(emp1, proj1, "07/05/2018");
		alocar.cadastrarAlocacoes(emp1, proj2, "08/09/2017");
		alocar.cadastrarAlocacoes(emp1, proj3, "09/10/2016");
		alocar.cadastrarAlocacoes(emp2, proj1, "05/10/2016");
		alocar.cadastrarAlocacoes(emp2, proj2, "06/10/2016");
		alocar.cadastrarAlocacoes(emp2, proj3, "02/10/2016");
		alocar.cadastrarAlocacoes(emp3, proj1, "09/11/2017");
		alocar.cadastrarAlocacoes(emp3, proj2, "06/03/2015");
		alocar.cadastrarAlocacoes(emp3, proj3, "30/05/2014");

		
		alocar.excluirAlocacoes(emp1, proj1);
		alocar.listarAlocacoes();
	}
}
