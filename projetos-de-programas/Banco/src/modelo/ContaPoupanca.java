package modelo;

public class ContaPoupanca extends Conta {
	private String dtAnivConta;
	private double jurosRend;

	public ContaPoupanca() {
		super();
	}

	public ContaPoupanca(String codigo, double saldo, String dtAbertura, String agencia, String dtAnivConta, double jurosRend) {
		super(codigo, saldo, dtAbertura, agencia);
		this.setDtAnivConta(dtAnivConta);
		this.setJurosRend(jurosRend);
	}

	public String getDtAnivConta() {
		return dtAnivConta;
	}

	public void setDtAnivConta(String dtAnivConta) {
		this.dtAnivConta = dtAnivConta;
	}

	public double getJurosRend() {
		return jurosRend;
	}

	public void setJurosRend(double jurosRend) {
		this.jurosRend = jurosRend;
	}
}