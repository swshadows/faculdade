package modelo;

public class Empregado extends Pessoa {
	int codSetor;
	double salBase;
	double imposto;
	
	public Empregado(){
		super();
		this.codSetor = 0;
		this.salBase = 0.0;
		this.imposto = 0.0;
	}
	
	public Empregado(String nome, String endereco, String telefone, int codSetor, double salBase, double imposto){
		super(nome, endereco, telefone);
		this.codSetor = codSetor;
		this.salBase = salBase;
		this.imposto = imposto;
	}
	
	public double calcularSalario(){
		return(this.salBase - (this.salBase * this.imposto));
	}
	
}