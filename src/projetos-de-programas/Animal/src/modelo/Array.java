package modelo;

public class Array {
	public static void main(String[] args) {
		/*String[] gato = new String[4];
		gato[0] = "Garfield";
		gato[1] = "Tom";
		gato[2] = "Frajola";
		gato[3] = "Tião";
		
		for (int i = 0; i < gato.length; i++){
			System.out.println("Nome: " + gato[i]);
		}*/
		
		Gato[] bichanosMesmo = new Gato[3];
		bichanosMesmo[0] = new Gato();
		bichanosMesmo[1] = new Gato();
		bichanosMesmo[2] = new Gato();
		
		bichanosMesmo[0].nome = "Garfield";
		bichanosMesmo[0].idade = 2;
		bichanosMesmo[0].peso = 35;
		//bichanosMesmo[0].imprimirDados();
		
		for (int i = 0; i < bichanosMesmo.length; i++){
			Gato g = bichanosMesmo[i];
			g.imprimirDados();
		}
	}
}
