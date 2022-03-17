package modelo;

public class Produto {
	private float preco;
	private int tamanho;

	public Produto(float preco, int tamanho) {
		this.preco = preco;
		this.tamanho = tamanho;
	}

	public Produto() {

	}

	public void vendido() {
		System.out.println("Produto sendo vendido");
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
}
