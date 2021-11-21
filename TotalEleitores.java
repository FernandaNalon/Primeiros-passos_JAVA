// Escreva um algoritmo para ler o n�mero total de eleitores de um 
// munic�pio, o n�mero de votos brancos, nulos e v�lidos. 
// Calcular e escrever o percentual que cada um representa em rela��o 
// ao total de eleitores. 

package exercicioApostila1;

import java.util.Scanner;

public class TotalEleitores {
	public static void main (String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o n�mero total de eleitores: ");
		int eleitores = sc.nextInt();
		System.out.print("Digite o n�mero de votos brancos: ");
		float votosBrancos = sc.nextInt();
		System.out.print("Digite o n�mero de votos nulos: ");
		float votosNulos = sc.nextInt();
		System.out.print("Digite o n�mero de votos v�lidos: ");
		float votosValidos = sc.nextInt();
		
		float calcVotosBrancos = (votosBrancos/100)*eleitores;
		float calcVotosNulos = (votosNulos/100)*eleitores;
		float calcVotosValidos = (votosValidos/100)*eleitores;
		
		System.out.println("O n�mero total de eleitores � igual a: " + eleitores);
		System.out.println("A porcentagem de votos brancos � igual a " + calcVotosBrancos + "%");
		System.out.println("A porcentagem de votos nulos � igual a " + calcVotosNulos + "%");
		System.out.println("A porcentagem de votos v�lidos � igual a " + calcVotosValidos + "%");
		sc.close();
	}
}
