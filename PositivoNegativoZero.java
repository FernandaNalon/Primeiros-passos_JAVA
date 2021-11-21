// Ler um valor e escrever se é positivo, negativo ou zero.

package exercicioApostila1;

import java.util.Scanner;

public class PositivoNegativoZero {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Escolha um valor: ");
		int valor = sc.nextInt();
		
		if (valor == 0){
			System.out.println("O valor é igual a 0!");
		} else if (valor > 0) {
			System.out.println("O valor é positivo!");
		} else if (valor < 0) {
			System.out.println("O valor é negativo!");
		}
		sc.close();
	}
}
