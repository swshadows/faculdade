
public class PesoIdeal {

	private double altura;
	private double peso;
	private double imc;
	
	public void PesoIdeal(){}
	
	public double getImc() {
		return imc;
	}

	public void setImc(double imc) {
		this.imc = imc;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public double Imc(double peso, double altura){
		
		setAltura(altura);
		setPeso(peso);		
		setImc(getPeso() / Math.pow(getAltura(),2));
		
		return getImc();
		 
	}
}
