package model;

public class Aluno{
	
	private String nome;
	private Turma turma; //Composição
	private char sexo;
	
	public Aluno(String nome, Turma turma, char sexo) {
		this.nome = nome;
		this.turma = turma;
		this.sexo = sexo;
	}
	
	public Aluno() {}

	public void matricularAlunoTurma(Turma turma) {
		this.turma = turma;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Turma getTurma() {
		return turma;
	}

	public void setTurma(Turma turma) {
		this.turma = turma;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public String toString() {
		return "Aluno - nome=" + nome + ", turma=" + turma + ", sexo=" + sexo;
	}
	
	
	

}
