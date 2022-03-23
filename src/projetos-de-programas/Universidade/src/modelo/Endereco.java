package modelo;

public class Endereco {
	private String rua, bairro, cep, cidade = "Manaus", estado = "AM";
	private int numero;

	public Endereco() {
		rua = "";
		bairro = "";
		numero = 0;
		cep = "";
	}

	public Endereco(String rua, String bairro, int numero, String cep) {
		this.rua = rua;
		this.bairro = bairro;
		this.numero = numero;
		this.cep = cep;
	}
	
	public Endereco(String rua, String bairro, int numero, String cep, String cidade, String estado){
		this.rua = rua;
		this.bairro = bairro;
		this.numero = numero;
		this.cep = cep;
		this.cidade = cidade;
		this.estado = estado;
	}

	public void mostrarEndereco() {
		System.out.println("Rua: " + getRua());
		System.out.println("Numero: " + getNumero());
		System.out.println("Bairro: " + getBairro());
		System.out.println("CEP: " + getCep());
		System.out.println("Cidade: " + getCidade());
		System.out.println("Estado: " + getEstado());
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
}
