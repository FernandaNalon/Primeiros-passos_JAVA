// Fa�a um algoritmo para ler: n�mero da conta do cliente, saldo, d�bito e cr�dito. Ap�s, calcular e 
// escrever o saldo atual (saldo atual = saldo - d�bito + cr�dito). Tamb�m testar se saldo atual for maior 
// ou igual a zero escrever a mensagem 'Saldo Positivo', sen�o escrever a mensagem 'Saldo Negativo'.

package exercicioApostila1;

import java.util.Scanner;

public class AvaliacaoDeSaldo {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Digite o n�mero de sua conta: ");
		int conta = sc.nextInt();
		System.out.print("Digite o saldo de sua conta: ");
		double saldo = sc.nextDouble();
		System.out.print("Digite seu d�bito: ");
		double debito = sc.nextDouble();
		System.out.print("Digite seu cr�dito: ");
		double credito = sc.nextDouble();
		
		double saldoAtual = saldo-debito+credito;
		
		if (saldoAtual >= 0) {
			System.out.println("A conta: " + conta + " est� com SALDO POSITIVO!");
		} else if (saldoAtual <= -1) {
			System.out.println("A conta: " + conta + " est� com SALDO NEGATIVO!");
		}
		sc.close();
	}

}
