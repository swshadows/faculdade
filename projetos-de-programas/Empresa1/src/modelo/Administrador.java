package modelo;

public class Administrador extends Empregado {
	double ajudaCusto;
	
	public Administrador(String nome, String endereco, String telefone, int codSetor, double salBase, double imposto, double ajudaCusto){
		super(nome, endereco, telefone, codSetor, salBase, imposto);
		this.ajudaCusto = ajudaCusto;
	}
	
	public double calcularSalario(){
		return(this.salBase - (this.salBase * this.imposto) + this.ajudaCusto);
	}
}
