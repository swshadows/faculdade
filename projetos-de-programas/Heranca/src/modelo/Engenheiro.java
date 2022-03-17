package modelo;

public class Engenheiro extends Pessoa {
	private int numCREA;

	public Engenheiro(String nome, String cpf, int numCREA) {
		super(nome, cpf);
		this.numCREA = numCREA;
	}

	public Engenheiro() {

	}

	public void respirar() {
		System.out.println(this.getNome() + " está respirando como engenheiro...");
	}
	
	public void projetar() {
		System.out.println(this.getNome() + " (CPF: " + super.getCpf() + ") está projetando...");
	}

	public void emitirAnaliseTecnica() {
		System.out.println(this.getNome() + " (CREA: " + this.getNumCREA() + ") está emitindo análise técnica");
	}
	
	public int getNumCREA() {
		return numCREA;
	}

	public void setNumCREA(int numCREA) {
		this.numCREA = numCREA;
	}
}
