// Escreva um algoritmo para ler o sal�rio mensal atual de um 
// funcion�rio e o percentual de reajuste.
// Calcular e escrever o valor do novo sal�rio. 

package exercicioApostila1;

import java.util.Scanner;

public class SalarioMensal {
	public static void main (String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o seu sal�rio mensal: ");
		double salario = sc.nextDouble();
		
		System.out.print("Qual a porcentage de reajuste? ");
		double reajuste = sc.nextDouble();
		
		double salarioReajustado = salario + ((reajuste/100)*salario);
		
		System.out.print("O sal�rio reajustado ser�: R$" + salarioReajustado);
		sc.close();
	}
}
