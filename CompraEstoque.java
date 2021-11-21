// Faça um algoritmo para ler: quantidade atual em estoque, quantidade máxima em estoque e 
// quantidade mínima em estoque de um produto. Calcular e escrever a quantidade média ((quantidade 
// média = quantidade máxima + quantidade mínima)/2). Se a quantidade em estoque for maior ou igual 
// a quantidade média escrever a mensagem 'Não efetuar compra', senão escrever a mensagem 'Efetuar 
// compra'. 

package exercicioApostila1;

import java.util.Scanner;

public class CompraEstoque {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Digite a quantidade atual em estoque: ");
		int estoqueA = sc.nextInt();
		System.out.print("Qual a quantidade máxima para o estoque? ");
		int estoqueMax = sc.nextInt();
		System.out.print("Qual a quantidade mínima para o estoque? ");
		int estoqueMin = sc.nextInt();
		
		double estoqueMedio = (estoqueMax+estoqueMin)/2;
		
		if (estoqueA >= estoqueMedio) {
			System.out.println("NÃO EFETUAR COMPRA!");
		} else {
			System.out.println("EFETUAR COMPRA!");
		}
		
		sc.close();
	}
}
