package modelo;

public class Gato {
	String nome;
	int idade;
	float peso;
	
	public Gato(String nome, int idade, float peso){
		this.nome = nome;
		this.idade = idade;
		this.peso = peso;
	}
	
	public Gato(){
		nome = "";
		idade = 0;
		peso = 0;
	}
	
	void imprimirDados(){
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Peso: " + peso);
		System.out.println("=================");
	}
}
