import javax.swing.JOptionPane;

public class IndiceMassaCorporal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PesoIdeal pi =  new PesoIdeal();
		
		String p = JOptionPane.showInputDialog("Forneça a massa corporal (peso)...");
		double peso = Double.parseDouble(p);
		
		String a = JOptionPane.showInputDialog("Forneça a altura...");
		double altura = Double.parseDouble(a);
		
		pi.Imc(peso, altura);
		
		if(pi.getImc() < 18.5){
			JOptionPane.showMessageDialog(null, "Abaixo do peso");
		}else if(18.5 <= pi.getImc() && pi.getImc() < 25.0){
			JOptionPane.showMessageDialog(null, "Peso Ideal");
		}else if(25.0 <= pi.getImc() && pi.getImc() < 30.0){
			JOptionPane.showMessageDialog(null, "Levemente acima do peso");
		}else if(30.0 <= pi.getImc() && pi.getImc() < 35.0){
			JOptionPane.showMessageDialog(null, "Obesidade Grau I");
		}else if(35.0 <= pi.getImc() && pi.getImc() < 40.0){
			JOptionPane.showMessageDialog(null, "Obesidade Grau II (severa)");
		}else{
			JOptionPane.showMessageDialog(null, "Obesidade Grau III (mórbida)");
		}
	}
}
