package modelo;

public class Televisor {
	boolean ligado;
	int canal, volume;
	int numeroCanais = 10, volumeMaximo = 100;
	
	public Televisor(boolean ligado, int canal, int volume){
		this.ligado = ligado;
		this.canal = canal;
		this.volume = volume;
	}
	
	void power(){
		ligado = ! ligado;
	}
	
	void canalAcima(){
		if (canal == numeroCanais)
			canal = 1;
		else
			canal++;
	}
	
	void canalAbaixo(){
		if (canal == 1)
			canal = numeroCanais;
		else
			canal--;
	}
	
	void volumeAcima(){
		if (volume == volumeMaximo)
			System.out.println("Volume já está no maximo");
		else
			volume++;
	}
	
	void volumeAbaixo(){
		if (volume == 0)
			System.out.println("Volume já está no minimo");
		else
			volume--;
	}
	
	void imprimir(){
		if (ligado = true)
			System.out.println("Está ligado");
		else
			System.out.println("Está desligado");
		System.out.println("Canal: " + canal);
		System.out.println("Volume: " + volume);
		System.out.println("Numero de canais sintonizados: " + numeroCanais);
		System.out.println("Volume maximo: " + volumeMaximo);
	}
}
