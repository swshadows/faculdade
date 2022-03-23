package modelo;

public class Comprador {
	private float verba;

	public Comprador(float verba) {
		this.verba = verba;
	}

	public Comprador() {

	}

	public void compra() {
		System.out.println("Comprando");
	}

	public float getVerba() {
		return verba;
	}

	public void setVerba(float verba) {
		this.verba = verba;
	}
}
