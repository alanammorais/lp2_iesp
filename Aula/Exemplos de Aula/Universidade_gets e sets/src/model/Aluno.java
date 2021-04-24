package model;

public class Aluno {
	
	private String nome;
	private float cre;
	private String matricula;
	private String curso;
	
	public Aluno(String nome, String matricula, float cre, String curso) {
		this.nome = nome;
		this.matricula = matricula;
		this.cre = cre;
		this.curso = curso;
	}
	
	public Aluno() {}

	//GET
	public String getNome() {
		return this.nome; 
	} 
	
	//SET
	public void setNome(String n) {
		this.nome = n;
	}
	
	public float getCre() {
		return cre;
	}

	public void setCre(float cre) {
		this.cre = cre;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String toString() {
		return "Aluno - nome=" + this.nome + 
				", matricula=" + this.matricula + 
				", cre=" + this.cre + 
				", curso=" + this.curso;
	}
	

}
