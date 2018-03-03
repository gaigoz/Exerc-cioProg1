package PDF_1_E3;

/**
 * Faça um programa que leia as dimensões de uma casa (largura e compri- mento)
 * e as dimensões de um terreno (largura e comprimento). A seguir, o programa
 * deve calcular e escrever a área da casa, a área do terreno e a área livre. O
 * cálculo de cada área deve ser realizado por um método.
 * 
 * @author vjagg
 *
 */
import java.util.Scanner;

public class Exer3 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);

		System.out.println("Digite a largura");
		double l = in.nextDouble();
		
		System.out.println("Digite o comprimento");
		double c = in.nextDouble();
		System.out.println(calculoDaArea(l,c));

	}

	public static double calculoDaArea(double largura, double comprimento) {
		double calculo = largura * comprimento;
		return calculo;
	}
}
