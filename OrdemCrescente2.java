// Ler 3 valores (considere que não serão informados valores iguais) e escrevê-los em ordem
// crescente. 

package exercicioApostila1;

import java.util.Scanner;

public class OrdemCrescente2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite um valor: ");
		int v1 = sc.nextInt();
		System.out.println("Digite o segundo valor: ");
		int v2 = sc.nextInt();
		System.out.println("Digite o terceiro valor: ");
		int v3 = sc.nextInt();
		
		if (v1 > v2 && v2 > v3) {
			System.out.println("Os valores em ordem crescente são: " + v3 + "... " + v2 + "... " + v1);
		} else if (v1 > v2 && v3 > v2) {
			System.out.println("Os valores em ordem crescente são: " + v2 + "... " + v3 + "... " + v1);
		} else if (v2 > v1 && v1 > v3) {
			System.out.println("Os valores em ordem crescente são: " + v3 + "... " + v1 + "... " + v2);
		} else if (v2 > v3 && v3 > v1) {
			System.out.println("Os valores em ordem crescente são: " + v1 + "... " + v3 + "... " + v2);
		} else if (v3 > v1 && v1 > v2) {
			System.out.println("Os valores em ordem crescente são: " + v2 + "... " + v1 + "... " + v3);
		} else if (v3 > v2 && v2 > v1) {
			System.out.println("Os valores em ordem crescente são: " + v1 + "... " + v2 + "... " + v3);
		}
		sc.close();
	}
}
