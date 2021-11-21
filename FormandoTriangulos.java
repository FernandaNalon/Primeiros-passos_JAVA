/* Ler 3 valores (A, B e C) representando as medidas dos lados de um triângulo e escrever se formam
ou não um triângulo. OBS: para formar um triângulo, o valor de cada lado deve ser menor que a soma
dos outros 2 lados. */

package exercicioApostila1;

import java.util.Scanner;

public class FormandoTriangulos {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o valor do primeiro lado: ");
		int A = sc.nextInt();
		System.out.println("Digite o valor do segundo lado: ");
		int B = sc.nextInt();
		System.out.println("Digite o valor do terceiro lado: ");
		int C = sc.nextInt();
		
		if (A<B+C && B<A+C && C<A+B) {
			System.out.println("Forma um triângulo!");
		} else {
			System.out.println("Não forma um triângulo!");
		}
		sc.close();
	}
}
