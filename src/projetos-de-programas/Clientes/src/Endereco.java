
public class Endereco {

	private int num;
	private String rua;
	private int cep;
	private String complemento;

	public Endereco() {

	}

	public Endereco(int num, String rua, int cep, String complemento) {
		this.num = num;
		this.rua = rua;
		this.cep = cep;
		this.complemento = complemento;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public int getCep() {
		return cep;
	}

	public void setCep(int cep) {
		this.cep = cep;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

}
