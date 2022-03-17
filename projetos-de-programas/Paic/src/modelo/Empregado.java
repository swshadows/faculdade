package modelo;

public class Empregado {
	private String nome;
	private String cpf;
	private String rg;
	private String endereco;

	public Empregado() {
		// Java automaticamente cria o padrão sem precisar passar os valores dos
		// atributos vazios
	}

	public Empregado(String nome, String cpf, String rg, String endereco) {
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.endereco = endereco;
	}

	public void mostrarDadosEmpregado() {
		System.out.println("Nome: " + getNome());
		System.out.println("CPF: " + getCpf());
		System.out.println("RG: " + getRg());
		System.out.println("Endereco: " + getEndereco());
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
}
