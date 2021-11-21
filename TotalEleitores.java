// Escreva um algoritmo para ler o número total de eleitores de um 
// município, o número de votos brancos, nulos e válidos. 
// Calcular e escrever o percentual que cada um representa em relação 
// ao total de eleitores. 

package exercicioApostila1;

import java.util.Scanner;

public class TotalEleitores {
	public static void main (String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o número total de eleitores: ");
		int eleitores = sc.nextInt();
		System.out.print("Digite o número de votos brancos: ");
		float votosBrancos = sc.nextInt();
		System.out.print("Digite o número de votos nulos: ");
		float votosNulos = sc.nextInt();
		System.out.print("Digite o número de votos válidos: ");
		float votosValidos = sc.nextInt();
		
		float calcVotosBrancos = (votosBrancos/100)*eleitores;
		float calcVotosNulos = (votosNulos/100)*eleitores;
		float calcVotosValidos = (votosValidos/100)*eleitores;
		
		System.out.println("O número total de eleitores é igual a: " + eleitores);
		System.out.println("A porcentagem de votos brancos é igual a " + calcVotosBrancos + "%");
		System.out.println("A porcentagem de votos nulos é igual a " + calcVotosNulos + "%");
		System.out.println("A porcentagem de votos válidos é igual a " + calcVotosValidos + "%");
		sc.close();
	}
}
