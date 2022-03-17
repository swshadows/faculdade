
public class Cliente {

	private Endereco end;
	private String nome;
	private int cpf;

	public Cliente() {

	}

	public Cliente(String nome, int cpf, Endereco end) {
		setEnd(end);
		this.nome = nome;
		this.cpf = cpf;
	}

	public Endereco getEnd() {
		return end;
	}

	public void setEnd(Endereco end) {

		if (end != null) {
			this.end = end;
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

}
