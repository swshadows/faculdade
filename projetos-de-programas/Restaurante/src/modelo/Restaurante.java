package modelo;

import java.util.ArrayList;

public class Restaurante {
	private ArrayList<Pedido> pedidos;

	public Restaurante() {
		pedidos = new ArrayList<Pedido>();
	}

	public void cadastrarPedido(Pedido obj) {
		pedidos.add(obj);
	}

	public void removerPedido(Pedido obj) {
		pedidos.remove(obj);
	}

	public void mostrarPedido() {
		for (int i = 0; i < pedidos.size(); i++) {
			pedidos.get(i).mostrarPrato();
			;
		}
	}

	public ArrayList<Pedido> getPedidos() {
		return pedidos;
	}

	public void setPedidos(ArrayList<Pedido> pedidos) {
		this.pedidos = pedidos;
	}
}
