package modelo;

public class Eletrodomestico {
	boolean ligado;
	
	public Eletrodomestico(boolean ligado){
		this.ligado = ligado;
	}
	
	public Eletrodomestico(){
		ligado = false;
	}
	
	public void power(){
		ligado = ! ligado;
	}
	
	public void imprimir(){
		if (ligado = true)
			System.out.println("Está ligado");
		else
			System.out.println("Está desligado");
	}
}
