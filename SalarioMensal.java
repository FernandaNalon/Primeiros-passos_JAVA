// Escreva um algoritmo para ler o salário mensal atual de um 
// funcionário e o percentual de reajuste.
// Calcular e escrever o valor do novo salário. 

package exercicioApostila1;

import java.util.Scanner;

public class SalarioMensal {
	public static void main (String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o seu salário mensal: ");
		double salario = sc.nextDouble();
		
		System.out.print("Qual a porcentage de reajuste? ");
		double reajuste = sc.nextDouble();
		
		double salarioReajustado = salario + ((reajuste/100)*salario);
		
		System.out.print("O salário reajustado será: R$" + salarioReajustado);
		sc.close();
	}
}
