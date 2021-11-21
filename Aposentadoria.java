/* Fa�a um algoritmo que leia: o n�mero do empregado (c�digo), o ano
de seu nascimento e o ano de seu ingresso na empresa. O programa dever� escrever a idade e o tempo
de trabalho do empregado e a mensagem 'Requerer aposentadoria' ou 'N�o requerer'.*/

package exercicioApostila1;

import java.util.Scanner;

public class Aposentadoria {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Digite seu c�digo de funcion�rio: ");
		int codigo = sc.nextInt();
		System.out.print("Digite o ano de seu nascimento: ");
		int anoNasc = sc.nextInt();
		System.out.print("Digite o ano que ingrassou na empresa: ");
		int anoEmp = sc.nextInt();
		
		int tempoTrab = 2021-anoEmp;
		int idade = 2021-anoNasc;
		
		if (idade >= 65 || tempoTrab >= 30) {
			System.out.print("Requer aposentarioria.");
		} else if (idade >= 60 && tempoTrab >= 25) {
			System.out.print("Requer aposentadoria.");
		} else {
			System.out.print("N�o requer aposentadoria.");
		}
		
		
		sc.close();
	}
}
