package modelo;

public class Cachorro extends Bicho {

	public Cachorro() {
		super();
	}

	public Cachorro(String nome) {
		super(nome);
	}

	@Override
	public String som() {
		return ("Au!");
	}

}
