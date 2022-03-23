package modelo;

import java.io.Serializable;

public class Aluno implements Serializable {
	private String nome;
	private int idade;
	private double media;

	public Aluno() {

	}

	public Aluno(String nome, int idade, double media) {
		this.setNome(nome);
		this.setIdade(idade);
		this.setMedia(media);
	}

	public void mostrarDados() {
		System.out.println("Nome: " + this.getNome());
		System.out.println("Idade: " + this.getIdade());
		System.out.println("Média: " + this.getMedia());
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getMedia() {
		return media;
	}

	public void setMedia(double media) {
		this.media = media;
	}

}
