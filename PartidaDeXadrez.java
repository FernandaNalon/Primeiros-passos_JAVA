// Ler a hora de início e a hora de fim de um jogo de Xadrez (considere apenas horas inteiras, sem os 
// minutos) e calcule a duração do jogo em horas, sabendo-se que o tempo máximo de duração do jogo é 
// de 24 horas e que o jogo pode iniciar em um dia e terminar no dia seguinte. 

package exercicioApostila1;

import java.util.Scanner;

public class PartidaDeXadrez {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		
		System.out.print("Digite a hora de inicio da partida: ");
		int inicio = sc.nextInt();
		System.out.print("Digite a hora de término da partida: ");
		int fim = sc.nextInt();
		
		int maximo = 0;
		
		if (inicio < fim) {
			int duracao = fim-inicio;
			System.out.println("A duração do jogo foi de " + duracao + " horas.");
		} else if (inicio > fim) {
			int duracao2 = 24 - inicio + fim;
			System.out.println("A duração do jogo foi de " + duracao2 + " horas.");
		} else {
			System.out.println("A partida durou 24 horas? [1] SIM ou [2] NÃO");
			maximo = sc.nextInt();
		}
			
		if (maximo == 1) {
			System.out.println("A partida durou 24 horas.");
		} else if (maximo == 2) {
			System.out.println("A partida durou menos de 1 hora.");
		}
		sc.close();
	}
}
