package PDF_1_E1;

/**
 * Faça um programa que leia 3 valores, calcule e escreva a média aritmética
   desses valores. A média deve ser calculada por um método. 
 */


import java.util.Scanner;

public class Exer1 {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);

		System.out.println("Digite n1");
		double n1 = in.nextDouble();

		System.out.println("Digite n2");
		double n2 = in.nextDouble();

		System.out.println("Digite n3");
		double n3 = in.nextDouble();
		System.out.println(media(n1, n2, n3));
	}

	public static double media(double n1, double n2, double n3) {
		double media = (n1 + n2 + n3) / 3;

		return media;
	}
}
