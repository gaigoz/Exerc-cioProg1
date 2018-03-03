package PDF_2_E1;

import java.util.Scanner;

public class Aplicacao {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		ListaDeLivros  cad = new ListaDeLivros(5);
		Livro li = new Livro("123", "A vida de Israel",2018,"Israel");
		Livro l2 = new Livro("123", "A vida de Vinicius",2018,"Israel");
		Livro l3 = new Livro("123", "A vida de Sabrina",2018,"Israel");
		Livro l4 = new Livro("123", "A vida de Carol",2018,"Israel");
		Livro l5 = new Livro("123", "A vida de Julia",2018,"Israel");
		Livro l6 = new Livro("123", "A vida de Caio",2018,"Israel");
		
		cad.cadastraLivro(li);
		cad.cadastraLivro(l2);
		cad.cadastraLivro(l3);
		cad.cadastraLivro(l4);
		cad.cadastraLivro(l5);
		cad.cadastraLivro(l6);
		
		System.out.println(cad.buscaPorCodigo("123"));
		
	}
}
