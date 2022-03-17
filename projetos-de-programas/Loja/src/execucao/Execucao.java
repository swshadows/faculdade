package execucao;

import modelo.Comprador;
import modelo.Produto;
import modelo.Venda;
import modelo.Vendedor;

public class Execucao {
	public static void main(String[] args) {
		Produto p1 = new Produto(1000, 200);
		Produto p2 = new Produto(200, 25);
		Produto p3 = new Produto(250, 15);

		Vendedor v1 = new Vendedor(0);
		Vendedor v2 = new Vendedor(100);

		Comprador c1 = new Comprador(400);
		Comprador c2 = new Comprador(600);

		Venda vnd = new Venda(c1, v1, p1);
		vnd.concretizaVenda();
	}
}
