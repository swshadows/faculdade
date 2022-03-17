package modelo;

public class Circulo {
	private double raio, area, perimetro;
	
	public Circulo(){
		raio = 0.0;
		calcularArea();
		calcularPerimetro();
	}
	
	public Circulo(double raio){
		this.raio = raio;
		calcularArea();
		calcularPerimetro();
	}
	
	public void calcularArea(){
		area = Math.PI * raio * raio;
	}
	public void calcularPerimetro(){
		perimetro = 2 * Math.PI * raio;
	}
	public void imprimirDados(){
		System.out.println("Raio: " + raio);
		System.out.println("Area: " + area);
		System.out.println("Perimetro: " + perimetro);
		System.out.println("===============");
	}
	public double getArea(){
		return this.area;
	}
	public double getRaio(){
		return this.raio;
	}
	public double getPerimetro(){
		return this.perimetro;
	}
	public void setRaio(double raio){
		this.raio = raio;
		calcularArea();
		calcularPerimetro();
	}
}
