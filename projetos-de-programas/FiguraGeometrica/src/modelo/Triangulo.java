package modelo;

public class Triangulo implements FiguraGeometrica {
	private int base, altura, l1, l2, l3;

	public Triangulo(int base, int altura, int l1, int l2, int l3) {
		this.setBase(base);
		this.setAltura(altura);
		this.setL1(l1);
		this.setL2(l2);
		this.setL3(l3);
	}

	@Override
	public String getNomeFigura() {
		return ("Triangulo");
	}

	@Override
	public double getArea() {
		return ((this.getBase() * this.getAltura()) / 2);
	}

	@Override
	public double getPerimetro() {
		return (this.getL1() + this.getL2() + this.getL3());
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getL1() {
		return l1;
	}

	public void setL1(int l1) {
		this.l1 = l1;
	}

	public int getL2() {
		return l2;
	}

	public void setL2(int l2) {
		this.l2 = l2;
	}

	public int getL3() {
		return l3;
	}

	public void setL3(int l3) {
		this.l3 = l3;
	}

}
