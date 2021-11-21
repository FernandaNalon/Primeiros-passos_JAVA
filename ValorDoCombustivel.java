/*Escreva um algoritmo que leia o número de litros vendidos e o tipo de combustível (codificado da
seguinte forma: A-álcool, G-gasolina), calcule e imprima o valor a ser pago pelo cliente sabendo-se
que o preço do litro da gasolina é R$ 3,30 e o preço do litro do álcool é R$ 2,90.*/

package exercicioApostila1;

import java.util.Scanner;

public class ValorDoCombustivel {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		double precoA = 0;
		double precoG = 0;
		double desconto = 0;
		double valorFinal = 0;
		
		System.out.print("Escolha o tipo de combustível que deseja: [A] - Álcool ou [G] - Gasolina ?");
		var combustivel = sc.next();
		System.out.print("Digite a quantidade de litros que deseja abastecer: ");
		int litros = sc.nextInt();
		
		if ((combustivel == "A") && (litros <= 20)) {
		    precoA = litros*2.90;
		    desconto = precoA*0.03;
		    valorFinal = (precoA-desconto);
		    System.out.println("O valor a ser pago SEM o desconto seria de: R$" + precoA + ". O valor de desconto sendo gerado é de: R$" + desconto + ". O valor final a ser pago é de: R$" + valorFinal + ".");
		} else if ((combustivel == "A") && (litros > 20)) {
		    precoA = litros*2.90;
		    desconto = precoA*0.05;
		    valorFinal = (precoA-desconto);
		    System.out.print("O valor a ser pago SEM o desconto seria de: R$" + precoA + ". O valor de desconto sendo gerado é de: R$" + desconto + ". O valor final a ser pago é de: R$" + valorFinal + ".");
		} else if ((combustivel == "G") && (litros <= 20)) {
		    precoG = litros*3.30;
		    desconto = precoG*0.04;
		    valorFinal = (precoG-desconto);
		    System.out.print("O valor a ser pago SEM o desconto seria de: R$" + precoG + ". O valor de desconto sendo gerado é de: R$" + desconto + ". O valor final a ser pago é de: R$" + valorFinal + ".");
		} else if ((combustivel == "G") && (litros > 20)) {
		    precoG = litros*3.30;
		    desconto = precoG*0.06;
		    valorFinal = (precoG-desconto);
		    System.out.print("O valor a ser pago SEM o desconto seria de: R$" + precoG + ". O valor de desconto sendo gerado é de: R$" + desconto + ". O valor final a ser pago é de: R$" + valorFinal + ",.");
		}
		sc.close();
	}
}
