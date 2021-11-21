/*Fa�a um teste de mesa e complete o quadro a seguir para os seguintes valores 
 * das vari�veis.*/

package exercicioApostila1;

import java.util.Scanner;

public class TesteDeMesa2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Digite o valor de A: ");
		int A = sc.nextInt();
		System.out.print("Digite o valor de B: ");
		int B = sc.nextInt();
		System.out.print("Digite o valor de C: ");
		int C = sc.nextInt();
		
		var mens = "";
		
		if ((A < B + C) && (B < A + C) && (C < A + B)) {
		    if ((A == B) && (B == C)) {
		        mens = "Tri�ngulo Equil�tero!";
		    } else if ((A == B) || (B == C) || (A == C)) {
		        mens = "Tri�ngulo Is�sceles!";
		    } else {
		        mens = "Tri�ngulo Escaleno!";
		    }
		} else {
		    mens = "N�o forma um tri�ngulo!";
		}
		System.out.println("O tri�ngulo ser� do tipo: " + mens);
		sc.close();
	}
}
