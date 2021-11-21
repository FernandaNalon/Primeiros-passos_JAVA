// Organizar um código com erros e fazê-lo funcionar.

package exercicioApostila1;

import java.util.Scanner;

public class PesoIdeal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double pesoIdeal = 0;
		
		System.out.print("Digite seu nome: ");
		var nome = sc.next();
		System.out.println("Digite seu gênero: [1] Maculino [2] Feminino");
		int genero = sc.nextInt();
		System.out.print("Qual sua altura? ");
		double altura = sc.nextDouble();
		
		if (genero == 1) {
			pesoIdeal = (72.7 * altura) - 58;
		} else if (genero == 2) {
			pesoIdeal = (62.1 * altura) - 44.7;
		}
		System.out.println("Olá, " + nome + ". O peso igual para seu gênero é igual a: " + pesoIdeal);
		sc.close();
	}

}
