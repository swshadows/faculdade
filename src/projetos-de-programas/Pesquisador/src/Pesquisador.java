import java.util.ArrayList;

public class Pesquisador {

	private String nome;
	private int matrcula;
	private ArrayList<Projeto> projetos;
	private int qtdMinProjetos;

	public Pesquisador(String nome, int matricula){
		this.nome = nome;
		this.matrcula = matricula;
		this.projetos = new ArrayList<Projeto>();
		qtdMinProjetos = 1;
	}

	public ArrayList<Projeto> getProjeto() {
		return projetos;
	}

	public void alocarEmProjeto(Projeto p) {
		projetos.add(p);
	}

	public void desalocarDeProjeto(Projeto p) {
		if (projetos.size() > qtdMinProjetos) {
			projetos.add(p);
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMatrcula() {
		return matrcula;
	}

	public void setMatrcula(int matrcula) {
		this.matrcula = matrcula;
	}

	public ArrayList<Projeto> getProjetos() {
		return projetos;
	}

	public void setProjetos(ArrayList<Projeto> projetos) {
		this.projetos = projetos;
	}

	public int getQtdMinProjetos() {
		return qtdMinProjetos;
	}

	public void setQtdMinProjetos(int qtdMinProjetos) {
		this.qtdMinProjetos = qtdMinProjetos;
	}
}
