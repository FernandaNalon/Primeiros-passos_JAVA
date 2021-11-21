//) Faça um algoritmo que leia três notas de um aluno, calcule e escreva a média 
// final deste aluno. Considerar que a média é ponderada e que o peso das notas 
// é 2, 3 e 5.

package exercicioApostila1;

import java.util.Scanner;

public class MediaPonderada {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a primeira nota: ");
		double n1 = sc.nextDouble();
		
		System.out.print("Digite a segunda nota: ");
		double n2 = sc.nextDouble();
		
		System.out.print("Digite a terceira nota: ");
		double n3 = sc.nextDouble();
		
		double mediaPonderada = ((n1*2) + (n2*3) + (n3*5))/10;
		
		System.out.print("A média ponderada será igual a: " + mediaPonderada);
		sc.close();
	}
}
