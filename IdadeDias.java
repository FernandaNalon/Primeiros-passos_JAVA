// Faça um algoritmo que leia a idade de uma pessoa expressa em anos, 
// meses e dias e escreva a idade dessa pessoa expressa apenas em dias.
// Considerar ano com 365 dias e mês com 30 dias.

package exercicioApostila1;

import java.util.Scanner;

public class IdadeDias {
	public static void main (String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite quantos anos você tem: ");
		int idade = sc.nextInt();
		System.out.print("Digite quantos meses se passaram desde seu aniversário: ");
		int idadeMeses = sc.nextInt();
		System.out.print("Digite quantos dias passaram desde o dia de seu aniversário: ");
		int idadeDias = sc.nextInt();
		
		int subIdade = idade*365;
		int subIdade2 = idadeMeses*30;
		int totalIdade = subIdade+subIdade2+idadeDias;
		
		System.out.print("Sua idade expressa em dias será: " + totalIdade + " dias.");
		sc.close();
	}
}
