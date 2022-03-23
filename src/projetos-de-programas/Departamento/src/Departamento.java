import java.util.ArrayList;

public class Departamento {

	private String nome;
	private int codigo;
	private ArrayList<Funcionario> funcionarios;

	private int qtdFuncionarios;
	
	public Departamento(String nome, int codigo) {
		super();
		this.nome = nome;
		this.codigo = codigo;
		this.funcionarios = new ArrayList<Funcionario>();
		this.qtdFuncionarios = 1;
	}
	
	public void listarFuncionarios(){
		
		for (Funcionario funcionario : funcionarios) {
			System.out.println(funcionario.getNome());
			System.out.println(funcionario.getIdade());
		}		
	}
	
	public ArrayList<Funcionario> getFuncionario() {
		return funcionarios;
	}

	public void alocarEmDepartamento(Funcionario f) {
		funcionarios.add(f);
	}

	public void desalocarDeDepartamento(Funcionario f) {
		if (funcionarios.size() > qtdFuncionarios) {
			funcionarios.add(f);
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public ArrayList<Funcionario> getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(ArrayList<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}

}
