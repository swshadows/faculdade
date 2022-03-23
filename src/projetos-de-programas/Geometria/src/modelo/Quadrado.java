package modelo;

public class Quadrado {
	public double lado, area, perimetro;
	
	public Quadrado(double lado){
		this.lado = lado;
		calcularArea();
		calcularPerimetro();
	}
	public Quadrado(){
		lado = 0.0;
		calcularArea();
		calcularPerimetro();
	}
	public void calcularArea(){
		area = lado * lado;
	}
	public void calcularPerimetro(){
		perimetro = 4 * lado;
	}
	public void imprimirDados(){
		System.out.println("Lado: " + lado);
		System.out.println("Perimetro: " + perimetro);
		System.out.println("Area: " + area);
		System.out.println("===============");
	}
}
