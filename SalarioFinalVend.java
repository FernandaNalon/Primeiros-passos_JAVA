// Uma revendedora de carros usados paga a seus funcionários vendedores um salário fixo 
// por mês, mais uma comissão também fixa para cada carro vendido e mais 5% do valor 
// das vendas por ele efetuadas. Escrever um algoritmo que leia o número de carros por 
// ele vendidos, o valor total de suas vendas, o salário fixo e o valor que ele 
// recebe por carro vendido. Calcule e escreva o salário final do vendedor. 

package exercicioApostila1;

import java.util.Scanner;

public class SalarioFinalVend {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Qual o salário fixo do funcionário? ");
		double salarioFixo = sc.nextDouble();
		
		System.out.print("Qual o valor total de suas vendas? ");
		int valorTotVendas = sc.nextInt();

		System.out.print("Qual o número de carros que o funcionário vendeu? ");
		int carrosVendidos = sc.nextInt();
		
		System.out.print("Qual o valor que recebe por carro? ");
		double comissaoCarro = sc.nextDouble();
		
		double comissaoFinal = carrosVendidos*comissaoCarro;
		double comissaoVendas = 0.05*valorTotVendas;
		
		double salarioFinal = salarioFixo + comissaoFinal + comissaoVendas;
		
		System.out.println("--------------------------");
		System.out.println("OLÁ FUNCIONÁRIO!");
		System.out.println("--------------------------");
		System.out.println("Seu salário fixo é igual a: R$" + salarioFixo);
		System.out.println("Seu valor total de vendas foi de: R$" + valorTotVendas + ". Logo, "
				+ "recebendo 5% deste valor, tera uma comissão de: R$" + comissaoVendas);
		System.out.println("Você vendeu este mês " + carrosVendidos + " carros. Ganhando o valor "
				+ "de R$" + comissaoCarro + " por veículo, será acrescido em seu salário: R$" + comissaoFinal);
		
		System.out.println("Seu salário este mês será igual a: R$" + salarioFinal);		
		sc.close();
	}
}
