package modelo;

public class Aluno {
	private String nomeAlu, cpfAlu, matriculaAlu, enderecoAlu;

	public Aluno() {
		nomeAlu = "";
		cpfAlu = "";
		matriculaAlu = "";
		enderecoAlu = "";
	}

	public Aluno(String nomeAlu, String cpfAlu, String matriculaAlu, String enderecoAlu) {
		this.nomeAlu = nomeAlu;
		this.cpfAlu = cpfAlu;
		this.matriculaAlu = matriculaAlu;
		this.enderecoAlu = enderecoAlu;
	}

	public void mostrarDadosAlu() {
		System.out.println("Nome: " + getNomeAlu());
		System.out.println("CPF: " + getCpfAlu());
		System.out.println("Matricula: " + getMatriculaAlu());
		System.out.println("Endereço: " + getEnderecoAlu());
	}

	public String getNomeAlu() {
		return nomeAlu;
	}

	public void setNomeAlu(String nomeAlu) {
		this.nomeAlu = nomeAlu;
	}

	public String getCpfAlu() {
		return cpfAlu;
	}

	public void setCpfAlu(String cpfAlu) {
		this.cpfAlu = cpfAlu;
	}

	public String getMatriculaAlu() {
		return matriculaAlu;
	}

	public void setMatriculaAlu(String matriculaAlu) {
		this.matriculaAlu = matriculaAlu;
	}

	public String getEnderecoAlu() {
		return enderecoAlu;
	}

	public void setEnderecoAlu(String enderecoAlu) {
		this.enderecoAlu = enderecoAlu;
	}

}
