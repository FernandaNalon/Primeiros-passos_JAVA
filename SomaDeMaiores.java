//Ler 3 valores (considere que n�o ser�o informados valores iguais) e escrever a soma dos 2 maiores. 

package exercicioApostila1;

import java.util.Scanner;

public class SomaDeMaiores {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
	
		System.out.println("Digite um valor: ");
		int v1 = sc.nextInt();
		System.out.println("Digite o segundo valor: ");
		int v2 = sc.nextInt();
		System.out.println("Digite o terceiro valor: ");
		int v3 = sc.nextInt();
		
		if (v1 > v2 && v2 > v3) {
			System.out.print("Os dois maiores s�o: " + v1 + " e " + v2 + " e a soma deles � igual a: " + (v1+v2));
		} else if (v1 > v2 && v3 > v2) {
			System.out.print("Os dois maiores s�o: " + v1 + " e " + v3 + " e a soma deles � igual a: " + (v1+v3));
		} else if (v2 > v1 && v3 > v1) {
			System.out.print("Os dois maiores s�o: " + v2 + " e " + v3 + " e a soma deles � igual a: " + (v2+v3));
		}
		sc.close();
	}
}
