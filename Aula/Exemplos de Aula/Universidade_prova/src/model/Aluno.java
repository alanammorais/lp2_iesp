package model;

public class Aluno {
	
	protected String nome;
	protected float cre;
	private String matricula;
	private String curso;
	
	public Aluno(String nome, String matricula, float cre, String curso) {
		this.nome = nome;
		this.matricula = matricula;
		this.cre = cre;
		this.curso = curso;
	}
	
	public Aluno() {}

	public String toString() {
		return "Aluno - nome=" + this.nome + 
				", matricula=" + this.matricula + 
				", cre=" + this.cre + 
				", curso=" + this.curso;
	}
	
	
	
	
	
	

}
