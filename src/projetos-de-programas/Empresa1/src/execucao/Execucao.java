package execucao;

import modelo.Administrador;
import modelo.Empregado;
import modelo.Fornecedor;
import modelo.Pessoa;

public class Execucao {
	public static void main(String[] args) {
		Pessoa pes1 = new Pessoa("Vladimir", "Rua 91820738", "99678-9854");
		Fornecedor for1 = new Fornecedor("Estevao Trabalhos", "Rua 12", "99823-3212", 10, 1);
		Administrador adm1 = new Administrador("Josefino", "Rua 2", "99345-6789", 12344, 20000, 0.1, 1000);
		Empregado emp1 = new Empregado("Josefino Jr.", "Rua 3", "99543-2198", 12334, 5000, 0.05);
		
		System.out.println("Nome: " + pes1.getNome() + "\n");
		System.out.println("O menino " + for1.getNome());
		System.out.println("Tem " + for1.obterSaldo() + " unidades monetarias\n");
		System.out.println("O grande " + adm1.getNome());
		System.out.println("Salário: R$ " + adm1.calcularSalario() + "\n");
		System.out.println("O pequeno " + emp1.getNome());
		System.out.println("Salário: R$ " + emp1.calcularSalario());
	}
}
