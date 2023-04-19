package br.com.unit.aula05;
import java.util.Date;

public class Livro {
	private int idLivro;
	private String titulo;
	private String ISBN;
	private int numeroPaginas;
	private Date dataLancamento;
	private Genero genero;
	private Editora editora;
	
	public Livro(int idLivro, String titulo, String ISBN, int numeroPaginas, Date dataLancamento, Genero genero, Editora editora) {
			this.idLivro = idLivro;
			this.titulo = titulo;
			this.ISBN = ISBN;
			this.numeroPaginas = numeroPaginas;
			this.dataLancamento = dataLancamento;
			this.genero = genero;
			this.editora = editora;
	}

	public int getIdLivro() {
		return idLivro;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public int getNumeroPaginas() {
		return numeroPaginas;
	}

	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}

	public Date getDataLancamento() {
		return dataLancamento;
	}

	public void setDataLancamento(Date dataLancamento) {
		this.dataLancamento = dataLancamento;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public Editora getEditora() {
		return editora;
	}

	public void setEditora(Editora editora) {
		this.editora = editora;
	}
	
	
	
}	
