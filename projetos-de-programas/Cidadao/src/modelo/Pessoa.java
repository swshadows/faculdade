package modelo;

import java.util.ArrayList;

public class Pessoa implements Contribuinte, Cidadao {
	private String nome;
	private double salario;
	private Carro carro;
	private ArrayList<Fone> telefone;

	public Pessoa(String nome, double salario, Carro carro) {
		this.setNome(nome);
		this.setSalario(salario);
		this.setCarro(carro);
		this.telefone = new ArrayList<Fone>();
	}

	public void mostrarPessoa() {
		System.out.println("_____DADOS DA PESSOA_____");
		System.out.println("Nome: " + this.getNome());
		System.out.println("Salario: " + this.getSalario());
		for (int i = 0; i < telefone.size(); i++) {
			System.out.println("Fone " + i + ": (" + this.telefone.get(i).getDDD() +") "+ this.telefone.get(i).getNumero());
		}
		System.out.println("_____DADOS DO CARRO____");
		System.out.println("Marca: " + this.carro.getMarca());
		System.out.println("Valor: " + this.carro.getValor());
		System.out.println("Placa: " + this.carro.getPlaca());
		System.out.println("Ano: " + this.carro.getAno());
	}

	public void adicionarFone(Fone numero) {
		this.telefone.add(numero);
	}

	public void removerFone(Fone numero) {
		this.telefone.remove(numero);
	}

	@Override
	public void votar() {
		System.out.println("Votando...");
	}

	@Override
	public String emitirRG() {
		return ("12345-65");
	}

	@Override
	public double calcularValorIR() {
		return (this.getSalario() - (this.getSalario() * 0.27));
	}

	@Override
	public double calcularIPVA() {
		return (this.carro.getValor() * 0.05);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public Carro getCarro() {
		return carro;
	}

	public void setCarro(Carro carro) {
		this.carro = carro;
	}

}
