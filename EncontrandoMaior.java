// Ler 3 valores (considere que não serão informados valores iguais) e escrever o maior deles. 

package exercicioApostila1;

import java.util.Scanner;

public class EncontrandoMaior {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Digite um valor: ");
		int v1 = sc.nextInt();
		System.out.print("Digite um segundo valor: ");
		int v2 = sc.nextInt();
		System.out.print("Digite um terceiro valor: ");
		int v3 = sc.nextInt();
		
		if (v1 > v2 && v1 > v3) {
			System.out.println("O maior valor digitado foi: " + v1);
		} else if (v2 > v1 && v2 > v3) {
			System.out.println("O amior valor digitado foi: " + v2);
		} else if (v3 > v1 && v3 > v2) {
			System.out.println("O maior valor digitado foi: " + v3);
		}
		sc.close();
	}
}
