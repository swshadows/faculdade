package modelo;

public class Vendedor {
	private float comissao;

	public Vendedor(float comissao) {
		this.comissao = comissao;
	}

	public Vendedor() {

	}

	public void vende() {
		System.out.println("Vendido");
	}

	public float getComissao() {
		return comissao;
	}

	public void setComissao(float comissao) {
		this.comissao = comissao;
	}
}
