package modelo;

public class Arrays {
	public static void main(String[] args) {
		Pessoa[] vPessoas = new Pessoa[3];
		
		vPessoas[0] = new Pessoa("Joao", "Rua 1", "1234-1234");
		vPessoas[1] = new Pessoa("Maria", "Rua 3", "4321-4321");
		vPessoas[2] = new Pessoa("Jose", "Rua 5", "9090-9090");
		
		for (int i = 0; i < vPessoas.length; i++){
			Pessoa p = vPessoas[i];
			p.imprimirDados();
		}
		
		
	}
}
