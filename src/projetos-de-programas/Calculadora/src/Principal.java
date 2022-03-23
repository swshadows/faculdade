import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Calculadora  calc = new Calculadora();
		//Implementa entrada de valores e conversão de dados
		String v1 = JOptionPane.showInputDialog("Digite valor 1");
		int valor1 = Integer.parseInt(v1);
		
		String v2 = JOptionPane.showInputDialog("Digite valor 2");
		int valor2 = Integer.parseInt(v2);
		
		//Operação SOMA
		calc.soma(valor1, valor2);
		//Implementa a saída do programa
		JOptionPane.showMessageDialog(null, "O resultado da SOMA: " + calc.getResultado());
		*/
		
		String resposta = JOptionPane.showInputDialog("Forneça sua resposta sim ou não");
		if(resposta.equals("sim")){
			JOptionPane.showMessageDialog(null, "sua resposta foi sim");
		}else{
			JOptionPane.showMessageDialog(null, "sua resposta foi não");
		}
		
	}

}
