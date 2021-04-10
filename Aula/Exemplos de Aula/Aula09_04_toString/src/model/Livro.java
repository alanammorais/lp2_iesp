package model;

public class Livro {
	
	private String autor;
	private String nome;
	private String isbn;
	private String editora;
	
	public Livro(String aut, String nom, String isb, String edi) {
		this.autor = aut;
		this.nome = nom;
		this.isbn = isb;
		this.editora = edi;
	}
	
	public String toString() {
		String saida = "\n\tAutor: "+this.autor+
					  	"\n\tNome: "+this.nome+
						"\n\tISBN: "+this.isbn+
						"\n\tEditora: "+this.editora;
		return saida;
		
	}

}
