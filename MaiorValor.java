//Ler dois valores (considere que não serão lidos valores iguais) e escrever o maior deles. 

package exercicioApostila1;

import java.util.Scanner;

public class MaiorValor {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Escolha um valor: ");
		int v1 = sc.nextInt();
		System.out.print("Escolha outro valor: ");
		int v2 = sc.nextInt();
		
		if (v1 > v2) {
			System.out.print("O maior valor digitado foi: " + v1);
		} else if (v2 > v1) {
			System.out.print("O maior valor digitado foi: " + v2);
		}
		sc.close();
	}
}
