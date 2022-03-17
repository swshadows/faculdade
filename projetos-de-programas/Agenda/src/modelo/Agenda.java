package modelo;

import java.util.ArrayList;

public class Agenda {
	ArrayList<Contato> dados;
	
	public Agenda(){
		dados = new ArrayList<Contato>();
	}
	
	public void inserirDados(Contato obj){
		this.dados.add(obj);
	}
	
	public void consultarDados(String pessoa){
		boolean achou = false;
		
		for (int i = 0; i < dados.size(); i++){
			if (pessoa.equals(this.dados.get(i).getNome())){
				this.dados.get(i).mostrarDados();
				achou = true;
			}
		}
		if (!achou){
			System.out.println(pessoa + " não encontrado(a)");
		}
	}
	
	public void listarDados(){
		for (int i = 0; i < this.dados.size(); i++){
			this.dados.get(i).mostrarDados();
		}
	}
}
