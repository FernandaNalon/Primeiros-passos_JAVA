package exercicioApostila1;

import java.util.Scanner;

public class AreaRetangulo {
	public static void main (String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a altura: ");
		float altura = sc.nextFloat();
		System.out.print("Digite a base: ");
		float base = sc.nextFloat();
		float area = altura*base;
		System.out.print("A �rea do ret�ngulo � igual a " + area + " cm�");
		sc.close();
	}
}
