/*Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra ultrapassar R$ 25,00, receberá
ainda um desconto de 10% sobre este total. Escreva um algoritmo para ler a quantidade (em Kg) de
morangos e a quantidade (em Kg) de maças adquiridas e escreva o valor a ser pago pelo cliente. */

package exercicioApostila1;

import java.util.Scanner;

public class MorangosEMacas {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		double subTotal = 0;
		double totalKg = 0;
		double morangoKg = 0;
		double macaKg = 0;
		
		System.out.print("Digite a quantidade comprada (em KG) de morangos: ");
		double morango = sc.nextDouble();
		System.out.print("Digite a quantidade comprada (em KG) de maçãs: ");
		double maca = sc.nextDouble();
		
		if (morango <= 5 && maca <= 5) {
		    morangoKg = morango*2.5;
		    macaKg = maca*1.8;
		    subTotal = morangoKg+macaKg;
		    totalKg = morango + maca;
		    System.out.println("O valor dos morangos será de: R$ " + morangoKg + ". "
		    		+ "O valor das maçãs será de: R$ " + macaKg + " e o valor sem "
		    				+ "desconto a ser pago será de: R$ " + subTotal);
		} else if (morango > 5 && maca > 5) {
			morangoKg = morango * 2.2;
		    macaKg = maca * 1.5;
		    subTotal = morangoKg + macaKg;
		    totalKg = morango + maca;
		    System.out.println("O valor dos morangos será de: R$ " + morangoKg + ". "
		    		+ "O valor das maçãs será de: R$ " + macaKg + " e o valor sem "
		    				+ "desconto a ser pago será de: R$ " + subTotal);
		} else if (morango > 5 && maca <= 5) {
			morangoKg = morango * 2.2;
		    macaKg = maca * 1.8;
		    subTotal = morangoKg + macaKg;
		    totalKg = morango + maca;
		    System.out.println("O valor dos morangos será de: R$ " + morangoKg + ". "
		    		+ "O valor das maçãs será de: R$ " + macaKg + " e o valor sem "
		    				+ "desconto a ser pago será de: R$ " + subTotal);
		} else if (morango <= 5 && maca > 5) {
			morangoKg = morango * 2.5;
		    macaKg = maca * 1.5;
		    subTotal = morangoKg + macaKg;
		    totalKg = morango + maca;
		    System.out.println("O valor dos morangos será de: R$ " + morangoKg + ". "
		    		+ "O valor das maçãs será de: R$ " + macaKg + " e o valor sem "
		    				+ "desconto a ser pago será de: R$ " + subTotal);
		}
		
		if (totalKg > 8 || subTotal > 25) {
			double total = subTotal - (subTotal*0.10);
			System.out.print("O valor total a ser pago COM desconto será de: R$" + total);
		}
		sc.close();
	}
}
