package modelo;

import java.util.ArrayList;

public class Alocacao {
	private ArrayList<TrabalhaEm> alocacao;

	public Alocacao() {
		alocacao = new ArrayList<TrabalhaEm>();
	}

	public void cadastrarAlocacoes(Empregado emp, Projetos proj, String data) {
		alocacao.add(new TrabalhaEm(emp, proj, data));
	}

	public void listarAlocacoes() {
		for (int i = 0; i < alocacao.size(); i++) {
			alocacao.get(i).mostrarDadosTrabalhaEm();
		}
	}

	public void excluirAlocacoes(Empregado emp, Projetos proj) {
		for (int i = 0; i < alocacao.size(); i++) {
			if (alocacao.get(i).getEmp().equals(emp) && alocacao.get(i).getProj().equals(proj)) {
				alocacao.remove(i);
				break;
			}
		}
	}

	public ArrayList<TrabalhaEm> getAlocacao() {
		return alocacao;
	}

	public void setAlocacao(ArrayList<TrabalhaEm> alocacao) {
		this.alocacao = alocacao;
	}
}
