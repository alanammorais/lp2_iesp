package modelo;

public class Estudante {
	
	private String nome;
	private Endereco endereco; // COMPOSICAO
	
	//construtor
	public Estudante(String n, Endereco e) {
		this.endereco = e;
		this.nome = n;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco end) {
		this.endereco = end;
	}
	
	


}
