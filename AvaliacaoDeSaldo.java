// Faça um algoritmo para ler: número da conta do cliente, saldo, débito e crédito. Após, calcular e 
// escrever o saldo atual (saldo atual = saldo - débito + crédito). Também testar se saldo atual for maior 
// ou igual a zero escrever a mensagem 'Saldo Positivo', senão escrever a mensagem 'Saldo Negativo'.

package exercicioApostila1;

import java.util.Scanner;

public class AvaliacaoDeSaldo {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Digite o número de sua conta: ");
		int conta = sc.nextInt();
		System.out.print("Digite o saldo de sua conta: ");
		double saldo = sc.nextDouble();
		System.out.print("Digite seu débito: ");
		double debito = sc.nextDouble();
		System.out.print("Digite seu crédito: ");
		double credito = sc.nextDouble();
		
		double saldoAtual = saldo-debito+credito;
		
		if (saldoAtual >= 0) {
			System.out.println("A conta: " + conta + " está com SALDO POSITIVO!");
		} else if (saldoAtual <= -1) {
			System.out.println("A conta: " + conta + " está com SALDO NEGATIVO!");
		}
		sc.close();
	}

}
