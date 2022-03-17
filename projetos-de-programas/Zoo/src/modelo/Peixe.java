package modelo;

import java.util.ArrayList;

public class Peixe extends Animal {
	ArrayList<String> caracteristicas = new ArrayList<String>();
	
	public Peixe(String nome, double comprimento, String cor, String ambiente, double velocidade){
		super(nome, comprimento, 0, cor, ambiente, velocidade);
	}
	
	public Peixe(){
		super();
		this.setPatas(0);
		this.setAmbiente("Mar");
		this.setCor("Cinzenta");
	}
	
	public void addCaracteristicas(String pCar){
		this.caracteristicas.add(pCar);
	}
	
	public void mostrarCaracteristicas(){
		for (int i = 0; i < this.caracteristicas.size(); i++){
			System.out.println(this.caracteristicas.get(i));
		}
	}
	
	public void excluirCaracteristicas(String pCar){
		this.caracteristicas.remove(pCar);
	}
	
}
