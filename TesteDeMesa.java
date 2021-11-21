/*Faça um teste de mesa e complete o quadro a seguir para os seguintes valores.*/

package exercicioApostila1;

import java.util.Scanner;

public class TesteDeMesa {
	public static void main (String[]args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Digite o valor de 'X' da apostila: ");
		int X = sc.nextInt();
		System.out.print("Digite o valor de 'Y' da apostila: ");
		int Y = sc.nextInt();
		
		int Z = (X*Y)+5;
		System.out.println("O valor de Z é = " + Z);
		
		if (Z <= 0) {
			System.out.println("A resposta é 'A'.");
		} else if (Z <= 100) {
			System.out.println("A resposta é 'B'.");
		} else {
			System.out.println("A resposta é 'C'.");
		}
		sc.close();
	}
}
