package execucao;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import modelo.Aluno;

public class Execucao {
	public static void main(String[] args) {

		Aluno al1 = new Aluno();

		try {
			FileInputStream fin = new FileInputStream("aluno.ser");
			ObjectInputStream ois = new ObjectInputStream(fin);

			al1 = (Aluno) ois.readObject();

			ois.close();
			al1.mostrarDados();
			fin.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		/*
		 * Aluno al1 = new Aluno("Josefino", 25, 10.0); Aluno al2 = new
		 * Aluno("João", 23, 9.0); Aluno al3 = new Aluno("Maria", 26, 5.0);
		 * 
		 * try { FileOutputStream fout = new FileOutputStream("aluno.ser");
		 * ObjectOutputStream oos = new ObjectOutputStream(fout);
		 * 
		 * oos.writeObject(al1);
		 * 
		 * oos.close(); fout.close(); } catch (Exception e) {
		 * System.out.println("ERRO FATAL: " + e); }
		 */

	}
}
