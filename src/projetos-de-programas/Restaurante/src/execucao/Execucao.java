package execucao;

import modelo.Pedido;
import modelo.Prato;
import modelo.Restaurante;

public class Execucao {
	public static void main(String[] args) {
		Prato prato1 = new Prato("Lasanha", 9.99, 1000);
		Prato prato2 = new Prato("Frago Assado", 9.99, 200);
		Prato prato3 = new Prato("Jabá", 14.99, 1000);
		Prato prato4 = new Prato("Bife", 11.99, 500);
		
		Pedido ped1 = new Pedido(2);
		Pedido ped2 = new Pedido(4);
		
		Restaurante rest1 = new Restaurante();
		
		ped1.adicionarPrato(prato1);
		ped1.adicionarPrato(prato2);
		ped2.adicionarPrato(prato3);
		ped2.adicionarPrato(prato4);
		
		/*ped1.mostrarPrato();
		ped1.emitirConta();
		ped1.calcularQtdeCalorias();
		
		ped2.mostrarPrato();
		ped2.emitirConta();
		ped2.calcularQtdeCalorias();*/
		
		rest1.cadastrarPedido(ped1);
		rest1.cadastrarPedido(ped2);
		rest1.mostrarPedido();
		
		/*rest1.removerPedido(ped2);
		rest1.mostrarPedido();*/
		
		/*ped1.removerPrato(prato2);
		ped1.mostrarPrato();*/
	}
}
