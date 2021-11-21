/*Faça um algoritmo para ler as 3 notas obtidas por um aluno nas 3 verificações e a média dos
exercícios que fazem parte da avaliação. Calcular a média de aproveitamento, usando a fórmula abaixo
e escrever o conceito do aluno de acordo com a tabela de conceitos.*/

package exercicioApostila1;

import java.util.Scanner;

public class MediaAritmetica {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Digite a primeira nota do aluno(a): ");
		int n1 = sc.nextInt();
		System.out.print("Digite a segunda nota do aluno(a): ");
		int n2 = sc.nextInt();
		System.out.print("Digite a terceira nota do aluno(a): ");
		int n3 = sc.nextInt();
		System.out.print("Digite a média dos exercícios do aluno(a): ");
		int mediaEx = sc.nextInt();
		
		double mediaArit = (n1 + (n2*2) + (n3*3) + mediaEx)/7;
		
		if (mediaArit >= 9) {
			System.out.println("O(a) alono(a) recebeu nota A!");
		} else if (mediaArit >= 7.5 && mediaArit < 9.0) {
			System.out.println("O(a) alono(a) recebeu nota B!");
		} else if (mediaArit > 6.0 && mediaArit < 7.5) {
			System.out.println("O(a) alono(a) recebeu nota C!");
		} else if (mediaArit < 5.9) {
			System.out.println("O(a) alono(a) recebeu nota D!");
		}
		sc.close();
	}
}
