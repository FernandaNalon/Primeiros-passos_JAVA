/*Ler dois valores e imprimir uma das três mensagens a seguir:
‘Números iguais’, caso os números sejam iguais
‘Primeiro é maior’, caso o primeiro seja maior que o segundo;
‘Segundo maior’, caso o segundo seja maior que o primeiro.*/

package exercicioApostila1;

import java.util.Scanner;

public class DizerOMaior {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Digite um valor: ");
		int valor1 = sc.nextInt();
		System.out.print("Digite o segundo valor: ");
		int valor2 = sc.nextInt();
		
		if (valor1 == valor2) {
			System.out.println("Números iguais.");
		} else if (valor1 > valor2) {
			System.out.print("Primeiro é maior.");
		} else if (valor2 > valor1) {
			System.out.print("Segundo é maior.");
		}
		sc.close();
	}
}
