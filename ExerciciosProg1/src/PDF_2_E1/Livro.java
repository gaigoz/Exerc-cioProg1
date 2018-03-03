package PDF_2_E1;

public class Livro {

	String codigo;
	String titulo;
	double anoDePublica;
	String autores;
	
	public Livro(String codigo, String titulo, double anoDePublica, String autores) {
		this.codigo = codigo;
		this.titulo = titulo;
		this.anoDePublica = anoDePublica;
		this.autores = autores;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public double getAnoDePublica() {
		return anoDePublica;
	}

	public void setAnoDePublica(double anoDePublica) {
		this.anoDePublica = anoDePublica;
	}

	public String getAutores() {
		return autores;
	}

	public void setAutores(String autores) {
		this.autores = autores;
	}

	@Override
	public String toString() {
		return "Exer1 [codigo=" + codigo + ", titulo=" + titulo + ", anoDePublica=" + anoDePublica + ", autores="
				+ autores + "]";
	}
	
}
