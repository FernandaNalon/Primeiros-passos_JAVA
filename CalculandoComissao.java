// Ler o salário fixo e o valor das vendas efetuadas pelo vendedor de uma empresa. Sabendo-se que 
// ele recebe uma comissão de 3% sobre o total das vendas até R$ 1.500,00 mais 5% sobre o que 
// ultrapassar este valor, calcular e escrever o seu salário total. 

package exercicioApostila1;

import java.util.Scanner;

public class CalculandoComissao {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual o valor do salário fixo: R$");
		double salarioFixo = sc.nextDouble();
		System.out.print("Qual o valor das vendas do funcionário: R$");
		double valorVendas = sc.nextDouble();
		
		double vendasNew = valorVendas*0.03;
		double calcVendas = valorVendas-1500;
		double vendasAcim = calcVendas*0.05;
		double base = 1500*0.03;
		
		if (valorVendas <= 1500) {
			System.out.println("O valor do seu salário é de: R$" + salarioFixo + ". Com o acrescimo de suas vendas: R$" + valorVendas + 
					" e sua comissão de: R$" + vendasNew + ". Seu salário final será: R$" + (salarioFixo+valorVendas+vendasNew));
		} else if (valorVendas > 1501) {
			System.out.println("O valor do seu salário é de: R$ " + salarioFixo + ". Com o acrescimo de suas vendas: R$ " + valorVendas +
					", com sua 1a comissão: R$" + base + " e sua comissão acima dos 1.500 de 5%: R$" + vendasAcim + 
					". Logo seu salário será igual à: R$" + (salarioFixo+valorVendas+base+vendasAcim));
		}
		sc.close();
	}

}
