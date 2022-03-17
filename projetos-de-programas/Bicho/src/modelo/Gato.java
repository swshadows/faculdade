package modelo;

public class Gato extends Bicho {

	public Gato() {
		super();
	}

	public Gato(String nome) {
		super(nome);
	}

	@Override
	public String som() {
		return ("Miau!");

	}

}
