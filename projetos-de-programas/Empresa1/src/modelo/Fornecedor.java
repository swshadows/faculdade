package modelo;

public class Fornecedor extends Pessoa{
	double valorCredito;
	double valorDivida;

	public Fornecedor(String nome, String endereco, String telefone, double valorCredito, double valorDivida){
		super(nome, endereco, telefone);
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
	}
	
	public double obterSaldo(){
		return(this.valorCredito - this.valorDivida);
	}
}
