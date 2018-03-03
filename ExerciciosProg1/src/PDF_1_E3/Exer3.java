package PDF_1_E3;

/**
 * Fa�a um programa que leia as dimens�es de uma casa (largura e compri- mento)
 * e as dimens�es de um terreno (largura e comprimento). A seguir, o programa
 * deve calcular e escrever a �rea da casa, a �rea do terreno e a �rea livre. O
 * c�lculo de cada �rea deve ser realizado por um m�todo.
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
