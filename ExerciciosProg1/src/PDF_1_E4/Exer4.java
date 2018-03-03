package PDF_1_E4;

/**
 * VER
 * 
 * Crie um programa que lê o tempo atual em hora, minuto e 4segundo, e o escreve
 * em segundos quanto tempo se passou desde que o dia começou. Essa conversão
 * deve ser calculada por um método.
 * 
 * @author vjagg
 *
 */
import java.util.Scanner;

public class Exer4 {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);

		System.out.println("Digite a hora");
		double hora = in.nextDouble();

		System.out.println("Digite o minuto");
		double minuto = in.nextDouble();

		System.out.println("Digite o segundo");
		double segundo = in.nextDouble();
		System.out.println(segundos(hora, minuto, segundo));
	}

	public static double segundos(double h, double m, double s) {
		double hora = h * 3600;
		double minuto = m * 60;
		return hora + minuto + s;

	}
}
