// A jornada de trabalho semanal de um funcionário é de 40 horas. O funcionário que trabalhar mais 
// de 40 horas receberá hora extra, cujo cálculo é o valor da hora regular com um acréscimo de 50%. 
// Escreva um algoritmo que leia o número de horas trabalhadas em um mês, o salário por hora e escreva 
// o salário total do funcionário, que deverá ser acrescido das horas extras, caso tenham sido trabalhadas 
// (considere que o mês possua 4 semanas exatas). 

package exercicioApostila1;

import java.util.Scanner;

public class HorasExtras {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Digite quantas horas foram trabalhadas esse mês: ");
		int horasMes = sc.nextInt();
		System.out.print("Digite o valor rescebido por hora trabalhada: ");
		double valorHora = sc.nextDouble();
		System.out.print("Digite seu salário mensal: ");
		double salarioMes = sc.nextDouble();
		
		double horaExtra = valorHora + (valorHora/2);
		
		if (horasMes > 160) {
			int diferenca = horasMes-160;
			double extraFinal = diferenca*horaExtra;
			System.out.println("Seu salário de: R$" + salarioMes + " com acrescimo de horas extras no valor de: R$" + extraFinal + 
					" será igual à: R$" + (salarioMes+extraFinal));
		}		
		sc.close();
	}
}
