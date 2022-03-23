package execucao;

import modelo.Engenheiro;
import modelo.Pessoa;
import modelo.Professor;

public class Execucao {
	public static void main(String[] args) {
		Engenheiro eng1 = new Engenheiro("Marcos", "123.123.123-12", 12333445);
		Engenheiro eng2 = new Engenheiro("Josefino", "222.222.222-22", 12334124);
		Pessoa pes1 = new Pessoa("Joao", "379.821.379-12");
		Professor prof1 = new Professor("Astolfo", "234.234.234-23", "Doutor");
		
		eng1.mostrarDadosPessoa();
		eng1.emitirAnaliseTecnica();
		eng1.projetar();
		eng1.respirar();
		
		eng2.mostrarDadosPessoa();
		eng2.respirar();
		eng2.projetar();
		eng2.emitirAnaliseTecnica();
		
		pes1.mostrarDadosPessoa();
		pes1.respirar();
		
		prof1.mostrarDadosPessoa();
		prof1.respirar();
		prof1.corrigirProva();
		
		if (eng1 instanceof Engenheiro){
			System.out.println("******");
			System.out.println(eng1.getNome() + " é engenheiro");
		}
		if (eng1 instanceof Pessoa){
			System.out.println(eng1.getNome() + " é pessoa");
		}
		if(pes1 instanceof Engenheiro){
			System.out.println(pes1.getNome() + " é engenheiro");
		}else {
			System.out.println(pes1.getNome() + " NÃO é engenheiro!");
		}
		if (prof1 instanceof Pessoa){
			System.out.println("******");
			System.out.println(prof1.getTitulacao() + " " + prof1.getNome() + " é pessoa");
		} else{
			System.out.println(prof1.getTitulacao() + " " + prof1.getNome() + " NÃO é pessoa");
		}
		
	}
}
