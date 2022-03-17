package modelo;

public class Fone {
	private String numero;
	private int DDD;
	
	public Fone(String numero, int DDD){
		this.setNumero(numero);
		this.setDDD(DDD);
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public int getDDD() {
		return DDD;
	}

	public void setDDD(int dDD) {
		DDD = dDD;
	}
}
