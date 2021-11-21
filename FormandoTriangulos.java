/* Ler 3 valores (A, B e C) representando as medidas dos lados de um tri�ngulo e escrever se formam
ou n�o um tri�ngulo. OBS: para formar um tri�ngulo, o valor de cada lado deve ser menor que a soma
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
			System.out.println("Forma um tri�ngulo!");
		} else {
			System.out.println("N�o forma um tri�ngulo!");
		}
		sc.close();
	}
}
