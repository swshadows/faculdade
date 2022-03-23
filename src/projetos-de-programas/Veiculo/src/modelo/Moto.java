package modelo;

public class Moto {
	String marca, modelo, cor;
	int marcha;
	int menorMarcha = 0, maiorMarcha = 4;
	boolean ligada;
	
	public Moto(String marca, String modelo, String cor, int marcha, boolean ligada){
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.marcha = marcha;
		this.ligada = ligada;
	}
	public Moto(){
		marca = "";
		modelo = "";
		cor = "";
		marcha = 0;
		ligada = false;
	}
	
	public void power(){
		ligada = ! ligada;
	}
	
	public void marchaAcima(){
		if (ligada = true && marcha < maiorMarcha)
			marcha++;
		else
			System.out.println("Já está na marcha maxima");
	}
	public void marchaAbaixo(){
		if (ligada = true && marcha > menorMarcha)
			marcha--;
		else
			System.out.println("Já está na marcha minima");
	}
	public void imprimir(){
		System.out.println("Marca: " + marca);
		System.out.println("Modelo: " + modelo);
		System.out.println("Cor: " + cor);
		System.out.println("Marcha: " + marcha);
	}
}
