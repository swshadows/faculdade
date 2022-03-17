package modelo;

public class Departamento {
	private String nomeDep, localDep, dataCriacaoDep;
	private int qtdeProfDep;

	public Departamento() {
		nomeDep = "";
		localDep = "";
		dataCriacaoDep = "";
		qtdeProfDep = 0;
	}

	public Departamento(String nomeDep, String localDep, String dataCriacaoDep, int qtdeProfDep) {
		this.nomeDep = nomeDep;
		this.localDep = localDep;
		this.dataCriacaoDep = dataCriacaoDep;
		this.qtdeProfDep = qtdeProfDep;
	}

	public String getNomeDep() {
		return nomeDep;
	}

	public void setNomeDep(String nomeDep) {
		this.nomeDep = nomeDep;
	}

	public String getLocalDep() {
		return localDep;
	}

	public void setLocalDep(String localDep) {
		this.localDep = localDep;
	}

	public String getDataCriacaoDep() {
		return dataCriacaoDep;
	}

	public void setDataCriacaoDep(String dataCriacaoDep) {
		this.dataCriacaoDep = dataCriacaoDep;
	}

	public int getQtdeProfDep() {
		return qtdeProfDep;
	}

	public void setQtdeProfDep(int qtdeProfDep) {
		this.qtdeProfDep = qtdeProfDep;
	}
}
