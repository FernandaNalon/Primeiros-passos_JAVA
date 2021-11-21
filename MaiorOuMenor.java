// Ler um valor e escrever a mensagem "É MAIOR QUE 10" se o valor lido for maior que 10, caso contrário escrever "NÃO É
// MAOR QUE 10".

package exercicioApostila1;

import java.util.Scanner;

public class MaiorOuMenor {
	public static void main (String[]args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Digite um valor: ");
		int valor = sc.nextInt();
		
		if (valor >= 10) {
			System.out.print("MAIOR QUE 10!");
		} else if (valor <= 9) {
			System.out.print("MENOR QUE DEZ!");
		}
		sc.close();
	}
}
