package model;

public class Emprestimo {
	
	//atributos sempre são privativos
	private String dataLocacao;
	private Livro livroAluguel; //new
	private Pessoa pessoaAluguel;
	
	public Emprestimo(String data, Livro liv, Pessoa pes) {
		this.dataLocacao = data;
		this.livroAluguel = liv;
		this.pessoaAluguel = pes;
	}
	
	public String toString() {
		String saida = "Data:"+this.dataLocacao+
			  	"\nLivro Aluguel:"+ this.livroAluguel+
				"\nUsuário:"+ this.pessoaAluguel;
		return saida;
		
	}


}
