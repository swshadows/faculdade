package modelo;

public class ContaCorrente extends Conta {
	private double valManutencao;

	public ContaCorrente() {
		super();
	}

	public ContaCorrente(String codigo, double saldo, String dtAbertura, String agencia, double valManutencao) {
		super(codigo, saldo, dtAbertura, agencia);
		this.setValManutencao(valManutencao);
	}

	public double getValManutencao() {
		return valManutencao;
	}

	public void setValManutencao(double valManutencao) {
		this.valManutencao = valManutencao;
	}
}
