// Uma revendedora de carros usados paga a seus funcion�rios vendedores um sal�rio fixo 
// por m�s, mais uma comiss�o tamb�m fixa para cada carro vendido e mais 5% do valor 
// das vendas por ele efetuadas. Escrever um algoritmo que leia o n�mero de carros por 
// ele vendidos, o valor total de suas vendas, o sal�rio fixo e o valor que ele 
// recebe por carro vendido. Calcule e escreva o sal�rio final do vendedor. 

package exercicioApostila1;

import java.util.Scanner;

public class SalarioFinalVend {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Qual o sal�rio fixo do funcion�rio? ");
		double salarioFixo = sc.nextDouble();
		
		System.out.print("Qual o valor total de suas vendas? ");
		int valorTotVendas = sc.nextInt();

		System.out.print("Qual o n�mero de carros que o funcion�rio vendeu? ");
		int carrosVendidos = sc.nextInt();
		
		System.out.print("Qual o valor que recebe por carro? ");
		double comissaoCarro = sc.nextDouble();
		
		double comissaoFinal = carrosVendidos*comissaoCarro;
		double comissaoVendas = 0.05*valorTotVendas;
		
		double salarioFinal = salarioFixo + comissaoFinal + comissaoVendas;
		
		System.out.println("--------------------------");
		System.out.println("OL� FUNCION�RIO!");
		System.out.println("--------------------------");
		System.out.println("Seu sal�rio fixo � igual a: R$" + salarioFixo);
		System.out.println("Seu valor total de vendas foi de: R$" + valorTotVendas + ". Logo, "
				+ "recebendo 5% deste valor, tera uma comiss�o de: R$" + comissaoVendas);
		System.out.println("Voc� vendeu este m�s " + carrosVendidos + " carros. Ganhando o valor "
				+ "de R$" + comissaoCarro + " por ve�culo, ser� acrescido em seu sal�rio: R$" + comissaoFinal);
		
		System.out.println("Seu sal�rio este m�s ser� igual a: R$" + salarioFinal);		
		sc.close();
	}
}
