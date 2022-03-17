package modelo;

public class Microondas {
	boolean ligado, portaFechada;
	
	public Microondas(boolean ligado){
		this.ligado = ligado;
	}
	
	void power(){
		if (portaFechada == true)
			ligado = true;
		else
			System.out.println("Não é possivel ligar com a porta aberta");
	}
	
	void fecharPorta(){
		portaFechada = true;
	}
	void abrirPorta(){
		portaFechada = false;
	}
	
	void imprimir(){
		if (ligado == true){
			if (portaFechada = true)
				System.out.println("Está ligado com a porta fechada");
			else
				System.out.println("Está ligado com a porta aberta");
		}
		if (ligado = false){
			if (portaFechada = true)
				System.out.println("Esta desligado com a porta fechada");
			else
				System.out.println("Esta desligado com a porta aberta");
		}
	}
}
