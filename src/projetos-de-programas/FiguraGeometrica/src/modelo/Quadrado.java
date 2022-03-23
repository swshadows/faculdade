package modelo;

public class Quadrado implements FiguraGeometrica {
	private int lado;

	public Quadrado(int lado) {
		this.setLado(lado);
	}

	@Override
	public String getNomeFigura() {
		return ("Quadrado");
	}

	@Override
	public double getArea() {
		return (this.getLado() * this.getLado());
	}

	@Override
	public double getPerimetro() {
		return (4 * this.getLado());
	}

	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}
}
