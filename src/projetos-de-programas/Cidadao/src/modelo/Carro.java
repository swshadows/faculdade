package modelo;

public class Carro {
	private String marca;
	private double valor;
	private String placa;
	private int ano;

	public Carro(String marca, double valor, String placa, int ano) {
		this.setMarca(marca);
		this.setValor(valor);
		this.setPlaca(placa);
		this.setAno(ano);
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
}
