package modelo;

import java.io.FileReader;

public class TratamentoErro {
	public static void main(String[] args) {
		int numeros[] = {1,2,3};
		
		try{
			FileReader read = new FileReader("teste.txt");
		} catch (Exception e){
			//System.out.println("Erro (" + e + ") em FileReader para teste.txt\n");
			System.out.println(e.getMessage());
		}
		
		System.out.println(numeros[0]);
		System.out.println(numeros[1]);
		System.out.println(numeros[2]);
		
		try {
			System.out.println(numeros[3]);
		}catch (Exception e){
			System.out.println("\nErro (" + e + ") em numeros[3]");
		}
		
		System.out.println("Terminou o programa.");
	}
}
