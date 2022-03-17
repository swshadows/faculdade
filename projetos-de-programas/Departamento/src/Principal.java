import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		final int TOTAL_DEPARTAMENTOS = 10;
		final int TOTAL_FUNCIONARIOS = 50;
		
		ArrayList<Departamento> departamento = new ArrayList<Departamento>(TOTAL_DEPARTAMENTOS);
		departamento.add(new Departamento("RH", 10));
		departamento.add(new Departamento("Contabilidade", 07));
		
		ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>(TOTAL_FUNCIONARIOS);
		funcionarios.add(new Funcionario("Flávio", 55));
		funcionarios.add(new Funcionario("Tobias", 32));
		funcionarios.add(new Funcionario("Arthur", 21));
		
			
		for (int i = 0; i < funcionarios.size(); i++) {
			Funcionario funcionario = funcionarios.get(i);
			departamento.get(0).alocarEmDepartamento(funcionario);
		}		
		
		departamento.get(0).listarFuncionarios();
		
	}

}
