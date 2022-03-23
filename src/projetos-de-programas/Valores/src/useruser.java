import java.util.Scanner;

public class useruser {
	
	public static void main(String[] args) {
		String nome;
		int idade;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Informe seu nome: ");
		nome = in.nextLine();
		System.out.println("Informe sua idade: ");
		idade = in.nextInt();
		
		System.out.println("Nome: " + nome + "\nIdade: " + idade);
	}
}
