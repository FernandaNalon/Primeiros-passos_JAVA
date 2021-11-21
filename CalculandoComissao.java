// Ler o sal�rio fixo e o valor das vendas efetuadas pelo vendedor de uma empresa. Sabendo-se que 
// ele recebe uma comiss�o de 3% sobre o total das vendas at� R$ 1.500,00 mais 5% sobre o que 
// ultrapassar este valor, calcular e escrever o seu sal�rio total. 

package exercicioApostila1;

import java.util.Scanner;

public class CalculandoComissao {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual o valor do sal�rio fixo: R$");
		double salarioFixo = sc.nextDouble();
		System.out.print("Qual o valor das vendas do funcion�rio: R$");
		double valorVendas = sc.nextDouble();
		
		double vendasNew = valorVendas*0.03;
		double calcVendas = valorVendas-1500;
		double vendasAcim = calcVendas*0.05;
		double base = 1500*0.03;
		
		if (valorVendas <= 1500) {
			System.out.println("O valor do seu sal�rio � de: R$" + salarioFixo + ". Com o acrescimo de suas vendas: R$" + valorVendas + 
					" e sua comiss�o de: R$" + vendasNew + ". Seu sal�rio final ser�: R$" + (salarioFixo+valorVendas+vendasNew));
		} else if (valorVendas > 1501) {
			System.out.println("O valor do seu sal�rio � de: R$ " + salarioFixo + ". Com o acrescimo de suas vendas: R$ " + valorVendas +
					", com sua 1a comiss�o: R$" + base + " e sua comiss�o acima dos 1.500 de 5%: R$" + vendasAcim + 
					". Logo seu sal�rio ser� igual �: R$" + (salarioFixo+valorVendas+base+vendasAcim));
		}
		sc.close();
	}

}
