/*Faça um algoritmo para ler um número que é um código de usuário. Caso este código seja
diferente de um código armazenado internamente no algoritmo (igual a 1234) deve ser apresentada a
mensagem ‘Usuário inválido!’. Caso o Código seja correto, deve ser lido outro valor que é a senha. Se
esta senha estiver incorreta (a certa é 9999) deve ser mostrada a mensagem ‘senha incorreta’. Caso a
senha esteja correta, deve ser mostrada a mensagem ‘Acesso permitido’.*/

package exercicioApostila1;

import java.util.Scanner;

public class AcessoUsuario {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int senha = 0;
		
		System.out.println("Digite o usuário: ");
		int usuario = sc.nextInt();
		
		if (usuario != 1234) {
			System.out.println("Usuário invalido! Tente novamente.");
		} else {
			System.out.println("Bem-vindo!");
			System.out.println("Digite sua senha: ");
			senha = sc.nextInt();
		}
		
		if (senha != 9999) {
			System.out.println("Senha inválida! Tente novamente.");
		} else if (senha == 9999) {
			System.out.println("Acesso permitido!");
		}
		sc.close();
	}
}
