package exercicioApostila1;

import java.util.Scanner;

public class Sucessor {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um valor: ");
		int valor1 = sc.nextInt();
		System.out.print("O valor sucessor ao digitado é: " + (valor1+1));
		sc.close();
	}
}
