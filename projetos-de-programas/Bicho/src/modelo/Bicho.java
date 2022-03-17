package modelo;

public abstract class Bicho {
	private String nome;

	public Bicho() {

	}

	public Bicho(String nome) {
		this.setNome(nome);
	}

	abstract public String som();

	public void mostrarDados() {
		System.out.println("Nome: " + this.getNome());
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
