package modelo;

public class Animal {
	private String nome;
	private double comprimento;
	private int patas = 4;
	private String cor;
	private String ambiente;
	private double velocidade;
	
	public Animal(){
		this.setNome("");
		this.setAmbiente("");
		this.setComprimento(0);
		this.setCor("");
		this.setVelocidade(0);
		this.setPatas(4);
	}
	
	public Animal(String nome, double comprimento, int patas, String cor, String ambiente, double velocidade){
		this.setNome(nome);
		this.setComprimento(comprimento);
		this.setPatas(patas);
		this.setCor(cor);
		this.setAmbiente(ambiente);
		this.setVelocidade(velocidade);
	}
	
	public void mostrarDados(){
		System.out.println("Nome: " + this.getNome());
		System.out.println("Ambiente: " + this.getAmbiente());
		System.out.println("Comprimento: " + this.getComprimento());
		System.out.println("Cor: " + this.getCor());
		System.out.println("Velocidade: " + this.getVelocidade());
		System.out.println("Qtd. de Patas: " + this.getPatas());
	} 
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getComprimento() {
		return comprimento;
	}
	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}
	public int getPatas() {
		return patas;
	}
	public void setPatas(int patas) {
		this.patas = patas;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getAmbiente() {
		return ambiente;
	}
	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}
	public double getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}
}
