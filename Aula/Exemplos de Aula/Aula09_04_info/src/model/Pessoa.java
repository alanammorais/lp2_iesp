package model;

public class Pessoa {
	
	private String nome;
	private String cpf;
	private String genero;
	private String telefone;
	private String endereco;
	
	public Pessoa(String nome, String cpf, String genero, String telefone, String endereco) {
		this.nome = nome;
		this.cpf = cpf;
		this.genero = genero;
		this.telefone = telefone;
		this.endereco = endereco;
	}
	
	public String info() {
		String saida = "\n\tNome: "+this.nome;
		return saida;
		
	}
	

}
