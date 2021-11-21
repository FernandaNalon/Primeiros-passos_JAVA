/*Faça um teste de mesa e complete o quadro a seguir para os seguintes valores 
 * das variáveis.*/

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
		        mens = "Triângulo Equilátero!";
		    } else if ((A == B) || (B == C) || (A == C)) {
		        mens = "Triângulo Isósceles!";
		    } else {
		        mens = "Triângulo Escaleno!";
		    }
		} else {
		    mens = "Não forma um triângulo!";
		}
		System.out.println("O triângulo será do tipo: " + mens);
		sc.close();
	}
}
