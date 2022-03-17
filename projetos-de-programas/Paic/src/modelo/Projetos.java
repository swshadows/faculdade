package modelo;

public class Projetos {
	private String nome;
	private String sigla;
	private String descricao;
	private String local;

	public Projetos(String nome, String sigla, String descricao, String local) {
		this.nome = nome;
		this.sigla = sigla;
		this.descricao = descricao;
		this.local = local;
	}

	public Projetos() {
		// Java automaticamente cria o padrão sem precisar passar os valores dos
		// atributos vazios
	}

	public void mostrarDadosProjeto() {
		System.out.println("Nome do Projeto: " + getNome());
		System.out.println("Sigla: " + getSigla());
		System.out.println("Descricao: " + getDescricao());
		System.out.println("Local: " + getLocal());
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

}
