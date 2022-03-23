package modelo;

public class Mamifero extends Animal{
	private String alimento;
	
	public Mamifero(){
		super();
		this.setAmbiente("Terra");
	}
	
	public Mamifero(String nome, double comprimento, int patas, String cor, String ambiente, double velocidade){
		super(nome, comprimento, patas, cor, ambiente, velocidade);
	}
	
	public void mostrarAlimento(){
		System.out.println("Alimento: " + this.getAlimento());
	}
	
	public String getAlimento() {
		return alimento;
	}

	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}
}
