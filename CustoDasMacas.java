// As ma��s custam R$ 1,30 cada se forem compradas menos de uma d�zia, e R$ 1,00 se forem 
// compradas pelo menos 12. Escreva um programa que leia o n�mero de ma��s compradas, calcule e 
// escreva o custo total da compra.

package exercicioApostila1;

import java.util.Scanner;

public class CustoDasMacas {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Digite a quantidade de ma��s que deseja: ");
		int macas = sc.nextInt();
		
		if (macas <= 11) {
			System.out.println("O valor a ser pago por " + macas + " unidades ser� de: R$" + (macas*1.30));
		} else if (macas >= 12) {
			System.out.println("O valor a ser pago por " + macas + " unidades ser� de: R$ " + (macas*1.0));
		}
		sc.close();
	}
}
