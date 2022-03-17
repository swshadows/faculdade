package modelo;

public class Pessoa {
	
	//Atributos public para ficar visivel para outros pacotes
	//Atributos private para encapsular os atributos
	private String nome, endereco, telefone;
	
	//Construtor
	public Pessoa(String nome, String endereco, String fone){
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = fone;
	}
	//Metodo public para ficar visivel para outros pacotes
	public void imprimirDados(){
		System.out.println("Nome da pessoa: " + nome);
		System.out.println("Endereço da pessoa: " + endereco);
		System.out.println("Telefone da pessoa: " + telefone);
		System.out.println("=====================");
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
}
