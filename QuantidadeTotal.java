/*Faça um algoritmo para ler: a descrição do produto (nome), a quantidade adquirida e o preço
unitário. Calcular e escrever o total (total = quantidade adquirida * preço unitário), o desconto e o total
a pagar (total a pagar = total - desconto).*/

package exercicioApostila1;

import java.util.Scanner;

public class QuantidadeTotal {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Qual o produto a ser adquirido? ");
		var produto = sc.next();
		System.out.print("Digite a quantidade a ser adquirida: ");
		int quantidade = sc.nextInt();
		System.out.print("Digite o preço unitário do produto: ");
		double precoUnit = sc.nextDouble();
		
		double total = quantidade*precoUnit;
		double desconto = 0;
		
		if (quantidade <= 5) {
		    desconto = total*0.02;
		} else if (quantidade > 5 && quantidade <= 10) {
		    desconto = total*0.03;
		} else if (quantidade > 10) {
		    desconto = total*0.05;
		}
		
		double aPagar = total-desconto;
		System.out.println("O valor a ser pago comprando " + quantidade + " unidades de " +
		produto + " sem os descontos fica: R$" + total + ". Com os descontos aplicados o "
				+ "preço fica: R$" + aPagar);
		sc.close();
	}
}
