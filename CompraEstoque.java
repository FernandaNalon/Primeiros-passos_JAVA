// Fa�a um algoritmo para ler: quantidade atual em estoque, quantidade m�xima em estoque e 
// quantidade m�nima em estoque de um produto. Calcular e escrever a quantidade m�dia ((quantidade 
// m�dia = quantidade m�xima + quantidade m�nima)/2). Se a quantidade em estoque for maior ou igual 
// a quantidade m�dia escrever a mensagem 'N�o efetuar compra', sen�o escrever a mensagem 'Efetuar 
// compra'. 

package exercicioApostila1;

import java.util.Scanner;

public class CompraEstoque {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Digite a quantidade atual em estoque: ");
		int estoqueA = sc.nextInt();
		System.out.print("Qual a quantidade m�xima para o estoque? ");
		int estoqueMax = sc.nextInt();
		System.out.print("Qual a quantidade m�nima para o estoque? ");
		int estoqueMin = sc.nextInt();
		
		double estoqueMedio = (estoqueMax+estoqueMin)/2;
		
		if (estoqueA >= estoqueMedio) {
			System.out.println("N�O EFETUAR COMPRA!");
		} else {
			System.out.println("EFETUAR COMPRA!");
		}
		
		sc.close();
	}
}
