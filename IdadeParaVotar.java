// Ler o ano atual e o ano de nascimento de uma pessoa. Escrever uma mensagem que diga se ela 
// poder� ou n�o votar este ano (n�o � necess�rio considerar o m�s em que a pessoa nasceu). 

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
			System.out.print("Voc� possui " + idade + " anos. Voc� poder� votar! (opcional)");
		} else if (idade >= 18) {
			System.out.print("Voc� possui " + idade + " anos. O voto � obrigat�rio.");
		} else if (idade<= 15) {
			System.out.print("Voc� possui " + idade + " anos. Ainda n�o atingiu a idade necess�ria para votar!");
		}
		sc.close();
	}
}
