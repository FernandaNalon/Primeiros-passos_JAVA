// A jornada de trabalho semanal de um funcion�rio � de 40 horas. O funcion�rio que trabalhar mais 
// de 40 horas receber� hora extra, cujo c�lculo � o valor da hora regular com um acr�scimo de 50%. 
// Escreva um algoritmo que leia o n�mero de horas trabalhadas em um m�s, o sal�rio por hora e escreva 
// o sal�rio total do funcion�rio, que dever� ser acrescido das horas extras, caso tenham sido trabalhadas 
// (considere que o m�s possua 4 semanas exatas). 

package exercicioApostila1;

import java.util.Scanner;

public class HorasExtras {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Digite quantas horas foram trabalhadas esse m�s: ");
		int horasMes = sc.nextInt();
		System.out.print("Digite o valor rescebido por hora trabalhada: ");
		double valorHora = sc.nextDouble();
		System.out.print("Digite seu sal�rio mensal: ");
		double salarioMes = sc.nextDouble();
		
		double horaExtra = valorHora + (valorHora/2);
		
		if (horasMes > 160) {
			int diferenca = horasMes-160;
			double extraFinal = diferenca*horaExtra;
			System.out.println("Seu sal�rio de: R$" + salarioMes + " com acrescimo de horas extras no valor de: R$" + extraFinal + 
					" ser� igual �: R$" + (salarioMes+extraFinal));
		}		
		sc.close();
	}
}
