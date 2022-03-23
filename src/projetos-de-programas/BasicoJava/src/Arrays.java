import javax.swing.JOptionPane;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] matx = new int[2][3];
		matx[0][0] = 1;
		matx[0][1] = 2;
		matx[0][2] = 3;
		matx[1][0] = 4;
		matx[1][1] = 5;
		matx[1][2] = 6;

		int soma = 0;
		for (int linha = 0; linha < 2; linha++) {
			for (int coluna = 0; coluna < 3; coluna++) {
				System.out.println(matx[linha][coluna]);
				soma += matx[linha][coluna];
			}

			JOptionPane.showMessageDialog(null, "Soma dos elementos da matriz: " + soma);
			System.exit(0);
		}

	}
}
