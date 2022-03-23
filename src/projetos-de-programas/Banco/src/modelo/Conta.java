package modelo;

public class Conta {
	private String codigo;
	private double saldo;
	private String dtAbertura;
	private String agencia;
	
	public Conta(){

	}
	
	public Conta(String codigo, double saldo, String dtAbertura, String agencia){
		this.setCodigo(codigo);
		this.setSaldo(saldo);
		this.setDtAbertura(dtAbertura);
		this.setAgencia(agencia);
	}
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String getDtAbertura() {
		return dtAbertura;
	}
	public void setDtAbertura(String dtAbertura) {
		this.dtAbertura = dtAbertura;
	}
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}	
}
