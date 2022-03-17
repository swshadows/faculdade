package modelo;

public class Pessoa {
	private String nome, cpf;

	public Pessoa(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}

	public Pessoa() {

	}

	public void respirar() {
		System.out.println(this.getNome() + " está respirando como pessoa...");
	}

	public void mostrarDadosPessoa() {
		System.out.println("_____________________________________");
		System.out.println("Nome: " + this.getNome());
		System.out.println("CPF: " + this.getCpf());
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
}
