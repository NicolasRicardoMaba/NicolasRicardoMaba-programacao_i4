package Ex8;

import java.util.Scanner;//biblioteca do Scanner
import java.util.ArrayList;//biblioteca Array

public class vrom {
	public static void main(String[] args) {

		String[] vetor = new String[10];

		Scanner leitura = new Scanner(System.in);

		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Insira valor");
			vetor[i] = leitura.nextLine();
		}
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Vetor posição:" + i + "é igual:" + vetor[i]);
		}
		System.out.println("O valor final do vetor é:"+ vetor[vetor.length - 1]);

	}
}