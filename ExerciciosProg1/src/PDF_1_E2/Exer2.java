package PDF_1_E2;

import java.util.Scanner;

/**
 * 
 * Faça um programa que leia 3 valores e determine o maior deles. Use um
	método para encontrar o maior valor. 
 * @author vjaggi
 */
import java.util.Scanner;

public class Exer2 {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);

		System.out.println("Digite n1");
		double n1 = in.nextDouble();

		System.out.println("Digite n2");
		double n2 = in.nextDouble();

		System.out.println("Digite n3");
		double n3 = in.nextDouble();
		System.out.println(maiorValor(n1, n2, n3));
	}

	public static double maiorValor(double n1, double n2, double n3) {
		double maior = n1;
		if (maior < n2) {
			maior = n2;
		} 
		
		if (maior < n3) {
			maior = n3;
		}

		return maior;
	}
}
