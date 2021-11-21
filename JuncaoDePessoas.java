/*Escreva um algoritmo que leia as idades de 2 homens e de 2 mulheres (considere que as idades
dos homens serão sempre diferentes entre si, bem como as das mulheres). Calcule e escreva a soma
das idades do homem mais velho com a mulher mais nova, e o produto das idades do homem mais
novo com a mulher mais velha. */

package exercicioApostila1;

import java.util.Scanner;

public class JuncaoDePessoas {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int soma = 0;
		int mult = 0;
		
		System.out.print("Idade do primeiro homem: ");
		int homem1 = sc.nextInt();
		System.out.print("Idade do segundo homem: ");
		int homem2 = sc.nextInt();
		System.out.print("Idade da primeira mulher: ");
		int mulher1 = sc.nextInt();
		System.out.print("Idade da segunda mulher: ");
		int mulher2 = sc.nextInt();
		
		if (homem1 > homem2 && mulher1 > mulher2) {
			soma = homem1 + mulher2;
			mult = homem2*mulher1;
			System.out.print("A soma da idade do homem mais velho com a mulher mais nova é: " 
			+ soma + " e " + "o produto da idade do homem mais novo com a mulher mais velha "
					+ "é: " + mult + ".");
		} else if (homem1 < homem2 && mulher1 < mulher2) {
			soma = homem2 + mulher1;
			mult = homem1*mulher2;
			System.out.print("A soma da idade do homem mais velho com a mulher mais nova é: " 
					+ soma + " e " + "o produto da idade do homem mais novo com a mulher mais velha "
							+ "é: " + mult + ".");
		} else if (homem1 < homem2 && mulher1 > mulher2) {
			soma = homem2 + mulher2;
			mult = homem1*mulher1;
			System.out.print("A soma da idade do homem mais velho com a mulher mais nova é: " 
					+ soma + " e " + "o produto da idade do homem mais novo com a mulher mais velha "
							+ "é: " + mult + ".");
		} else if (homem1 > homem2 && mulher1 < mulher2) {
			soma = homem1 + mulher1;
			mult = homem2*mulher2;
			System.out.print("A soma da idade do homem mais velho com a mulher mais nova é: " 
					+ soma + " e " + "o produto da idade do homem mais novo com a mulher mais velha "
							+ "é: " + mult + ".");
		}
		
		
		
		
		sc.close();
	}
}
