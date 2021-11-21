package exercicioApostila1;

import java.util.Scanner;

public class Antecessor {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um valor: ");
		int valor1 = sc.nextInt();
		System.out.print("O valor antecessor ao digitado é: " + (valor1-1));
		sc.close();
	}
}
