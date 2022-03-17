package modelo;

public class Venda {
	private Comprador c;
	private Vendedor v;
	private Produto p;

	public Venda(Comprador c, Vendedor v, Produto p) {
		this.c = c;
		this.v = v;
		this.p = p;
	}

	public Venda() {

	}

	public void concretizaVenda() {
		System.out.println("Venda efetuada");
		c.setVerba(c.getVerba() - p.getPreco());
		v.setComissao(v.getComissao() + (p.getPreco() * 0.1f));
		p.vendido();
	}

	public void cancelaVenda() {
		System.out.println("Venda cancelada");
	}

	public Comprador getC() {
		return c;
	}

	public void setC(Comprador c) {
		this.c = c;
	}

	public Vendedor getV() {
		return v;
	}

	public void setV(Vendedor v) {
		this.v = v;
	}

	public Produto getP() {
		return p;
	}

	public void setP(Produto p) {
		this.p = p;
	}
}
