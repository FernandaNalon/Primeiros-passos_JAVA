//) Fa�a um algoritmo que leia tr�s notas de um aluno, calcule e escreva a m�dia 
// final deste aluno. Considerar que a m�dia � ponderada e que o peso das notas 
// � 2, 3 e 5.

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
		
		System.out.print("A m�dia ponderada ser� igual a: " + mediaPonderada);
		sc.close();
	}
}
