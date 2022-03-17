
public class Calculadora {

	private int resultado;
	private int valor1;
	private int valor2;
	
	
	public void Calculadora(){}


	public int getResultado() {
		return resultado;
	}


	public void setResultado(int resultado) {
		this.resultado = resultado;
	}


	public int getValor1() {
		return valor1;
	}


	public void setValor1(int valor1) {
		this.valor1 = valor1;
	}


	public int getValor2() {
		return valor2;
	}


	public void setValor2(int valor2) {
		this.valor2 = valor2;
	}	
	
	public int soma(int v1, int v2){
		
		valor1 = v1;
		valor2 = v2;
		resultado = valor1 + valor2;
		return resultado;
	}
	
	public int subtracao(int v1, int v2){
		
		setValor1(v1);
		setValor2(v2);
		
		resultado = valor1 - valor2;
		setResultado(resultado);
		
		return getResultado();
	}
	
	public int multiplicacao(int v1, int v2){
		
		setValor1(v1);
		setValor2(v2);
				
		setResultado(getValor1() * getValor2());
		
		return getResultado();
	}
	
	public float divisao(int v1, int v2){
		
		setValor1(v1);
		setValor2(v2);
		setResultado(getValor1() / getValor2());		
		
		
		return getResultado();
	}
}
