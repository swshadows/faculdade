package modelo;

public class Dependente {
	private String nome, parentesco;

	public Dependente(String nome, String parentesco) {
		this.nome = nome;
		this.parentesco = parentesco;
	}

	public Dependente() {

	}

	public void mostrarDados() {
		System.out.println("Nome [DEP]: " + getNome());
		System.out.println("Parentesco [DEP]: " + getParentesco());
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getParentesco() {
		return parentesco;
	}

	public void setParentesco(String parentesco) {
		this.parentesco = parentesco;
	}

}
