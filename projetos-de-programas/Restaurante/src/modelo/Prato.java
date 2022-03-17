package modelo;

public class Prato {
	private String descricao;
	private double preco;
	private int calorias;

	public Prato() {
		descricao = "";
		preco = 0;
		calorias = 0;
	}

	public Prato(String descricao, double preco, int calorias) {
		this.descricao = descricao;
		this.preco = preco;
		this.calorias = calorias;
	}

	public void mostrarDadosPrato() {
		System.out.println("=======================");
		System.out.println("Nome: " + getDescricao());
		System.out.println("Preço: R$ " + getPreco());
		System.out.println("Calorias: " + getCalorias() + " kcal");
		System.out.println("=======================");
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getCalorias() {
		return calorias;
	}

	public void setCalorias(int calorias) {
		this.calorias = calorias;
	}
}
