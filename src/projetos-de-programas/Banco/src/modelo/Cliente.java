package modelo;

public class Cliente {
	private String cpf;
	private String endereço;
	private String nome;
	private String telefone;
	private String dtNasc;

	public Cliente() {

	}

	public Cliente(String cpf, String endereco, String nome, String telefone, String dtNasc) {
		this.setCpf(cpf);
		this.setEndereço(endereco);
		this.setNome(nome);
		this.setTelefone(telefone);
		this.setDtNasc(dtNasc);
	}

	public void editarCliente(String cpf, String endereco, String nome, String telefone, String dtNasc){
		this.setCpf(cpf);
		this.setEndereço(endereco);
		this.setNome(nome);
		this.setTelefone(telefone);
		this.setDtNasc(dtNasc);
	}
	
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEndereço() {
		return endereço;
	}

	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getDtNasc() {
		return dtNasc;
	}

	public void setDtNasc(String dtNasc) {
		this.dtNasc = dtNasc;
	}

}
