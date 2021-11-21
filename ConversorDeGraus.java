// Escreva um algoritmo para ler uma temperatura em graus Fahrenheit, 
// calcular e escrever o valor correspondente em graus Celsius

package exercicioApostila1;

import java.util.Scanner;

public class ConversorDeGraus {
	public static void main (String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o valor em °Fahrenheit e descubra quals °Celsius serão:");
		double grausF = sc.nextDouble();
		
		double grausC = ((grausF - 32)*5)/9;
		
		System.out.print("A temperatura será: " + grausC + "°C.");
		sc.close();
	}
}
