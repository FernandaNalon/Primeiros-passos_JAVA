// Ler dois valores (considere que não serão lidos valores iguais) e escrevê-los em ordem crescente. 

package exercicioApostila1;

import java.util.Scanner;

public class OrdemCrescente {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Digite um valor: ");
		int v1 = sc.nextInt();
		System.out.print("Digite um valor: ");
		int v2 = sc.nextInt();
		
		if (v1 > v2) {
			System.out.println("Os valores em ordem crescente ficam: " + v2 + " e " + v1);
		} else if (v2 > v1) {
			System.out.println("Os valores em ordem crescente ficam: " + v1 + " e " + v2);
		}
		sc.close();
	}
}
