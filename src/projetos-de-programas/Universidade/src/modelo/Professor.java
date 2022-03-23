package modelo;

import java.util.ArrayList;

public class Professor {
	private String nomeProf, cpfProf, matriculaProf, tituloProf, foneProf;
	Departamento depProf;
	ArrayList<Aluno> orientandos;
	Endereco endProf;

	public Professor() {
		nomeProf = "";
		cpfProf = "";
		matriculaProf = "";
		tituloProf = "";
		foneProf = "";
		depProf = null;
		orientandos = new ArrayList<Aluno>();
		endProf = new Endereco();
	}

	public Professor(String nomeProf, String cpfProf, String matriculaProf, String tituloProf, String foneProf,
			Departamento pDep, String rua, int numero, String bairro, String cep) {
		this.nomeProf = nomeProf;
		this.cpfProf = cpfProf;
		this.matriculaProf = matriculaProf;
		this.tituloProf = tituloProf;
		this.foneProf = foneProf;
		this.depProf = pDep;
		orientandos = new ArrayList<Aluno>();
		this.endProf = new Endereco(rua, bairro, numero, cep);
	}

	public Professor(String nomeProf, String cpfProf, String matriculaProf, String tituloProf, String foneProf,
			String rua, int numero, String bairro, String cep) {
		this.nomeProf = nomeProf;
		this.cpfProf = cpfProf;
		this.matriculaProf = matriculaProf;
		this.tituloProf = tituloProf;
		this.foneProf = foneProf;
		orientandos = new ArrayList<Aluno>();
		this.endProf = new Endereco(rua, bairro, numero, cep);
	}

	public void mostrarDadosProf() {
		System.out.println("Nome: " + getNomeProf());
		System.out.println("CPF: " + getCpfProf());
		System.out.println("Matricula: " + getMatriculaProf());
		System.out.println("Titulo: " + getTituloProf());
		System.out.println("Telefone: " + getFoneProf());
		endProf.mostrarEndereco();
	}

	public void addOrientando(Aluno obj) {
		this.orientandos.add(obj);
	}

	public void removeOrientando(Aluno obj) {
		this.orientandos.remove(obj);
	}

	public void mostrarOrientandos() {
		for (int i = 0; i < this.orientandos.size(); i++) {
			this.orientandos.get(i).mostrarDadosAlu();
		}
	}

	public void cadastrarDepartamentoProf(Departamento pDep) {
		depProf = pDep;
	}

	public String getNomeProf() {
		return nomeProf;
	}

	public void setNomeProf(String nomeProf) {
		this.nomeProf = nomeProf;
	}

	public String getCpfProf() {
		return cpfProf;
	}

	public void setCpfProf(String cpfProf) {
		this.cpfProf = cpfProf;
	}

	public String getMatriculaProf() {
		return matriculaProf;
	}

	public void setMatriculaProf(String matriculaProf) {
		this.matriculaProf = matriculaProf;
	}

	public String getTituloProf() {
		return tituloProf;
	}

	public void setTituloProf(String tituloProf) {
		this.tituloProf = tituloProf;
	}

	public String getFoneProf() {
		return foneProf;
	}

	public void setFoneProf(String foneProf) {
		this.foneProf = foneProf;
	}

}
