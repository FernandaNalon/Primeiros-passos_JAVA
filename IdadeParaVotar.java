// Ler o ano atual e o ano de nascimento de uma pessoa. Escrever uma mensagem que diga se ela 
// poderá ou não votar este ano (não é necessário considerar o mês em que a pessoa nasceu). 

package exercicioApostila1;

import java.util.Scanner;

public class IdadeParaVotar {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Digite em que ano estamos: ");
		int anoAtual = sc.nextInt();
		System.out.print("Digite o seu ano de nascimento: ");
		int anoNasc = sc.nextInt();
		
		int idade = anoAtual-anoNasc;
		
		if (idade >= 16 && idade < 18 || idade >= 65) {
			System.out.print("Você possui " + idade + " anos. Você poderá votar! (opcional)");
		} else if (idade >= 18) {
			System.out.print("Você possui " + idade + " anos. O voto é obrigatório.");
		} else if (idade<= 15) {
			System.out.print("Você possui " + idade + " anos. Ainda não atingiu a idade necessária para votar!");
		}
		sc.close();
	}
}
