// Ler um valor e escrever se � positivo ou negativo (considere o valor zero como positivo).

package exercicioApostila1;

import java.util.Scanner;

public class PositivoOuNegativo {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Digit um valor: ");
		int valor = sc.nextInt();
		
		if (valor>= 0) {
			System.out.println("O valor digitado � positivo!");
		} else if (valor < 0) {
			System.out.println("O valor digitado � negativo!");
		}
		sc.close();
	}
}
