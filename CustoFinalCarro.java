// O custo de um carro novo ao consumidor é a soma do custo de fábrica com a 
// porcentagem do distribuidor e dos impostos (aplicados ao custo de fábrica). 
// Supondo que o percentual do distribuidor seja de 28% e os impostos de 45%, 
// escrever um algoritmo para ler o custo de fábrica de um carro, calcular e 
// escrever o custo final ao consumidor.
 
package exercicioApostila1;

import java.util.Scanner;

public class CustoFinalCarro {
	public static void main (String[]args) {
		Scanner sc = new Scanner(System.in);
			
		System.out.print("Digite o custo de fábrica de um carro: R$");
		double custoFabrica = sc.nextDouble();
		
		double distribuidor = 0.28*custoFabrica;
		double imposto = 0.45*custoFabrica;
		double valorTotal = custoFabrica+distribuidor+imposto;
		
		System.out.print("O preço do carro com os ajustes financeiros "
				+ "será igual a: R$" + valorTotal);
		sc.close();
	}
}
