package exercicioApostila1;

import java.util.Scanner;

public class AreaCirculo {
	public static void main (String[]args) {
		Scanner sc = new Scanner(System.in);
		double pi = 3.14;
		System.out.print("Digite o valor do raio: ");
		float raio = sc.nextFloat();
		double area = pi*(raio*raio);
		System.out.print("A área do circulo é igual a: " + area + " cm²");
		sc.close();
	}
}
