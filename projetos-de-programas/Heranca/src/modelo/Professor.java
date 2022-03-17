package modelo;

public class Professor extends Pessoa {
	private String titulacao;
	
	public Professor(String nome, String cpf, String titulacao){
		super(nome, cpf);
		this.titulacao = titulacao;
	}
	public Professor(){
		
	}
	
	public void respirar() {
		System.out.println(this.getNome() + " está respirando como professor...");
	}
	
	public void corrigirProva(){
		System.out.println(this.getTitulacao() + " " +this.getNome() + " está distribuindo zeros!");
	}
	public String getTitulacao() {
		return titulacao;
	}
	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}
	
	
}
