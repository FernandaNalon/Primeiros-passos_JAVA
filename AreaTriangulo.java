package exercicioApostila1;

import java.util.Scanner;

public class AreaTriangulo {
	public static void main (String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o valor da altura: ");
		float altura = sc.nextFloat();
		System.out.print("Digite o valor da base: ");
		float base = sc.nextFloat();
		float area = (base*altura)/2;
		System.out.print("A �rea do triangulo ser�: " + area + " cm�");
		sc.close();
	}
}
