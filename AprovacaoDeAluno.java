//) Ler as notas da 1a. e 2a. avaliações de um aluno. Calcular a média aritmética simples e escrever 
// uma mensagem que diga se o aluno foi ou não aprovado (considerar que nota igual ou maior que 6 o 
// aluno é aprovado). Escrever também a média calculada. 

package exercicioApostila1;

import java.util.Scanner;

public class AprovacaoDeAluno {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Digite a nota da primeira avaliação do aluno(a): ");
		double n1 = sc.nextDouble();
		System.out.print("Digite a nota da segunda avaliação do aluno(a): ");
		double n2 = sc.nextDouble();
		
		double media = (n1+n2)/2;
		
		if (media >= 6) {
			System.out.print("A média do aluno(a) foi: " + media + ". Logo, o aluno(a) está aprovado(a).");
		} else if (media <= 5.9) {
			System.out.print("A média do aluno(a) foi: " + media + ". Logo, o alino(a) está reprovado(a).");
		}
		sc.close();
	}	
}
