//) Ler as notas da 1a. e 2a. avalia��es de um aluno. Calcular a m�dia aritm�tica simples e escrever 
// uma mensagem que diga se o aluno foi ou n�o aprovado (considerar que nota igual ou maior que 6 o 
// aluno � aprovado). Escrever tamb�m a m�dia calculada. 

package exercicioApostila1;

import java.util.Scanner;

public class AprovacaoDeAluno {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Digite a nota da primeira avalia��o do aluno(a): ");
		double n1 = sc.nextDouble();
		System.out.print("Digite a nota da segunda avalia��o do aluno(a): ");
		double n2 = sc.nextDouble();
		
		double media = (n1+n2)/2;
		
		if (media >= 6) {
			System.out.print("A m�dia do aluno(a) foi: " + media + ". Logo, o aluno(a) est� aprovado(a).");
		} else if (media <= 5.9) {
			System.out.print("A m�dia do aluno(a) foi: " + media + ". Logo, o alino(a) est� reprovado(a).");
		}
		sc.close();
	}	
}
