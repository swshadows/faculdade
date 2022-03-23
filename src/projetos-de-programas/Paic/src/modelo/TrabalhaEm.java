package modelo;

public class TrabalhaEm {
	private Empregado emp;
	private Projetos proj;
	private String data;

	public TrabalhaEm(Empregado emp, Projetos proj, String data) {
		this.emp = emp;
		this.proj = proj;
		this.data = data;
	}

	public TrabalhaEm() {
		// Java automaticamente cria o padrão sem precisar passar os valores dos
		// atributos vazios
	}

	public void mostrarDadosTrabalhaEm() {
		System.out.println("********* Dados TrabalhaEm *********");
		System.out.println("************************************");
		this.getEmp().mostrarDadosEmpregado();
		this.getProj().mostrarDadosProjeto();
		System.out.println("Data: " + getData());
		System.out.println("************************************");
	}

	public Empregado getEmp() {
		return emp;
	}

	public void setEmp(Empregado emp) {
		this.emp = emp;
	}

	public Projetos getProj() {
		return proj;
	}

	public void setProj(Projetos proj) {
		this.proj = proj;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

}
