
public class Produto {
	String nome;
	double precoCusto;
	double precoVenda;
	double margemLucro;
	
	void alterarPreco(){
		precoVenda += 2;
		System.out.println("Novo preco de venda: " + precoVenda);
	}
	void calcularMargemLucro(){
		margemLucro = precoVenda - precoCusto;
		System.out.println("Margem de lucro: " + margemLucro);
	}
	void mostrarDadosProduto(){
		System.out.println("Nome do produto: " + nome);
		System.out.println("Preco de custo: " + precoCusto);
		System.out.println("Preco de venda: "+ precoVenda);
		System.out.println("Margem de lucro: " + margemLucro);
	}
}
