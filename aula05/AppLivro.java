package br.com.unit.aula05;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class AppLivro {

	public static void main(String[] args)throws ParseException {
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		
		
		Editora editora = new Editora(1, "Gato pingado", "contatogatopingado@gmail.com", "Recife", "PE");
		Editora editora2 = new Editora(2, "Sampa", "contatosampa@gmail.com", "S�o Paulo", "SP");
		
		Genero genero = new Genero(1, "Fic��o Cientifica");
		Genero genero2 = new Genero(2, "Romance");
		Genero genero3 = new Genero(3, "Com�dia");
		
		
		
		Date data = formato.parse("17/05/1968");
		
		Livro livro = new Livro(1, "O profundo do espa�o", "356", 302, data, genero, editora);
		
		
		Date data2 = formato.parse("18/05/1970");
		
		Livro livro2 = new Livro(2, "As cr�nicas de Barbara", "865", 366, data2, genero2, editora2);
		
		
		Date data3 = formato.parse("20/06/2000");
		
		Livro livro3 = new Livro(3, "As tran�as do rei careca", "447", 88, data3, genero, editora2);
		
		
		Date data4 = formato.parse("17/05/1968");
		
		Livro livro4 = new Livro(4, "Jumanji", "97", 35, data4, genero3, editora);
		
		
		
		Date data5 = formato.parse("17/05/1968");
		
		Livro livro5 = new Livro(5, "Rampage", "452", 322, data5, genero2, editora2);
		
		
		System.out.println("T�tulo: " +  livro.getTitulo());
		System.out.println("Genero: " +  livro.getGenero().getNomeGenero());
		System.out.println("Raz�o social: " +  livro.getEditora().getRazaoSocial());
		System.out.println("Cidade: " +  livro.getEditora().getCidade());
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		System.out.println("T�tulo: " +  livro2.getTitulo());
		System.out.println("Genero: " +  livro2.getGenero().getNomeGenero());
		System.out.println("Raz�o social: " +  livro2.getEditora().getRazaoSocial());
		System.out.println("Cidade: " +  livro2.getEditora().getCidade());
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		System.out.println("T�tulo: " +  livro3.getTitulo());
		System.out.println("Genero: " +  livro3.getGenero().getNomeGenero());
		System.out.println("Raz�o social: " +  livro3.getEditora().getRazaoSocial());
		System.out.println("Cidade: " +  livro3.getEditora().getCidade());
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		System.out.println("T�tulo: " +  livro4.getTitulo());
		System.out.println("Genero: " +  livro4.getGenero().getNomeGenero());
		System.out.println("Raz�o social: " +  livro4.getEditora().getRazaoSocial());
		System.out.println("Cidade: " +  livro4.getEditora().getCidade());
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		System.out.println("T�tulo: " +  livro5.getTitulo());
		System.out.println("Genero: " +  livro5.getGenero().getNomeGenero());
		System.out.println("Raz�o social: " +  livro5.getEditora().getRazaoSocial());
		System.out.println("Cidade: " +  livro5.getEditora().getCidade());
		
	}

}
