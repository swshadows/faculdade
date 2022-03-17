package modelo;

public class Funcionario {
	private String nome, funcao;
	Dependente dep;

	public Funcionario(String nome, String funcao, String nomeDep, String parDep) {
		this.nome = nome;
		this.funcao = funcao;
		this.dep = new Dependente(nomeDep, parDep);
	}

	public Funcionario(String nome, String funcao) {
		this.nome = nome;
		this.funcao = funcao;
		this.dep = null;
	}

	public Funcionario() {

	}

	public void excluirDependente() {
		this.dep = null;
	}

	public void mostrarDados() {
		System.out.println("Nome: " + getNome());
		System.out.println("Função: " + getFuncao());
		if (this.dep != null){
			dep.mostrarDados();
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

}
