public class Calculadora {
	public double a, b;
	
	public double soma(double a, double b){
		return a+b;
	}
	public int soma(int a, int b){
		return a+b;
	}
	public String soma(String a, String b){
		return a+b;
	}
	public double subtracao(double a, double b){
		return a-b;
	}
	public double multiplicacao(double a, double b){
		return a*b;
	}
	public double divisao(double a, double b){
		return a/b;
	}
	public double exponenciacao(double a, double b){
		return Math.pow(a, b);
	}
	public double raizquadrada(double a){
		return Math.pow(a, 1/2);
	}
	public double geraRandomico(double a, double b){
		return ((a-b)*Math.random()+b);
	}
	public double log(double a){
		return Math.log(a);
	}
	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
		
		System.out.println(calc.soma(1, 2));
		System.out.println(calc.soma(3.9, 4.3));
		System.out.println(calc.soma("Abc","def"));
	}
}