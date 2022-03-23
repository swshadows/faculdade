package modelo;

import java.util.ArrayList;

public class Pedido {
	private int mesa;
	private ArrayList<Prato> pratos;

	public Pedido() {
		pratos = new ArrayList<Prato>();
		mesa = 0;
	}
	
	public Pedido(int mesa){
		pratos = new ArrayList<Prato>();
		this.mesa = mesa;
	}

	public void adicionarPrato(Prato obj) {
		pratos.add(obj);
	}

	public void removerPrato(Prato obj) {
		pratos.remove(obj);
	}

	public void mostrarPrato() {
		System.out.println("=======================");
		System.out.println("Mesa " + getMesa());
		for (int i = 0; i < pratos.size(); i++) {
			pratos.get(i).mostrarDadosPrato();
		}
	}

	public void emitirConta() {
		double conta = 0;
		for (int i = 0; i < pratos.size(); i++) {
			conta += pratos.get(i).getPreco();
		}
		System.out.println("Conta: R$ " + conta);
	}

	public void calcularQtdeCalorias() {
		double totalCal = 0;
		for (int i = 0; i < pratos.size(); i++) {
			totalCal += pratos.get(i).getCalorias();
		}
		System.out.println("Calorias: " + totalCal + " kcal");
	}

	public int getMesa() {
		return mesa;
	}

	public void setMesa(int mesa) {
		this.mesa = mesa;
	}

	public ArrayList<Prato> getPedidos() {
		return pratos;
	}

	public void setPedidos(ArrayList<Prato> pedidos) {
		this.pratos = pedidos;
	}

	public ArrayList<Prato> getPratos() {
		return pratos;
	}

	public void setPratos(ArrayList<Prato> pratos) {
		this.pratos = pratos;
	}
}
