package PDF_2_E1;

public class ListaDeLivros {

	public Livro[] livros;
	int cont;

	public ListaDeLivros(int quant) {
		cont = 0;
		livros = new Livro[quant];
	}

	public ListaDeLivros() {
		cont = 0;
		livros = new Livro[10];
	}

	public boolean cadastraLivro(Livro l) {
		for (int i = 0; i < cont; i++) {
			if (l.getCodigo().equals(livros[i].getCodigo())) {
				return false;
			}
		}

		for (int i = 0; i < cont; i++) {
			if (i < livros.length && livros[i] == null) {
				livros[i] = l;
				cont++;
				return true;
			}
		}
		return false;
	}

	public Livro buscaPorCodigo(String codigo) {

		for (int i = 0; i < cont; i++) {
			if (livros[i].getCodigo().equals(codigo)) {
				return livros[i];
			}
			return null;

		}

		return null;
	}

	public Livro buscaPorAutor(String autor) {

		for (int i = 0; i < cont; i++) {
			if (livros[i].getAutores().equals(autor)) {
				return livros[i];
			}
			return null;
		}
		return null;

	}

	public Livro excluiLivroPorcodigo(String cod) {

		for (int i = 0; i < cont; i++) {
			if (livros[i].getCodigo().equals(cod)) {
				Livro livro = livros[i];
				livros[i] = null;
				return livro;

			}
		}
		return null;
	}
}
